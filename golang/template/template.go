package template

import "fmt"

type Downloader interface {
	Download(uri string)
}

//模板接口
type template interface {
	download()
	save()
}

type Sample struct {
	template
	uri string
}

func newSample(t template) *Sample {
	return &Sample{template: t}
}

//默认的保存方法
func (*Sample) save() {
	fmt.Println("default save")
}

//Sample实现了Downloader
//所以HTTPDownloader和FTPDownloader都实现了Downloader
func (t *Sample) Download(uri string) {
	t.uri = uri
	fmt.Println("prepare downloading")
	//执行模板方法
	t.template.download()
	t.template.save()
	fmt.Println("finish downloading")
}

type HTTPDownloader struct {
	*Sample
}

func NewHTTPDownloader() Downloader {
	//互相嵌套
	dl := &HTTPDownloader{}
	sample := newSample(dl)
	dl.Sample = sample
	return dl
}

func (d *HTTPDownloader) download() {
	fmt.Printf("download %s vis http\n", d.uri)
}

func (d *HTTPDownloader) save() {
	fmt.Println("http save")
}

//save方法会调用*sample的方法集
type FTPDownloader struct {
	*Sample
}

func NewFTPDownloader() Downloader {
	dl := &FTPDownloader{}
	sample := newSample(dl)
	dl.Sample = sample
	return dl
}

func (d *FTPDownloader) download() {
	fmt.Printf("download %s via ftp\n", d.uri)
}

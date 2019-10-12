package template

import "testing"

func TestNewFTPDownloader(t *testing.T) {
	var downloader Downloader = NewFTPDownloader()
	downloader.Download("ftp://example.com/abc.zip")
	// prepare downloading
	// download ftp://example.com/abc.zip via ftp
	// default save
	// finish downloading
}

func TestNewHTTPDownloader(t *testing.T) {
	var downloader Downloader = NewHTTPDownloader()
	downloader.Download("http://example.com/abc.zip")
	// prepare downloading
	// download http://example.com/abc.zip via http
	// http save
	// finish downloading
}

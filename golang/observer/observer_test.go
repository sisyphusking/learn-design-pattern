package observer

import "testing"

func TestNewNewsReporter(t *testing.T) {

	news := News{}

	zhangsan := NewNewsReporter("zhangsan")
	news.Focus(zhangsan)

	lisi := NewNewsReporter("lisi")
	news.Focus(lisi)

	news.Happen("something A has happened")
	news.Ignore(lisi)
	news.Happen("something B has happened")

}

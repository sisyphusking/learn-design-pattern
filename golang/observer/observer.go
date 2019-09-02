package observer

import "fmt"

type Reporter interface {
	report(string)
}

type NewReporter struct {
	name string
}

func NewNewsReporter(name string) NewReporter {
	return NewReporter{name: name}
}

func (reporter NewReporter) report(event string) {
	fmt.Println(reporter.name + " report an event: " + event)
}

type News struct {
	reporters []Reporter
}

func (news News) Happen(event string) {
	for _, reporter := range news.reporters {
		reporter.report(event)
	}
}

func (news News) Focus(reporter Reporter) {
	news.reporters = append(news.reporters, reporter)
}

func (news News) Ignore(reporter Reporter) {
	for index, newsReporter := range news.reporters {
		if newsReporter == reporter {
			news.reporters = append(news.reporters[:index], news.reporters[index+1:]...)
		}
	}
}

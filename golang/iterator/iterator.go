package iterator

import "fmt"

type Aggregate interface {
	Iterator() Iterator
}

type Iterator interface {
	First()
	IsDone() bool
	Next() interface{}
}

type Numbers struct {
	start, end int
}

func NewNumbers(start, end int) *Numbers {
	return &Numbers{
		start: start,
		end:   end,
	}
}

func (n *Numbers) Iterator() Iterator {
	return &NumbersIterator{
		numbers: n,
		next:    n.start,
	}
}

type NumbersIterator struct {
	numbers *Numbers
	next    int
}

func (n *NumbersIterator) First() {
	n.next = n.numbers.start
}

func (n *NumbersIterator) IsDone() bool {
	return n.next > n.numbers.end
}

func (n *NumbersIterator) Next() interface{} {
	if !n.IsDone() {
		next := n.next
		n.next++
		return next
	}
	return nil
}

//迭代器打印
func Print(i Iterator) {
	for i.First(); !i.IsDone(); {
		c := i.Next()
		fmt.Printf("%#v\n", c)
	}
}

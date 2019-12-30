package iterator

import "testing"

func TestIterator(t *testing.T) {
	var agg Aggregate
	agg = NewNumbers(1, 10)

	Print(agg.Iterator())
}

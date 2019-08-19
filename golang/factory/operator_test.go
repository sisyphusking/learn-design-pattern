package factory

import "testing"

func TestOperator(t *testing.T) {
	var (
		factory OperatorFactory
	)
	factory = PlusOperatoryFactory{}
	if compute(factory, 1, 3) != 4 {
		t.Fatal("error with plus factory method")

	}

	factory = MinusOperatorFactory{}
	if compute(factory, 3, 2) != 1 {
		t.Fatal("error with minus factory method")
	}
}

func compute(factory OperatorFactory, a, b int) int {
	op := factory.Create()
	op.SetA(a)
	op.SetB(b)
	return op.Result()
}

package factory

type Operator interface {
	SetA(int)
	SetB(int)
	Result() int
}

type OperatorFactory interface {
	Create() Operator
}

//将赋值的struct抽离出来，然后以匿名方式组合到PlusOperator和MinusOperator中
type OperatorBase struct {
	a, b int
}

func (o *OperatorBase) SetA(a int) {
	o.a = a
}

func (o *OperatorBase) SetB(b int) {
	o.b = b
}

//加法的抽象工厂
type PlusOperatoryFactory struct{}

//实现了OperatorFactory接口
func (PlusOperatoryFactory) Create() Operator {
	return &PlusOperator{
		OperatorBase: &OperatorBase{},
	}
}

type PlusOperator struct {
	*OperatorBase
}

//加上*OperatorBase，实现了Operator接口
func (o PlusOperator) Result() int {
	return o.a + o.b
}

type MinusOperatorFactory struct{}

func (MinusOperatorFactory) Create() Operator {
	return &MinusOperator{
		OperatorBase: &OperatorBase{},
	}
}

type MinusOperator struct {
	*OperatorBase
}

func (o MinusOperator) Result() int {
	return o.a - o.b
}

package builder

import "fmt"

type builder struct {
	style
}

func (builder builder) Build() string {
	fmt.Println("A building with " + builder.roof() + ", " + builder.gate())
	return builder.roof() + "," + builder.gate()
}

func newBuilder(style style) builder {
	return builder{style: style}
}

type style interface {
	roof() string
	gate() string
}

type ChineseType struct {
}

func (ChineseType) roof() string {
	return "golden roof"
}

func (ChineseType) gate() string {
	return "red gate"
}

type ItalianType struct {
}

func (ItalianType) roof() string {
	return "white round roof"
}

func (ItalianType) gate() string {
	return "white gate"
}

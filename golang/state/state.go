package state

import "fmt"

type Stage interface {
	water()
	harvest()
}

//幼苗状态
type seedling struct {
}

func (seedling) water() {
	fmt.Println("the plant is growing")
}

func (seedling) harvest() {
	fmt.Println("the plant is just planted")
}

//开花状态
type bloom struct {
}

func (bloom) water() {
	fmt.Println("the plant is ripping")
}

func (bloom) harvest() {
	fmt.Println("the plant is blooming, don't do that!")
}

//成熟状态
type maturity struct {
}

func (maturity) water() {
	fmt.Println("the plant don't need water!")
}

func (maturity) harvest() {
	fmt.Println("you got lots of fruits")
}

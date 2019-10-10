package state

import "testing"

func TestNewFruit(t *testing.T) {
	fruit := NewFruit()
	fruit.Harvest() // The plant is just planted！
	fruit.Water()   // The plant is growing!
	fruit.Harvest() // The plant is blooming, don't do that！
	fruit.Water()   // The plant is ripping!
	fruit.Water()   // The plant don't need water!
}

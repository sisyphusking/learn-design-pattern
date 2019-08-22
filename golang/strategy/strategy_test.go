package strategy

import "testing"

func TestNewPaymentContext(t *testing.T) {
	ctx := NewPaymentContext("xavier", "0700", 666, &Cash{})
	ctx.Pay()

	ctx = NewPaymentContext("xingwei", "0701", 888, &Bank{})
	ctx.Pay()

}

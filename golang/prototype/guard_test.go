package prototype

import "testing"

func TestNewhonorGuard(t *testing.T) {
	guard := NewhonorGuard(18, 180, 72, "m")
	zhangsan := guard.Clone()
	zhangsan.SetName("zhangsan")
	t.Log(zhangsan)

	lisi := guard.Clone()
	lisi.SetName("lisi")
	t.Log(lisi)
	t.Log(guard)

}

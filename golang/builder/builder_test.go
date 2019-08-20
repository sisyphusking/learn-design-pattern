package builder

import "testing"

func TestBuilder_Build(t *testing.T) {
	//先创建一个建筑师
	chineseBuilder := newBuilder(ChineseType{})
	//建筑师建造不同类型的建筑
	s := chineseBuilder.Build()
	if s != "golden roof,red gate" {
		t.Fatal("chineseBuilder error.")
	}

	italianBuilder := newBuilder(ItalianType{})
	i := italianBuilder.Build()
	if i != "white round roof,white gate" {
		t.Fatal("italianBuilder error")
	}

}

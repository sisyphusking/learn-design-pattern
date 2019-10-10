package state

type fruit struct {
	stage Stage
}

func NewFruit() fruit {
	//幼苗状态开始
	seedling := seedling{}
	fruit := fruit{seedling}
	return fruit
}

func (f *fruit) Water() {
	f.stage.water()
	if _, ok := (f.stage).(seedling); ok {
		bloom := bloom{}
		f.stage = bloom
	} else {
		maturity := maturity{}
		f.stage = maturity
	}
}

func (f *fruit) Harvest() {
	f.stage.harvest()
	if _, ok := f.stage.(maturity); ok {
		seedling := seedling{}
		f.stage = seedling
	}
}

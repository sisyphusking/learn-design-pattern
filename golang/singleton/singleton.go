package singleton

import "sync"

type Singleton struct{}

var singleton *Singleton
var once sync.Once

//使用once.Do保证同一时间只能有一个线程操作变量
//此处也可以使用sync.Mutex来加锁，但是没有once.Do优雅
func GetInstance() *Singleton {
	once.Do(func() {
		singleton = &Singleton{}
	})
	return singleton
}

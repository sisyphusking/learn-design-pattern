### 观察者模式

一个目标对象管理所有相依于它的观察者对象，并且在它本身的状态改变时主动发出通知。这通常透过呼叫各观察者所提供的方法来实现。此种模式通常被用来实时事件处理系统。

场景
- 一个主题，多个观察者，主题的任何变动，观察者都要第一时刻得到；
- 观察者获取主题变化困难，定时不及时，轮询消耗大；
- 观察者可以随时停止关注某主题；

实现
- 张三和李四都是记者，他们需要及时报道发生的新闻
- 首先他们要注册自己的信息，当新闻发生时，遍历他们的注册信息，逐个通知
- 某天，李四离职了，当新闻发生时，以后只通知了张三来报道新闻

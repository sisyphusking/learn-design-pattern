### 命令模式

命令模式本质是把某个对象的方法调用封装到对象中，方便传递、存储、调用。

示例中把主板单中的启动(start)方法和重启(reboot)方法封装为命令对象，再传递到主机(box)对象中。与两个按钮进行绑定：

- 第一个机箱(box1)设置按钮1(buttion1) 为开机，按钮2(buttion2)为重启。
- 第二个机箱(box1)设置按钮2(buttion2) 为开机，按钮1(buttion1)为重启。
从而得到配置灵活性。

除了配置灵活外，使用命令模式还可以用作：

- 批处理
- 任务队列
- undo, redo等把具体命令封装到对象中使用的场合
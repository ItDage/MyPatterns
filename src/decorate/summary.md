##装饰模式
1. 优点:把类中的装饰功能从类中搬移去除,这样可以简化原有的类。有效地把类的核心职责和装饰功能区分开了。而且可以去除相关类中重复的装饰逻辑
2. UML图![](https://i.imgur.com/WZWrUVV.png)
3. Component是定义的一个对象接口,可以给这些对象动态地添加职责。ConcreteComponent是定义的一个具体的对象,也可以给这个对象添加一些职责。Decorator,装饰抽象类,继承了Component,从外类来扩展Component类的功能,但对于Component来说,是无需知道Decorator存在的。至于ConcreteDecorator就是具体的装饰对象,起到了给Component添加职责的功能。
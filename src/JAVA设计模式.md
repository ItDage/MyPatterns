##JAVA设计模式
1. 创建型<ul><li>工厂方法模式<li>抽象工厂模式</li><li>单例模式</li><li>建造者模式</li><li>原型模式</li></li></ul>
2. 行为型<ul><li>责任链模式</li><li>命令模式</li><li>解释器模式</li><li>迭代器模式</li><li>中介者模式</li><li>备忘录模式</li><li>观察者模式</li><li>状态模式</li><li>策略模式</li><li>模板方法</li><li>访问者模式</li></ul>
3. 结构型<ul><li>适配器模式</li><li>组合模式</li><li>代理模式</li><li>享元模式</li><li>外观模式</li><li>桥接模式</li><li>装饰模式</li></ul>
###创建型
1. 单例模式:保证一个类仅有一个实例,并提供一个访问它的全局访问点。
	<pre><code>
	package creater;
	
	public class Singleton {
		
		private Singleton(){};
		
		private static class SingletonBuild{
			private static Singleton singleton = new Singleton();
		}
		
		private static Singleton getSingleton(){
			return SingletonBuild.singleton;
		}
		
		public static void main(String[] args) {
			System.out.println(Singleton.getSingleton());
		}
	}
	</code></pre>
2. 工厂模式
<ul><li>意图:定义一个创建对象的接口,让其子类自己决定实例化哪一个工厂类,工厂模式使其创建过程延迟到子类进行。</li><li>主要解决:主要解决接口选择的问题。<li><span style='font-weight:bold'>何时使用:我们明确地计划不同条件下创建不同实例时。(Hibernate 换数据库只需换方言和驱动就可以。)</span></li></li><li>优点:1、一个调用者想创建一个对象,只需要知道名称就可以了。2、扩展性高,如果想增加一个产品,只需要扩展一个工厂类就可以。3、屏蔽了产品的具体实现,调用者只关心产品的接口</li><li>缺点:每次增加一个产品时,都需要增加一个具体类和对象实现工厂,使得系统中的类的个数成倍增加,在一定程度上增加了系统的复杂度,同时也增加了系统具体的依赖。</li><li>使用场景:数据库连接。2、设计一个连接服务器的框架,需要三个协议,pop3、imap、http可以把这三个作为产品类,共同实现一个借口。</li></ul>
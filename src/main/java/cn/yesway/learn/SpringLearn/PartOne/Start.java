package cn.yesway.learn.SpringLearn.PartOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;

public class Start {
	public static void main(String[] args) {

		// ioc解耦-构造注入
		// App app = new App(new IocInterfaceImpl());
		// App app = new App(new IocInterfaceSImpl());
		// app.say();

		// // ioc解耦-属性注入
		// App app = new App();
		// app.setIoc(new IocInterfaceImpl());
		// // app.setIoc(new IocInterfaceSImpl());
		// app.say();

		// ioc解耦-注入+反射
		// IocInterface ioc;
		// try {
		// Class iocClass =
		// Class.forName("cn.yesway.learn.SpringLearn.PartOne.Service.Impl.IocInterfaceImpl");
		// ioc = (IocInterfaceImpl) iocClass.newInstance();
		// App app = new App(ioc);
		// app.say();
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// } catch (InstantiationException e) {
		// e.printStackTrace();
		// } catch (IllegalAccessException e) {
		// e.printStackTrace();
		// }

		// Spring配置bean
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		App app = new App(applicationContext.getBean("IocInterfaceImpl", IocInterface.class));
//		app.say();
		
//		App app = new App();
//		app.setIoc(applicationContext.getBean("IocInterfaceSImpl", IocInterface.class));
//		app.say();
	}
}

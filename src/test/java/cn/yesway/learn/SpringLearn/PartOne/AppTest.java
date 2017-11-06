package cn.yesway.learn.SpringLearn.PartOne;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;
import cn.yesway.learn.SpringLearn.PartOne.Service.Impl.IocInterfaceImpl;
import cn.yesway.learn.SpringLearn.PartOne.Service.Impl.IocInterfaceSImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:/applicationContext.xml" })
public class AppTest extends TestCase {
	@Autowired
	App app;
	@Autowired
	IocInterfaceImpl impl;

	@Test
	public void testSay() {

		// //ioc解耦-构造注入
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
		
		app.setIoc(impl);
		app.say();
	}

}

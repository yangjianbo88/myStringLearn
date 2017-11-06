package cn.yesway.learn.SpringLearn.PartOne;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;

/**
 * 测试APP类
 * 
 * @ClassName: App
 * @Description: 类描述
 * @Author: yangjianbo
 * @Date: 2017年11月6日 上午11:11:59
 */
// @Configuration
// @ComponentScan
@Component
public class App {
	// 第一版
	// public static void main( String[] args )
	// {
	// IocInterface ioc = new IocInterfaceImpl();
	// System.out.println(ioc.say());
	// }

//	// 构造器注入
//	private IocInterface ioc;
//
//	public App(IocInterface ioc) {
//		this.ioc = ioc;
//	}
//
//	public void say() {
//		System.out.println(ioc.say());
//	}

	 // 属性注入
	 private IocInterface ioc;
	
	 public void setIoc(IocInterface ioc) {
	 this.ioc = ioc;
	 }
	 public void say() {
	 System.out.println(ioc.say());
	 }
}

package cn.yesway.learn.SpringLearn.PartOne.Service.Impl;

import org.springframework.stereotype.Component;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;
@Component
public class IocInterfaceSImpl implements IocInterface {

	@Override
	public String say() {
		return "I'm SImpl";
	}

}

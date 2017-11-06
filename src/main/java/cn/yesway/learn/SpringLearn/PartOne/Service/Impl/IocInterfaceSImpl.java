package cn.yesway.learn.SpringLearn.PartOne.Service.Impl;

import cn.yesway.learn.SpringLearn.PartOne.Service.IocInterface;

public class IocInterfaceSImpl implements IocInterface {

	@Override
	public String say() {
		return "I'm SImpl";
	}

}

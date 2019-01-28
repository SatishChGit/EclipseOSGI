package helloservice.sample.impl;

import helloservice.sample.IHelloService;

public class HelloServiceImpl implements IHelloService {

	@Override
	public String sayHi() {
		System.out.println("Hi from hi service");
		return "Hi";
	}

}

package helloservice.servicefactory;

import org.osgi.framework.Bundle;
import org.osgi.framework.ServiceFactory;
import org.osgi.framework.ServiceRegistration;

import helloservice.sample.IHelloService;
import helloservice.sample.impl.HelloServiceImpl;

public class HelloServiceFactory implements ServiceFactory {
	private int usageCounter = 0;

	@Override
	public Object getService(Bundle bundle, ServiceRegistration arg1) {
		usageCounter++;
		IHelloService helloService = new HelloServiceImpl();
		return helloService;
	}

	@Override
	public void ungetService(Bundle bundle, ServiceRegistration arg1, Object arg2) {
		System.out.println("Release object of HelloService for " + bundle.getSymbolicName());
		usageCounter--;
		System.out.println("Number of bundles using service " + usageCounter);
	}

}

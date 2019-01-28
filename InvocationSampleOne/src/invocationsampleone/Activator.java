package invocationsampleone;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import helloservice.sample.IHelloService;
import helloservice.sample.impl.HelloServiceImpl;

public class Activator implements BundleActivator {
	
	IHelloService service;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		service = new HelloServiceImpl();
		System.out.println(service.sayHi());
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}

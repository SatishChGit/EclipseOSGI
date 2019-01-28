package helloservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import helloservice.sample.IHelloService;
import helloservice.sample.impl.HelloServiceImpl;
import helloservice.servicefactory.HelloServiceFactory;

public class Activator implements BundleActivator {

	ServiceRegistration helloServiceRegistration;
	static int counter = 0;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		HelloServiceFactory helloServiceFact = new HelloServiceFactory();
		counter++;
		helloServiceRegistration = context.registerService(IHelloService.class.getName(), helloServiceFact, null);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		helloServiceRegistration.unregister();
	}

}

package helloservicewithoutfactory;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import helloservice.sample.IHelloService;
import helloservice.sample.impl.HelloServiceImpl;

public class Activator implements BundleActivator {
	ServiceRegistration<IHelloService> reg;
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		IHelloService service = new HelloServiceImpl();
		 reg = (ServiceRegistration<IHelloService>) context.registerService(IHelloService.class.getName(), service, null);
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		reg.unregister();
	}

}

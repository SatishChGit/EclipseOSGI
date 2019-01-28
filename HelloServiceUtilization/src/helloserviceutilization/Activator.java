package helloserviceutilization;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import helloservice.sample.IHelloService;

public class Activator implements BundleActivator {

	
	ServiceReference<IHelloService> helloServiceReference;
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		helloServiceReference= (ServiceReference<IHelloService>) context.getServiceReference(IHelloService.class.getName());
		IHelloService helloService =(IHelloService)context.getService(helloServiceReference);
        System.out.println(helloService.sayHi());
        
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}

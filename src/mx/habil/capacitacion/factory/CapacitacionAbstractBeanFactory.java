package mx.habil.capacitacion.factory;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class CapacitacionAbstractBeanFactory {
	private static final Logger logger = Logger.getLogger(CapacitacionAbstractBeanFactory.class);
	protected static ApplicationContext applicationContext;
	protected static String[] applicationContextFile;
	protected static CapacitacionAbstractBeanFactory factory;

	public void init() {
		logger.debug("inicio");
		if (applicationContext == null) {
			try {
				logger.debug("Context file: " + applicationContextFile);
				applicationContext = new ClassPathXmlApplicationContext(applicationContextFile);
				logger.debug("applicationContext: " + applicationContext);
			} catch (Exception ex) {
				logger.fatal(ex);
			}
		}

		logger.debug("fin");
	}

	public Object getBean(String beanId) {
		logger.debug("inicio");
		init();
		Object o = applicationContext.getBean(beanId);
		logger.debug("Fin");
		return o;

	}

	public static void setApplicationContext(ApplicationContext applicationContextAux) {
		applicationContext = applicationContextAux;
	}
}

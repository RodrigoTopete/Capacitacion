package mx.habil.capacitacion.factory;

import org.apache.log4j.Logger;

public class CapacitacionBeanFactory extends CapacitacionAbstractBeanFactory {
	private static final Logger logger = Logger.getLogger(CapacitacionBeanFactory.class);

	private CapacitacionBeanFactory() {
		logger.debug("inicio");
		applicationContextFile = new String[1];
		applicationContextFile[0] = "/mx/habil/capacitacion/dto/hbm/hibernate.cfg.xml";
		logger.debug("fin");
	}

	public static CapacitacionAbstractBeanFactory getInstance() {
		logger.debug("inicio");

		if (factory == null) {
			logger.debug("Factoria Nula");
			factory = new CapacitacionBeanFactory();
		}

		logger.debug("fin");
		return factory;
	}

}

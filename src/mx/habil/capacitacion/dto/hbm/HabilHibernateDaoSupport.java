package mx.habil.capacitacion.dto.hbm;



import org.apache.log4j.Logger;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dto.CapacitacionAbstractDto;

public class HabilHibernateDaoSupport extends HibernateDaoSupport {
	public static final Logger logger = Logger.getLogger(HabilHibernateDaoSupport.class);

	public void save(CapacitacionAbstractDto capacitacionAbstractDto ) throws DaoException {
		logger.debug("inicio");
		try {
			
			
			getHibernateTemplate().save(capacitacionAbstractDto);
			getHibernateTemplate().flush();
		} catch (Exception e){
			throw new DaoException(e.getMessage());
		}
		
		logger.debug("fin");
	}

}

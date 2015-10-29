package mx.habil.capacitacion.dto.hbm;

<<<<<<< HEAD


=======
>>>>>>> 8f1b663c11714ac922280ab7f130b4c2799c3c63
import org.apache.log4j.Logger;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dto.CapacitacionAbstractDto;

public class HabilHibernateDaoSupport extends HibernateDaoSupport {
	public static final Logger logger = Logger.getLogger(HabilHibernateDaoSupport.class);

	public void save(CapacitacionAbstractDto capacitacionAbstractDto ) throws DaoException {
		logger.debug("inicio");
		try {
<<<<<<< HEAD
			
			
			getHibernateTemplate().save(capacitacionAbstractDto);
			getHibernateTemplate().flush();
		} catch (Exception e){
			throw new DaoException(e.getMessage());
		}
		
=======
			getHibernateTemplate().save(capacitacionAbstractDto);
			getHibernateTemplate().flush();
		} catch (Exception e) {
			throw new DaoException(e.getMessage());
		}

>>>>>>> 8f1b663c11714ac922280ab7f130b4c2799c3c63
		logger.debug("fin");
	}

}

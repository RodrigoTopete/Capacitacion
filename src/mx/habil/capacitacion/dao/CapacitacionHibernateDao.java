package mx.habil.capacitacion.dao;

import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dto.CapacitacionAbstractDto;

public interface CapacitacionHibernateDao {
	public void save(CapacitacionAbstractDto capacitacionAbstractDto)throws DaoException;
	
	
	

}

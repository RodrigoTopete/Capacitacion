package mx.habil.capacitacion.dao;

import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dto.CarreraDto;

public interface CarreraDao extends CapacitacionHibernateDao {
	
//	public void insertar(String nombre,String edificio,String jefe_carrera,String laboratorio) throws BoException;
//	public void editar(String nombre,String edificio,String jefe_carrera,String laboratorio,int id) throws BoException;
//	public void eliminar(int id) throws BoException;
//	public void recuperar();
	public CarreraDto recuperarPorId(final Integer id) throws DaoException;

}

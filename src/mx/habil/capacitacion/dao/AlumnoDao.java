package mx.habil.capacitacion.dao;


import mx.habil.capacitacion.dao.exception.DaoException;

public interface AlumnoDao {
	
//		public void insertar(String nombre,String ap_paterno,String ap_materno,int telefono,int edad,int id_carrera) throws BoException ;
//		public void editar(String nombre,String ap_paterno,String ap_materno,int telefono,int edad,int id_carrera,int id) throws BoException;
//		public void eliminar(int id) throws BoException;
//		public void recuperar();
		public void recuperarPorId(Integer id) throws DaoException;

}
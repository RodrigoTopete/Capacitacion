package mx.habil.capacitacion.bs;

import java.util.Scanner;

import org.apache.log4j.Logger;

import mx.habil.capacitacion.dao.AlumnoDao;
import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dao.impl.AlumnoDaoImpl;
import mx.habil.capacitacion.dao.impl.CarreraDaoImpl;

public class AlumnoBo implements AlumnoDao{
	
	
		private static final Logger logger = Logger.getLogger(CarreraDaoImpl.class);
	    AlumnoDaoImpl alumno = new AlumnoDaoImpl();
	    private static Scanner datosTeclado=new Scanner(System.in);
		@Override
		public void recuperarPorId(Integer id) throws DaoException {
			// TODO Auto-generated method stub
			
		}

    
	    
//	@Override
//		public void insertar(String nombre,String ap_paterno,String ap_materno,int telefono,int edad,int id_carrera) throws BoException{
//		logger.debug("Ingresa el Nombre del alumno");
//		nombre=datosTeclado.next();
//		logger.debug("Ingresa el Apellido Paterno");
//		ap_paterno=datosTeclado.next();
//		logger.debug("Ingresa el Apellido Materno");
//		ap_materno=datosTeclado.next();
//		logger.debug("Ingresa el telefono del alumno");
//		telefono=datosTeclado.nextInt();
//		logger.debug("Ingresa la edad del alumno");
//		edad=datosTeclado.nextInt();
//		logger.debug("Ingresa el Id_Carrera del alumno");
//		id_carrera=datosTeclado.nextInt();
//		if(nombre==null||ap_paterno==null||ap_materno==null||telefono==0||edad==0||id_carrera==0){
//		throw new BoException();
//		}
//		else{
//		alumno.insertar(nombre, ap_paterno, ap_materno, telefono, edad, id_carrera);
//		}
//		}
//	
//	
//	
//	
//	@Override
//		public void editar(String nombre, String ap_paterno, String ap_materno, int telefono, int edad, int id_carrera,int id) throws BoException {
//		logger.debug("Introduce el ID que deseas modificar");
//		id= datosTeclado.nextInt();
//		logger.debug("Ingresa el Nombre del alumno");
//		nombre=datosTeclado.next();
//		logger.debug("Ingresa el Apellido Paterno");
//		ap_paterno=datosTeclado.next();
//		logger.debug("Ingresa el Apellido Materno");
//		ap_materno=datosTeclado.next();
//		logger.debug("Ingresa el telefono del alumno");
//		telefono=datosTeclado.nextInt();
//		logger.debug("Ingresa la edad del alumno");
//		edad=datosTeclado.nextInt();
//		logger.debug("Ingresa el Id_Carrera del alumno");
//		id_carrera=datosTeclado.nextInt();
//	 	if(id==0||nombre==null||ap_paterno==null||ap_materno==null||telefono==0||edad==0||id_carrera==0){
//		throw new BoException();
//		}else{
//		alumno.editar(nombre, ap_paterno, ap_materno, telefono, edad, id_carrera, id);
//		}
//		}
//	
//	
//	
//	
//	
//	@Override
//		public void eliminar(int id)throws BoException {
//		logger.debug("Introduce el ID que deseas eliminar");
//		id=datosTeclado.nextInt();
//		if(id==0){
//		throw new BoException();
//		}else{
//		alumno.eliminar(id);
//		}
//		}
//	
//	
//	
//	
//	
//	
//	@Override
//		public void recuperar() {
//		alumno.recuperar();
//		}
//	
//	
//	
//	
//	
//	@Override
//		public void recuperarPorId(int id)throws BoException {
//		logger.debug("Introduce el ID que desea visualizar");
//		id=datosTeclado.nextInt();
//		if(id==0){
//		throw new BoException();
//		}else{
//		alumno.recuperarPorId(id);
//		}
//		}
		}



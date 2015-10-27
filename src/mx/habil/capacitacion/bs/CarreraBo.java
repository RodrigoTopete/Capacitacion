package mx.habil.capacitacion.bs;
import java.util.Scanner;

import org.apache.log4j.Logger;

import mx.habil.capacitacion.dao.CarreraDao;
import mx.habil.capacitacion.dao.exception.DaoException;
import mx.habil.capacitacion.dao.impl.CarreraDaoImpl;
import mx.habil.capacitacion.dto.CarreraDto;

public class CarreraBo  {
	
		private static final Logger logger = Logger.getLogger(CarreraDaoImpl.class);
		
	
		public void save(){
			logger.debug("inicio");
			
			logger.debug("fin");
			
		}
		
	    CarreraDaoImpl carrera = new CarreraDaoImpl();
	    private static Scanner datosTeclado=new Scanner(System.in);
//		@Override
//		public CarreraDto recuperarPorId(Integer id) throws DaoException {
//			// TODO Auto-generated method stub
//			return null;
//		}
//	    
    
//	
//	@Override
//		public void insertar(String nombre,String edificio,String jefe_carrera,String laboratorio) throws BoException{
//		datosTeclado.nextLine();
//		logger.debug("Ingresa el Nombre de la carrera");
//		nombre=datosTeclado.nextLine();
//		logger.debug("Ingresa el Edificio al que pertenece");
//		edificio=datosTeclado.next();
//		datosTeclado.nextLine();
//		logger.debug("Ingresa el Jefe de Carrera");
//		jefe_carrera=datosTeclado.nextLine();
//		logger.debug("Ingresa el laboratorio");
//		laboratorio=datosTeclado.next();
//		if(nombre==null||edificio==null||jefe_carrera==null||laboratorio==null){
//		throw new BoException();
//		}else{
//		carrera.insertar(nombre, edificio, jefe_carrera, laboratorio);
//		}
//		}
//	
//	
//	
//	
//	@Override
//		public void editar(String nombre,String edificio,String jefe_carrera,String laboratorio,int id) throws BoException {
//		logger.debug("Introduce el ID que deseas modificar");
//		id= datosTeclado.nextInt();
//		datosTeclado.nextLine();
//		logger.debug("Ingresa el Nombre de la carrera");
//		nombre=datosTeclado.nextLine();
//		logger.debug("Ingresa el Edificio al que pertenece");
//		edificio=datosTeclado.next();
//		datosTeclado.nextLine();
//		logger.debug("Ingresa el Jefe de Carrera");
//		jefe_carrera=datosTeclado.nextLine();
//		logger.debug("Ingresa el laboratorio");
//		laboratorio=datosTeclado.next();
//		if(id==0||nombre==null||edificio==null||jefe_carrera==null||laboratorio==null){
//		throw new BoException();
//		}else{
//			carrera.editar(nombre, edificio, jefe_carrera, laboratorio, id);
//		}
//		}
//	
//	
//	
//	
//	@Override
//		public void eliminar(int id)throws BoException {
//		logger.debug("Introduce el ID que deseas eliminar");
//		id=datosTeclado.nextInt();
//		if(id==0){
//			throw new BoException();
//		}else{
//			carrera.eliminar(id);
//		}
//		}
//	
//	
//	
//	@Override
//		public void recuperar() {
//		carrera.recuperar();
//		}
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
//		carrera.recuperarPorId(id);
//		}
//		}
		}

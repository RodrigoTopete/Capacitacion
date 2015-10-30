package mx.habil.capacitacion.bs;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import mx.habil.capacitacion.dto.CarreraDto;

public class LeerExcelBo {

	private static final Logger logger = Logger.getLogger(LeerExcelBo.class);
//	CarreraDto carreraDto = new CarreraDto();
	String nombre = null;
	String edificio = null;
	String jefeCarrera = null;
	String laboratorio = null;
	Integer celda = null;
	

	public static void main(String args[]) throws IOException {
		LeerExcelBo r = new LeerExcelBo();
		r.read();
		
	}

	public List<CarreraDto> read() throws IOException {
		logger.debug("inicio");
		FileInputStream file = new FileInputStream(new File("C://Users/Usuario/Documents/Excel/Template-Carrera.xlsx"));
		XSSFWorkbook myWorkBook = new XSSFWorkbook(file);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		Integer fila = 1;
		
		List<CarreraDto> listCarreraDto = new ArrayList<>();

		for (Iterator<Row> iterator = mySheet.iterator(); iterator.hasNext();) {
			Row r = iterator.next();
			r = mySheet.getRow(fila);

			if ((r.getCell(0) != null) && (r.getCell(0).getCellType() != Cell.CELL_TYPE_BLANK)) {
				celda = r.getCell(0).getCellType();
				nombre = valor(celda, r, 0);
			}
			if ((r.getCell(1) != null) && (r.getCell(1).getCellType() != Cell.CELL_TYPE_BLANK)) {
				celda = r.getCell(1).getCellType();
				edificio = valor(celda, r, 1);
			}

			if ((r.getCell(2) != null) && (r.getCell(2).getCellType() != Cell.CELL_TYPE_BLANK)) {
				celda = r.getCell(2).getCellType();
				jefeCarrera = valor(celda, r, 2);
			}
			if ((r.getCell(3) != null) && (r.getCell(3).getCellType() != Cell.CELL_TYPE_BLANK)) {
				celda = r.getCell(3).getCellType();
				laboratorio = valor(celda, r, 3);
			}
			
			CarreraDto carreraDto = new CarreraDto(nombre, edificio, jefeCarrera, laboratorio);
			
			listCarreraDto.add(carreraDto);
			logger.debug(listCarreraDto.size());
			
		}
	
	
	LeerExcelBo read = new LeerExcelBo();
	read.validar(nombre,edificio,jefeCarrera,laboratorio);
	return listCarreraDto ;
	}

	public String valor(Integer celda, Row r, Integer columna) {
		logger.debug("inicio");
		String resultado = null;

		if ((celda == Cell.CELL_TYPE_STRING)) {
			resultado = r.getCell(columna).getStringCellValue();
		}
		logger.debug("fin");
		return resultado;

	}
	
	public  void validar (String nombre,String edificio,String jefeCarrera,String laboratorio){

		if(nombre==null||nombre.isEmpty()){
			logger.error("El nombre de la Carrera es Nulo");
		}
		if(edificio==null||edificio.isEmpty()){
			logger.error("El valor del edificio es nulo");
		}
		
		if(jefeCarrera==null||jefeCarrera.isEmpty()){
			logger.error("El nombre del jefe es nulo");
		}
		if(laboratorio==null||laboratorio.isEmpty()){
			logger.error("El valor del laboratorio es nulo");
		}
	

	}
	
}

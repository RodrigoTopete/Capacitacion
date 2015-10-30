package mx.habil.capacitacion.read.excel;

import java.io.*;
import java.util.*;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import mx.habil.capacitacion.dto.CarreraDto;

public class Reading {

	public static void main(String args[]) throws IOException  {
		final Logger logger = Logger.getLogger(Reading.class);
		FileInputStream file = new FileInputStream(new File("C://Users/Usuario/Documents/Excel/CARRERA.xlsx"));

		XSSFWorkbook myWorkBook = new XSSFWorkbook(file);
		XSSFSheet mySheet = myWorkBook.getSheetAt(0);
		List<CarreraDto> listaCarrerasExcel = new ArrayList<>();

		for(Row r : mySheet) {
			for(Cell c : r) {
			
			CarreraDto carreraDto = new CarreraDto();
			carreraDto.setNombre(c.getStringCellValue());
			carreraDto.setEdificio(c.getStringCellValue());
			carreraDto.setJefeCarrera(c.getStringCellValue());
			carreraDto.setLaboratorio(c.getStringCellValue());
			
			listaCarrerasExcel.add(carreraDto);
			logger.debug(c.getStringCellValue());
			
			}
		}
	}
}

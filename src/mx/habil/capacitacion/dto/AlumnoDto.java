package mx.habil.capacitacion.dto;

import java.io.Serializable;

public class AlumnoDto implements Serializable {

	private static final long serialVersionUID = -7870871441555044570L;

	private Long idAlumno;
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private Long telefono;
	private Long edad;
	private Long idCarrera;

	public Long getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApPaterno() {
		return apPaterno;
	}

	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}

	public String getApMaterno() {
		return apMaterno;
	}

	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}

	public Long getTelefono() {
		return telefono;
	}

	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public Long getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Long idCarrera) {
		this.idCarrera = idCarrera;
	}

	// private static Scanner datosTeclado=new Scanner(System.in);
	// public static void main(String[] args) {
	//
	// logger.debug("Selecciona una opcion: \n 1.Recuperar \n 2.Insertar \n
	// 3.Actualizar \n 4.Eliminar \n 5.Recuperar por ID");
	// int s=datosTeclado.nextInt();
	// AlumnoBo bo=new AlumnoBo();
	// switch(s){
	//
	// case 1:
	// bo.recuperar();
	// break;
	// case 2:
	// try {
	// bo.insertar(null, null, null, s, s, s);
	// } catch (BoException e2) {
	// logger.debug("Los valores introducidos no son validos");
	// }
	// break;
	// case 3:
	// try {
	// bo.editar(null, null, null, s, s, s, s);
	// } catch (BoException e1) {
	// logger.debug("Los valores introducidos no son validos");
	// e1.getMessage();
	// }
	// break;
	// case 4:
	//
	// try {
	// bo.eliminar(s);
	// } catch (BoException e) {
	// logger.debug("El ID es incorrecto");
	// e.getMessage();
	// }
	// break;
	// case 5:
	// try {
	// bo.recuperarPorId(s);
	// } catch (BoException e) {
	// logger.debug("El ID es incorrecto");
	// e.getMessage();
	// }
	// break;
	// default:
	// logger.debug("Seleciona una opcion numerica correcta");
	// break;
	//
	// }
	// }
}
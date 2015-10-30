package mx.habil.capacitacion.dto;


public class CarreraDto extends CapacitacionAbstractDto {

	private static final long serialVersionUID = -16752742950042484L;
	
	private Integer idCarrera;
	private String nombre;
	private String edificio;
	
	public CarreraDto(){
		
	}
	public CarreraDto(String nombre, String edificio, String jefeCarrera, String laboratorio) {
		super();
		this.nombre = nombre;
		this.edificio = edificio;
		this.jefeCarrera = jefeCarrera;
		this.laboratorio = laboratorio;
	}

	private String jefeCarrera;
	private String laboratorio;

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "CarreraDto [idCarrera=" + idCarrera + ", nombre=" + nombre + ", edificio=" + edificio + ", jefeCarrera="
				+ jefeCarrera + ", laboratorio=" + laboratorio + "]";
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEdificio() {
		return edificio;
	}

	public void setEdificio(String edificio) {
		this.edificio = edificio;
	}

	public String getJefeCarrera() {
		return jefeCarrera;
	}

	public void setJefeCarrera(String jefeCarrera) {
		this.jefeCarrera = jefeCarrera;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public Integer getIdCarrera() {
		return idCarrera;
	}

	public void setIdCarrera(Integer idCarrera) {
		this.idCarrera = idCarrera;
	}

	// private static Scanner datosTeclado=new Scanner(System.in);
	// public static void main(String[] args){
	//
	// logger.debug("Selecciona una opcion: \n 1.Recuperar \n 2.Insertar \n
	// 3.Actualizar \n 4.Eliminar \n 5.Recuperar por ID");
	// int s=datosTeclado.nextInt();
	// CarreraBo carrera= new CarreraBo();
	//
	// switch(s){
	// case 1:
	// carrera.recuperar();
	// break;
	// case 2:
	// try {
	// carrera.insertar(null, null, null, null);
	// } catch (BoException e) {
	// logger.debug("Los datos que ingreso no son validos");
	// }
	// break;
	// case 3:
	// try {
	// carrera.editar(null, null, null, null, s);
	// } catch (BoException e) {
	// logger.debug("Los datos que ingreso no son validos");
	// }
	// break;
	// case 4:
	// try {
	// carrera.eliminar(s);
	// } catch (BoException e) {
	// logger.debug("ID incorrecto");
	// }
	// break;
	// case 5:
	// try {
	// carrera.recuperarPorId(s);
	// } catch (BoException e) {
	// logger.debug("ID incorrecto");
	// }
	// break;
	// default:
	// logger.debug("Seleciona una opcion numerica correcta");
	// break;
	//
	// }
	// }
}

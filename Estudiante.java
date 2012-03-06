/**
 * Clase Estudiante que hereda de la clase Persona
 * @author Carlos Salas
 *
 */
public class Estudiante extends Persona{
	private String curso;
	/**
	 * Constructor de la superclase
	 */
	public Estudiante() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructor mediante parametros
	 * @param apellido1
	 * @param apellido2
	 * @param edad
	 * @param nombre
	 * @param curso
	 */
	public Estudiante(String apellido1, String apellido2, int edad,
			String nombre, String curso) {
		super(apellido1, apellido2, edad, nombre);
		this.curso = curso;
	}

	/**
	 * Devuelve el curso
	 * @return curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Guarda el curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nCurso: " + curso + "\n";
	}



}

/**
 * Clase Persona
 * @author Carlos Salas
 * 
 */

public class Persona {
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int edad;

	/**
	 * 	Constructor mediante parámetros
	 * @param apellido1
	 * @param apellido2
	 * @param edad
	 * @param nombre
	 */
	public Persona(String apellido1, String apellido2, int edad, String nombre) {
		super();
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.edad = edad;
		this.nombre = nombre;
	}

	/**
	 * 	Constructor vacio
	 */

	public Persona() {
		super();
	}

	/**
	 * Devuelve el nombre
	 * @return String nombre
	 */

	public String getNombre() {
		return nombre;
	}

	/**
	 * Guarda el nombre
	 * @param String nombre
	 */

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el primer apellido
	 * @return String apellido1
	 */

	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Guarda el primer apellido
	 * @param String apellido1
	 */

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Devuelve el segundo appelido
	 * @return String apellido2
	 */

	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Guarda el segundo apellido
	 * @param String apellido2
	 */

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Devuelve la edad
	 * @return int edad
	 */

	public int getEdad() {
		return edad;
	}

	/**
	 * Guarda la edad
	 * @param int edad
	 */

	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + "\nApellidos: " + apellido1 + " " + apellido2 + "\nEdad: " + edad;
	}

}

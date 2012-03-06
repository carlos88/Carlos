/**
 * Clase para ejecutar el programa
 * @author Carlos
 *
 */
public class Main {

	/**
	 * Metodo que ejecuta el programa
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menus m = new Menus((new String[]{"Crear todo","Crear estudiantes","Crear profesores","Mostrar todo","Mostrar estudiantes","Mostrar profesores", "Mostrar un estudiante", "Mostrar un profesor","Salir"}),"Elige una opción");
		Colegio c = new Colegio();
		int op = 0 ;
		do{
			op = m.crearMenu();
			switch (op){
			case 1: c.introducirTodo(); break;
			case 2: c.introducirEstudiantes(); break;
			case 3: c.introducirProfesores(); break;
			case 4: c.mostrarTodo(); break;
			case 5: c.mostrarEstudiantes(); break;
			case 6: c.mostrarProfesores(); break;
			case 7: c.mostrarEstudiante(); break;
			case 8: c.mostrarProfesor(); break;
			case 9: m.salir("Gracias por utilizar el programa."); break;
			default: System.out.println("No has introducido una opción válida"); break;
			}
		}while (op !=9 );
	}

}

import java.util.Scanner; //Las importaciones tienen que estar arriba del todo

public class MetodoNombre { //Clase con métodos

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in); //Creamos el scanner
		System.out.println("¿Cual es tu nombre?"); //Solicitamos el nombre
		String nombre = leer.nextLine(); //Creamos una cadena con el nombre
		System.out.println(saludo(nombre)); //
		
	}
	
	public static String saludo(String saludo) { //Creamos un metodo "saludo"
		
		return "Hola, " + saludo; //Imprimirmos el saludo con el nombre
	}
}


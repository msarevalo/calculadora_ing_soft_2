package calculadora;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String ciclo = "cont";
		System.out.print("Escriba EXIT para salir");
		while (ciclo.equals("cont")) {

			System.out.print("\n\nEscriba la operacion que se desea hacer");
			String cadena = teclado.nextLine();

			if (cadena.equals("EXIT") || cadena.equals("exit")) {
				ciclo = "no";
				System.out.println("Gracias por usar la calculadora...");
			} else {
				if (cadena.isEmpty()) {

				} else {
					logica.separar(cadena);
				}
			}
		}
		teclado.close();
	}

}

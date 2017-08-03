package calculadora;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		//Scanner teclado = new Scanner(System.in);
		//Scanner teclado2 = new Scanner(System.in);
		//int seleccion = 0;
		//double numero1 = 0.0;
		//double numero2 = 0.0;

		logica.seleccion();
		//logica.separar("4651+546+561-4651");
		//System.out.print("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Operacion Compleja\n6.Salir");
		//seleccion = teclado.nextInt();
		/*
		int menu = 0;
		double numero1;
		double numero2;
		String cadena;		
		
		while(menu != 6) {
			System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Operacion Compleja\n6.Salir");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Escriba el primer numero:");
				numero1 = teclado.nextDouble();
				System.out.println("Escriba el segundo numero:");
				numero2 = teclado.nextDouble();
				System.out.println("El resultado de la suma es: " + operaciones.suma(numero1, numero2) + "\n");
				break;
			case 2:
				System.out.println("Escriba el primer numero:");
				numero1 = teclado.nextDouble();
				System.out.println("Escriba el segundo numero:");
				numero2 = teclado.nextDouble();
				System.out.println("El resultado de la resta es: " + operaciones.resta(numero1, numero2) + "\n");
				break;
			case 3:
				System.out.println("Escriba el primer numero:");
				numero1 = teclado.nextDouble();
				System.out.println("Escriba el segundo numero:");
				numero2 = teclado.nextDouble();
				System.out.println("El resultado de la multiplicacion es: " + operaciones.multiplicacion(numero1, numero2) + "\n");
				break;
			case 4:
				System.out.println("Escriba el primer numero:");
				numero1 = teclado.nextDouble();
				System.out.println("Escriba el segundo numero:");
				numero2 = teclado.nextDouble();
				System.out.println("El resultado de la division es: " + operaciones.division(numero1, numero2) + "\n");
				break;
			case 5:
				System.out.println("\n\nEscriba la operacion que se desea hacer");
				cadena = teclado2.nextLine();
				System.out.println(cadena);
				logica.separar(cadena);
				break;
			case 6:
				System.out.println("Gracias por usar la calculadora...");
				break;
			default:
				System.out.println("Ingrese una opcion valida\n");
				menu = 0;
				break;
			}
		}*/
		
		/*System.out.print("\n\nEscriba la operacion que se desea hacer");
		String cadena = teclado.nextLine();

		if (cadena.equals("EXIT") || cadena.equals("exit")) {
			System.out.println("Gracias por usar la calculadora...");
		} else {
			if (cadena.isEmpty()) {
			} else {
				logica.separar(cadena);
			}
		}

		teclado.close();*/
	}
}

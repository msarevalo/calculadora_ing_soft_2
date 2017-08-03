package calculadora;

import java.util.ArrayList;
import java.util.Scanner;

public class logica {

	static Scanner teclado = new Scanner(System.in);
	static Scanner teclado2 = new Scanner(System.in);
	
	public static void seleccion() {
		int menu =0;
		double numero1,numero2;
		String cadena;
		
		while(menu != 6) {
			System.out.println("1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Operacion Compleja\n6. Salir");
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
				//System.out.println(cadena);
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
		}
	}
	
	public static void separar(String cadena) {
		String[] operadores = null;
		String[] numeros = null;
		int contador = 1;
		double numeroarreglo = 0;
		Double resultado = 0.0;
		char respuesta = 's';
		ArrayList<Double> numerosfin = new ArrayList<Double>();

		operadores = cadena.split("[0-9]");
		numeros = cadena.split("[-*/+]");

		//contador = numeros[0].length();

		for (int i = 0; i < numeros.length; i++) {
			//numero = Integer.parseInt(numeros[i]);
			numeroarreglo = Double.parseDouble(numeros[i]);
			//System.out.println(numeroarreglo);
			numerosfin.add(i, numeroarreglo);
			// System.out.println(numerosfin.get(i));
		}

		resultado = numerosfin.get(0);
		// System.out.println(numerosfin.get(0));
		// System.out.println(contador);
		/*System.out.println(operadores.length);
		for (int i = 0; i < operadores.length; i++) {
			System.out.println(operadores[i]);
		}*/

		//for (int i = 1; i < numerosfin.size(); i++) {
			for (int j = 0; j < operadores.length; j++) {
				respuesta = 's';
				//if (operadores[contador] != null) {
					if (operadores[j].equals("+")) {
						resultado = operaciones.suma(resultado, numerosfin.get(contador));
						//System.out.println("Suma");
						contador++;
					} else {
						if (operadores[j].equals("-")) {
							resultado = operaciones.resta(resultado, numerosfin.get(contador));
							//System.out.println("Resta");
							contador = contador + 1;
						} else {
							if (operadores[j].equals("*")) {
								resultado = operaciones.multiplicacion(resultado, numerosfin.get(contador));
								//System.out.println("Multiplicacion");
								contador = contador + 1;
							} else {
								if (operadores[j].equals("/")) {
									resultado = operaciones.division(resultado, numerosfin.get(contador));
									//System.out.println("Division");
									contador = contador + 1;
								} else {
									// System.out.println("Se ingreso un operador no valido: " +
									// operadores[contador]);
									//System.out.println("prueba");
									respuesta = 'n';
									//contador = contador + 1;
									// break;
								}
							}
						}
					}
				}
			//}

		//}

		System.out.printf("El resultado de " + cadena + " es igual a: %.2f\n\n", resultado);
	}
}

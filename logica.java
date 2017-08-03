package calculadora;

import java.util.ArrayList;

public class logica {

	public static void separar(String cadena) {
		String[] operadores = null;
		String[] numeros = null;
		int contador = 1;
		double numero = 0;
		Double resultado = 0.0;
		char respuesta = 's';
		ArrayList<Double> numerosfin = new ArrayList<Double>();

		operadores = cadena.split("[0-9]");
		numeros = cadena.split("[-*/+]");

		// contador = numeros[0].length();

		for (int i = 0; i < numeros.length; i++) {
			//numero = Integer.parseInt(numeros[i]);
			numero = Double.parseDouble(numeros[i]);
			// System.out.println(numero);
			numerosfin.add(i, numero);
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

		System.out.printf("\nEl resultado de " + cadena + " es igual a: %.2f", resultado);
	}
}

package calculadora;

public class operaciones {

	public static double resultado;
	
	public static double suma(double numero1, double numero2) {
		resultado = numero1 + numero2;
		return resultado;
	}
	
	public static double resta(double numero1, double numero2) {
		resultado = numero1 - numero2;
		return resultado;
	}
	
	public static double multiplicacion(double numero1, double numero2) {
		resultado = numero1 * numero2;
		return resultado;
	}
	
	public static double division(double numero1, double numero2) {
		if(numero1 >= numero2) {
			resultado = numero1 / numero2;
		}else {
			resultado = numero2 / numero1;
		}
		return resultado;
	}
}

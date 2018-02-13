package com.mipaquete;

public class EjemploFunciones {
	
	public static void main(String[] args) {
        System.out.println("V3 - Programa Cine");
        // Empezando
        int x;
        int y;
        x = 3;
        y = 5;
        int resultadoSuma = sumarNumeros(x, y);
        int resultadoResta = restarNumeros(x, y);
        System.out.println("Resultado suma = " + resultadoSuma);
        System.out.println("Resultado resta = " + resultadoResta);
        System.out.println("Resultado Cuadrado = " + alCuadrado(y));
        System.out.println("Resultado Cuadrado = " + alCuadrado(6));
		System.out.println("Resultado cubo = " + alCubo(3));
	}
	public static int sumarNumeros(int valor_1, int valor_2) {
		System.out.println("Ahora si me verás!");
		return valor_1 + valor_2;
		//System.out.println("Nunca me verás!")
	}
    public static int restarNumeros(int valor_1, int valor_2) {
    	return valor_1 - valor_2;
    }
    public static int alCuadrado(int v) {
    	int resultado = v * v; 
    	return resultado;
    }
    public static double alCubo(int parametro) {
    	double result = Math.pow(parametro, 3);
    	return result;
    }
}

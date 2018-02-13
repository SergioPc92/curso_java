package com.un.paquete;

public class EjemploArrayA {

	public static void main(String[] args) {
		
		int[] arrayEnteros = new int[5];

    	// Bucle for: ( inicializacion; condicion; iteracion)
		for (int i = 0; i < arrayEnteros.length; i++) { // i = i + 1
			arrayEnteros[i] = i * i;
		    System.out.println("array(" + i + ") = " + arrayEnteros[i]);
		}
		float[] decimales = new float[10];
		for (int j = 0; j < decimales.length; j++ ) {
			decimales[j] = (float) j / 3f;
			System.out.println("El tercio de " + j + " es " + decimales[j]);
		}
		int otroArray[] = { 5, 10, 15, 20, 25 };
		for (int elemento : otroArray) {
			System.out.println("Elemento = " + elemento);
		}
		String diaDeSemana[] = {"lunes", "martes", "miercoles", "jueves", "viernes"};
		for (String dia : diaDeSemana) {
			System.out.println(dia);
	    }
		/*for (int d = 0; d < diaDeSemana.length; d++) {
			String dia = diaDeSemana[d];
			System.out.println(dia);
		} */
		int numDia = 0;
		while (numDia < diaDeSemana.length) {
			System.out.println(diaDeSemana [numDia]);
			numDia = numDia + 1;
		}
	}
}

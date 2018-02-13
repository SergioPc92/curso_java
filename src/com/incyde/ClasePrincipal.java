package com.incyde;

import java.util.Scanner;

public class ClasePrincipal 
{
	//VARIABLES
	static float capital;
    static float precio = 7.5f;
    static float horaPuedo;
    static int hora1 = 19;
    static int hora2 = 20;
    static int hora3 = 21;
    static int horaRecomendada;
    
	public static void main(String[] args)
	{
       boolean resultadoCine;
       System.out.println("Programa Cine V4");
	   pedirDatos();
	   resultadoCine = comprobarSiVamosAlCine();
	   mostrarResultado(resultadoCine); 
	 }
	 public static void pedirDatos() {
		 
	 Scanner teclado;	 
     System.out.println("Intruduzca capital");
     teclado = new Scanner(System.in);
     capital = teclado.nextFloat();
     System.out.println("Introzuca hora");
     horaPuedo = teclado.nextFloat();
     teclado.close();
     return;
	}
	public static boolean comprobarSiVamosAlCine() {
	 
		 if (capital >= precio) { 
		    if (horaPuedo >= hora1 && horaPuedo <= hora1) {
		    	horaRecomendada = hora1;
			    return true;
		    } else {
		    	if (horaPuedo >= hora2 && horaPuedo <= hora2) {
		    		horaRecomendada = hora2;
		    	    return true;
		    	} else {
			    	if (horaPuedo >= hora3 && horaPuedo <= hora3) {
			    		horaRecomendada = hora3;
			    		return true;
			    	}
		    	}
		    }
		 }
		return false;
	}
	public static void mostrarResultado(boolean resultado) {
		System.out.println("La hora recomenda es " + horaRecomendada);
		if (resultado == true) {
			System.out.println("Si podemos ir al cine");
		} else {
	    	System.out.println("No podemos ir al cine");
		} 	
	}
}
 
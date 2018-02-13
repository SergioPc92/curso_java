package com.incyde;

import java.util.Scanner;

public class ClasePrincipal {
	// VARIABLES
	static float capital;
	static float precio = 7.5f;
	static float horaPuedo;
	static int hora1 = 10;
	static int hora2 = 14;
	static int hora3 = 16;
	static int hora4 = 18;
	static int hora5 = 20;
	static int hora6 = 22;
	static int horaRecomendada = 23;
	static Scanner teclado;

	public static void main(String[] args) {
		boolean resultadoCine;
		String siSalir;
		teclado = new Scanner(System.in);
		System.out.println("Programa Cine V4");
		do {
			pedirDatosDinero();
			pedirDatosHora();
			resultadoCine = comprobarSiVamosAlCine();
			mostrarResultado(resultadoCine);
			System.out.println("Desea continuar? (s/n)");
			teclado.nextLine();
			siSalir = teclado.nextLine();
		} while (siSalir.equals("s") || siSalir.equals("S"));
		teclado.close();
		System.out.println("Fin del programa");
	}

	public static void pedirDatosDinero() {
		System.out.println("Intruduzca capital");

		capital = teclado.nextFloat();
	}

	public static void pedirDatosHora() {
		System.out.println("Introzuca hora");
		horaPuedo = teclado.nextFloat();
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
					} else { 
						if (horaPuedo >= hora4 && horaPuedo <= hora4) {
						    horaRecomendada = hora4;
						    return true;
						} else { 
							if (horaPuedo >= hora5 && horaPuedo <= hora5) {
								horaRecomendada = hora5;
								return true;
							} else {
								if (horaPuedo >= hora6 && horaPuedo <= hora6) {
									horaRecomendada = hora6;
									return true;
								}
							}
						}
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
			if (capital < precio) {
				System.out.println("No podemos ir al cine porque no tienes dinero sufuciente");
			} else {
				System.out.println("No podemos ir al cine");
			}
		}
	}
}

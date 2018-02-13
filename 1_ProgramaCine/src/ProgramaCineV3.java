/* Programa cine;
 * Pelicula interesante, dinero, horario, lugar, compañia, transporte
 */
import java.util.Scanner;

public class ProgramaCineV3 {
	public static void main(String[] arg) {
		boolean siIrAlCine = false;
		boolean siTenemosDinero = false;
		boolean siHayDisponible = false;
		double precioEntrada = 7.50; 
        int horaUsuario = 0;
        int horaCine_1 = 21;
        int horaUsuario_2 = 0;
        int horaCine_2 = 22;
		
		// PETICION DE DATOS
		System.out.println("Introduzca su nombre");
		
		Scanner escaner = new Scanner(System.in);
		String nombre = escaner.nextLine();
		System.out.println("El nombre es " + nombre + ". Introduzca capital");
        double capital = escaner.nextDouble();
        System.out.println("Introduzca la hora que puedes ir: ");
        horaUsuario = escaner.nextInt();
        System.out.println("Introduzca la otra hora que puedes ir: ");
        horaUsuario_2 = escaner.nextInt();
        siTenemosDinero = siTenemosCapital(precioEntrada, capital); {
        siHayDisponible = siHayPase(horaUsuario, horaCine_1); 
        siHayDisponible = siHayPase_2(horaUsuario_2, horaCine_2);
        siIrAlCine = siHayDisponible || siTenemosDinero;
        siIrAlCine = siHayDisponible && siTenemosDinero;
        }        
        
        if (siIrAlCine)
    	    System.out.println("Si podemos ir al cine");
       else 
    	    System.out.println("No podemos ir al cine");
        escaner.close();
        }	
        static boolean siHayPase(double horaUsuario, double horaCine_1) {
        	
        	if(horaUsuario < horaCine_1) {
		     return true;      
        } else {
        	return false;
        }
        }
        static boolean siHayPase_2(int horaUsuario_2, int horaCine_2) {
        	
        	if(horaUsuario_2 < horaCine_2) {
        		return true;
        	} else {
        		return false;
        	}
        }
        
	    static boolean siTenemosCapital( double precio, double capital) {
		
        if(capital < precio) {
        	return false;
        } else {
            return true;
        }    
	}  
	    static boolean siHaypase() {
		    return true;
	}    
}

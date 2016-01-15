package practica;

import java.util.Scanner;

public class examen {

	public static void main(String[] args) {{}}
 
	Scanner scan = new Scanner(System.in);

	
	
	System.("bienvenido");
	
	
	
	System.out.println("Hola ");
	double resultado = 0;
	System.out.println("ingrese el monto de la venta");
	double pro = scan.nextDouble();  
	 if (pro >= 0 && pro <= 1000){
		 
		System.out.println("su valor :"+"no tiene bonificacion");
	 }else if (pro >= 1000 && pro <= 5000){
		 resultado= pro*3/100;
	 }else if (pro >= 5000 && pro <= 20000){
		 resultado=pro*3/100;
	 }else if (pro > 20000){
		 resultado=pro*3/100;
		 
		}

	 System.out.println("su valor:"+"tiene bonificacion");

}
}

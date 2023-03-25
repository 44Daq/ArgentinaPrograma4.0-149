package Clases;

public class Clase1 {

	public static void main(String[] args) {
	//a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
	//y “b”. Su código puede arrancar (por ejemplo):
		System.out.println("Punto 1a: " );
		System.out.println("Los números entre a y b son: " );
	    int a = 0;
		int b = 14;
	while(a <= b) {	
	System.out.print(a + "-"); 
	  a = a + 1;
	}

	System.out.println();
	
//		for (int i=4; i<= 14; i++) {
//		System.out.print( i );
//	}
	System.out.println();
	System.out.println("Punto 1b: " );
	//b. A lo anterior, solo muestre los números pares
	
	System.out.println("Los números pares son: " );
		for (int j=4; j< 14; j++)
			if(j % 2 == 1){
	
	System.out.print(j + 1 + "-");
	}
		
		System.out.println();
		System.out.println();
		System.out.println("Punto 1c: " );
	// c. A lo anterior, con una variable extra, elija si se deben mostrar los números	pares o impares
		
	System.out.println("Los números impares son: " );	
		for (int h=4; h< 14; h++)
			if(h % 2 != 1) {
	System.out.print(h  + 1 + "-" );

		}
		
	System.out.println();
	System.out.println();
	System.out.println("Punto 1d: " );
	
	//d. Utilizando la sentencia for, hacer lo mismo que en(b) pero invirtiendo el orden
	
	System.out.println("Los números pares de mayor a menor son: " );
		int c = 5;
		int d = 16;
		while(d >= c) {	
			System.out.print((d - 2) + "-" ); 
			  d = d - 2;
			}
		System.out.println();
//		for (int j=4; j< 14; j++)
//			if(j % 2 == 1){
//		
//	System.out.print(d - 1 + "-");
//	
//			}	
/********************************************************/ 
		System.out.println();
		System.out.println("Punto 2: " );
		float ingresos = 500000; 
		int cantVehiculos = 4; 
		int inmuebles = 2;
		int otrosVehiculos =5;

		if ( ingresos >= 700000 ||
				cantVehiculos >= 3 ||
			    inmuebles >= 1 || 
				otrosVehiculos >= 1 
				) {
			System.out.println("Categoría A");
		
		}else {
			if ( ingresos >= 140000 ||
				 cantVehiculos >= 1 || 
				 inmuebles >= 2 ||
				 otrosVehiculos>= 2);
		
			System.out.println("Categoría B"); 
		
		}
	}
}


	
	


		

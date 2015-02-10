import java.util.*;
import java.io.*;

public class Principal {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);
		int quehacer = 0;
		
		do 
		{
		
		System.out.println(" \nQue quieres hacer?:" );
    	System.out.println(" \n 	1) Introducir nuevo producto" );
    	System.out.println(" \n 	2) Lectura de productos" );
    	System.out.println(" \n 	3) Ver los Clientes" );
    	System.out.println(" \n 	4) Crear Cesta" );
    	quehacer = sc.nextInt();

    	Leche leche = new Leche();
    	Lechuga lechuga = new Lechuga();
    	Manzana manzana = new Manzana();
    	Cliente cliente = new Cliente();
    	Cesta cesta = new Cesta();
    	
    	switch (quehacer){

	    	case 1:
			
		        //-----------------Introducccion de datos de las manzanas------------------
						
				manzana.escribirManzana();
				manzana.impresionManzana();
				
							
				//-----------------Introducccion de datos de la leche------------------
					
				leche.escribirLeche();
				leche.imprimirLeche();
				
				//-----------------Introducccion de datos de las lechugas ------------------
				
				lechuga.escribirLechuga();
				lechuga.imprimirLechuga();
							
			break;
			
	    	case 2:	
				
				
				
			break;
			
	    	case 3:
	    		cliente.leerCliente();
	    	break;
	    	
	    	case 4:
	    		cesta.cestaa();
	    	break;
    	
	    
				}
		}while (quehacer!=0);
		}

}

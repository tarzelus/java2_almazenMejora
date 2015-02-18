package almacen;


import java.util.*;
import java.io.*;

import almacen.gestion.Borrar;
import almacen.gestion.Cesta;
import almacen.gestion.Cliente;
import almacen.gestion.Leche;
import almacen.gestion.Lechuga;
import almacen.gestion.Manzana;



public class Principal {

public static void main (String args[]) throws IOException{		
		Scanner sc = new Scanner(System.in);
		int quehacer = 0;
		

    	Leche leche = new Leche();
    	Lechuga lechuga = new Lechuga();
    	Manzana manzana = new Manzana();
    	Cliente cliente = new Cliente();
    	Borrar borrar = new Borrar();
    	
    	Cesta cesta = new Cesta();
		
		do 
		{
		
		System.out.println(" \nQue quieres hacer?:" );
    	System.out.println(" \n 	1) Introducir nuevo producto" );
    	System.out.println(" \n 	2) Lectura de productos" );
    	System.out.println(" \n 	3) Eliminar productos" );
    	System.out.println(" \n 	4) Ver los Clientes" );
    	System.out.println(" \n 	5) Crear Cesta" );
    	System.out.println(" \n 	0) Salir" );
    	quehacer = sc.nextInt();

    	
    	switch (quehacer){

	    	case 1:
			
		        //-----------------Introducccion de datos de las manzanas------------------
						
				manzana.escribirManzanas();
				
				//-----------------Introducccion de datos de la leche------------------
					
				leche.escribirLeche();
				
				//-----------------Introducccion de datos de las lechugas ------------------
				
				lechuga.escribirLechuga();
							
			break;
			
	    	case 2:	
				
	    		manzana.impresionManzanas();
	    		leche.imprimirLeche();
	    		lechuga.imprimirLechuga();
				
			break;
			
	    	case 3:
	    		borrar.borrarProducto();
	    	break;
	    	
	    	case 4:
	    		//cesta.cestaa();
	    	break;
    	
	    
				}
		}while (quehacer!=0);
		}

}

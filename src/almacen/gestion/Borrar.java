package almacen.gestion;

import java.io.IOException;
import java.util.*;
import java.io.*;

public class Borrar {
	Leche leche = new Leche();
	Lechuga lechuga = new Lechuga();
	Manzana manzana = new Manzana();
	Cliente cliente = new Cliente();
	Scanner sc = new Scanner(System.in);
	
	public void borrarProducto() throws IOException{
		System.out.println(" \nQue producto quieres borrar?:" );
			System.out.println(" \n1) manzana" );
			System.out.println(" \n2) leche" );
			System.out.println(" \n3) lechuga" );
		int quehacer = sc.nextInt();
		
    	
    	switch (quehacer){

	    	case 1:
	    		manzana.impresionManzanas();
				System.out.println(" \nIntroduce el numero de la manzana que quieras eliminar" );
				int numeroBorrar=sc.nextInt();
				manzana.borrarManzana(numeroBorrar);
	    	break;
    	}
	
		manzana.impresionManzanas();
		leche.imprimirLeche();
		lechuga.imprimirLechuga();
	}
}

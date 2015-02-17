package almacen.gestion;

import java.util.*;
import java.io.*;

public class Manzana extends Productos{
//propiedades
	private String tipoManzana;
	private String procedencia;
	private String color;




//métodos getter y setter
	public Manzana() {
		super();
	}

	public String getTipoManzana()
		{
			return tipoManzana;
		}
		
	public void  setTipoManzana(String tipoManzana1)
		{
			tipoManzana=tipoManzana1;
		}

	public String getProcedencia()
		{
			return procedencia;
		}
		
	public void  setProcedencia(String procedencia1)
		{
			procedencia=procedencia1;
		}

	public String getColor()
		{
			return color;
		}
		
	public void  setColor(String color1)
		{
			color=color1;
		}



	
	
	
	//escribir manzanas
	Scanner sc = new Scanner(System.in);

	
	ArrayList<Manzana> manzanas = new ArrayList<Manzana>();

	Distribuidor dist = new Distribuidor();
    
	public void escribirManzanas() throws IOException{
		
		System.out.println("\nCuantas manzanas quieres registrar?: ");
		int cuantas = sc.nextInt();
		
		for (int m=0 ; m<cuantas ; m++){
			Manzana manzana = new Manzana();
			System.out.println("Introduce el tipo de manzana: ");
			manzana.setTipoManzana(sc.next());
			System.out.println("Introduce la procedencia de la manzana: ");
			manzana.setProcedencia(sc.next());
			System.out.println("Introduce el color de la manzana: ");
			manzana.setColor(sc.next());
			System.out.println("Introduce la cantidad de kilos de la manzana: ");
			manzana.setEurosKilo(sc.nextDouble());
			System.out.println("Introduce el numero del codigo de barras de la manzana: ");
			manzana.setCod_barras(sc.nextInt());
			System.out.println("Introduce el nombre del distribuidor de la manzana: ");
			String di = sc.next();
			
			manzana.setDistribuidor(dist.leerDistri(di));

			manzanas.add(manzana);
		
		}
	}
	
	
	
	
	
	public void impresionManzanas() throws IOException{

		//---------impresion de las manzanas con sus respectivos distribuidor-------------
		System.out.println(" \n\n**************manzanas**************" );
		for (int m=0 ; m < manzanas.size(); m++){

			System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipoManzana() );
            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
            System.out.println(" \nEuros Kilo: "+manzanas.get(m).getEurosKilo());

           
            
           
	     //   for(int d=0; d<getDistribuidor().size(); d++)
        	//{
        		//if (getDistribuidor().get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
            	System.out.println("  -------Distribuidor de la manzana-----------");
            	
            		System.out.println(" 	Nombre: "+getDistribuidor().get(m).getNombre() );
            		System.out.println(" \n 	CIF: "+getDistribuidor().get(m).getCif());
            		//---
            		System.out.println(" \n 	Direccion:" );
            		System.out.println(" \n     	Ciudad: "+ getDistribuidor().get(m).getDireccion().getCiudad());
            		System.out.println(" \n     	Calle: "+ getDistribuidor().get(m).getDireccion().getCalle());
            		System.out.println(" \n    		Piso: "+ getDistribuidor().get(m).getDireccion().getPiso());
            		System.out.println(" \n     	Portal: "+ getDistribuidor().get(m).getDireccion().getPortal());
            		System.out.println(" \n     	Codigo Postal: "+ getDistribuidor().get(m).getDireccion().getCodPostal());
            		//---
            		System.out.println(" \n 	Contacto: " );
            		System.out.println(" \n    		Nombre: "+ getDistribuidor().get(m).getPersonaContacto().getNombre());
            		System.out.println(" \n     	Apellido: "+ getDistribuidor().get(m).getPersonaContacto().getApellido());
            		System.out.println(" \n    		DNI: "+ getDistribuidor().get(m).getPersonaContacto().getDni());
            		System.out.println(" \n     	Email: "+ getDistribuidor().get(m).getPersonaContacto().getEmail());
            		System.out.println(" \n     	Telefono: "+ getDistribuidor().get(m).getPersonaContacto().getTelefono());
            		//}
        	//}
        }
	}
}
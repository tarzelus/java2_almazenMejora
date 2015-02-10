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



	
	
	
	//escrinir manzanas
	Scanner sc = new Scanner(System.in);

	
	ArrayList<Manzana> manzanas = new ArrayList<Manzana>();
    ArrayList<String> distribuman = new ArrayList<String>();
    
	public void escribirManzana(){
		
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
			distribuman.add(di);

			manzanas.add(manzana);
		
		}
	}
	
	
	
	
	
	public void impresionManzana() throws IOException{

		//---------impresion de las manzanas con sus respectivos distribuidor-------------
		System.out.println(" \n\n**************manzanas**************" );
		for (int m=0 ; m < manzanas.size(); m++){

			System.out.println(" \n\nTipo de manzana: "+manzanas.get(m).getTipoManzana() );
            System.out.println(" \nProcedencia: "+manzanas.get(m).getProcedencia());
            System.out.println(" \nColor : "+manzanas.get(m).getColor() );
            System.out.println("	 \nEuros Kilo: "+manzanas.get(m).getEurosKilo());

           
            ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

            distribuidores=Leerdistri.Leer();
           
	        for(int d=0; d<distribuidores.size(); d++)
        	{
        		if (distribuman.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
            	System.out.println("  -------Distribuidor de la manzana-----------");
            	
            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
            		//---
            		System.out.println(" \n 	Direccion:" );
            		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
            		System.out.println(" \n    		Piso: "+ distribuidores.get(d).getDireccion().getPiso());
            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
            		//---
            		System.out.println(" \n 	Contacto: " );
            		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
            		System.out.println(" \n    		DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
            		}
        	}
        }
	}
}


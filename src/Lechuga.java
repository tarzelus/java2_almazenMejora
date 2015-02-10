import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lechuga {

//propiedades
private String tipoLechuga;
private String procedencia;
private String color;
private Double eurosUnidad;
private Distribuidor distribuidor;
private int cod_barras;

//métodos getter y setter

public String getTipoLechuga()
		{
			return tipoLechuga;
		}
		
		public void  setTipoLechuga(String tipoLechuga1)
		{
			tipoLechuga=tipoLechuga1;
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

		public Double getEurosUniad()
		{
			return eurosUnidad;
		}
		
		public void  setEurosUnidad(Double eurosUnidad1)
		{
			eurosUnidad=eurosUnidad1;
		}

		public Distribuidor getDistribuidor()
		{
			return distribuidor;
		}
		
		public void  setDistribuidor(Distribuidor distribuidor1)
		{
			distribuidor=distribuidor1;
		}
		
		public int getCod_barras()
		{
			return cod_barras;
		}
		
		public void  setCod_barras(int cod_barras1)
		{
			cod_barras=cod_barras1;
		}
		
		//***********escribir e imprimir lechuga***********************
		
		ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
        ArrayList<String> distribulechu = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		
		public void escribirLechuga(){
	
			System.out.println("\nCuantas lechugas quieres registrar?: ");
			int cuantas = sc.nextInt();
			
			System.out.println("**************lechugas************** ");
		for (int g=0 ; g<cuantas ; g++){
			Lechuga lechuga = new Lechuga();
			System.out.println("Introduce el tipo de lechuga: ");
			lechuga.setTipoLechuga(sc.next());
			System.out.println("Introduce la procedencia de la lechuga: ");
			lechuga.setProcedencia(sc.next());
			System.out.println("Introduce el color de la lechuga: ");
			lechuga.setColor(sc.next());
			System.out.println("Introduce las unidades de lechuga: ");
			lechuga.setEurosUnidad(sc.nextDouble());
			System.out.println("Introduce el numero del codigo de barras de la lechuga: ");
			lechuga.setCod_barras(sc.nextInt());
			System.out.println("Introduce el nombre del distribuidor de la lechuga: ");
			String di = sc.next();
			distribulechu.add(di);

			lechugas.add(lechuga);
			}
		}
		
		public void imprimirLechuga() throws IOException{
			System.out.println(" \n\n**************lechugas**************" );
			for (int lechu=0 ; lechu < lechugas.size(); lechu++){

				System.out.println(" \n\nTipo de lechuga: "+lechugas.get(lechu).getTipoLechuga() );
	            System.out.println(" \nProcedencia: "+lechugas.get(lechu).getProcedencia());
	            System.out.println(" \nColor : "+lechugas.get(lechu).getColor() );
	            System.out.println(" \nEuros Unidad: "+lechugas.get(lechu).getEurosUniad());

	            
	            ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

	            distribuidores=Leerdistri.Leer();

	           
		        for(int d=0; d<distribuidores.size(); d++)
	        	{
	        		if (distribulechu.get(lechu).equalsIgnoreCase(distribuidores.get(d).getNombre())){
	            	System.out.println("  -------Distribuidor de la lechuga-----------");
	            	
	            		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
	            		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
	            		//---
	            		System.out.println(" \n 	Direccion:" );
	            		System.out.println(" \n    		Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
	            		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
	            		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
	            		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
	            		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
	            		//---
	            		System.out.println(" \n 	Contacto: " );
	            		System.out.println(" \n     	Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
	            		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
	            		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
	            		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
	            		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
	            		}
	        	}
	        }
		}

}
package almacen.gestion;


import java.util.*;
import java.io.*;


public class Leche extends Productos {

//propiedades
private String tipo;
private String procedencia;


//métodos getter y setter
		public Leche() {
			super();
		}
		
		public String getTipo()
		{
			return tipo;
		}
		
		public void  setTipo(String tipo1)
		{
			tipo=tipo1;
		}

		public String getProcedencia()
		{
			return procedencia;
		}
		
		public void  setProcedencia(String procedencia1)
		{
			procedencia=procedencia1;
		}

		

		



		
//**********Metodos ecribir e imprimir******************************
		
		ArrayList<Leche> leches = new ArrayList<Leche>();
        ArrayList<String> distribuleche = new ArrayList<String>();
		Distribuidor dist = new Distribuidor();
		Scanner sc = new Scanner(System.in);
public  void escribirLeche() throws IOException{
	
	System.out.println("\nCuantas Leches quieres registrar?: ");
	int cuantas = sc.nextInt();
	
	System.out.println("**************leche************** ");
	for (int l=0 ; l<cuantas; l++){
		Leche leche = new Leche();
		System.out.println("Introduce el tipo de leche: ");
		leche.setTipo(sc.next());
		System.out.println("Introduce la procedencia de la leche: ");
		leche.setProcedencia(sc.next());
		System.out.println("Introduce la cantidad de litros de leche: ");
		leche.setEurosLitro(sc.nextDouble());
		System.out.println("Introduce el numero del codigo de barras de la leche: ");
		leche.setCod_barras(sc.nextInt());
		System.out.println("Introduce el nombre del distribuidor de la leche: ");
		String di = sc.next();
		

		leche.setDistribuidor(dist.leerDistri(di));
		leches.add(leche);

	}
}

public void imprimirLeche() throws IOException{
	//---------impresion de la leche con sus respectivos distribuidores-------------
    System.out.println(" \n\n**************Leche**************" );
	for (int m=0 ; m < leches.size(); m++){

		System.out.println(" \n\nTipo de leche: "+leches.get(m).getTipo() );
        System.out.println(" \nProcedencia: "+leches.get(m).getProcedencia());
        System.out.println(" \nEuros Litro: "+leches.get(m).getEurosLitro());
        //System.out.println(" \nDistribuidor: "+leches.get(m).getDistribuidor().get(m).getNombre());
        
        
        //ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

       // distribuidores=Leerdistri.Leer();
        //Distribuidores distribuidores = new Distribuidores();
       
        //for(int d=0; d<getDistribuidor().size(); d++)
    	//{
    		//if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
        	System.out.println("  -------Distribuidor de la leche-----------");
        	
        		System.out.println(" 	Nombre: "+getDistribuidor().get(m).getNombre() );
        		System.out.println(" \n 	CIF: "+getDistribuidor().get(m).getCif());
        		//---
        		System.out.println(" \n 	Direccion:" );
        		System.out.println(" \n     	Ciudad: "+ getDistribuidor().get(m).getDireccion().getCiudad());
        		System.out.println(" \n     	Calle: "+ getDistribuidor().get(m).getDireccion().getCalle());
        		System.out.println(" \n     	Piso: "+ getDistribuidor().get(m).getDireccion().getPiso());
        		System.out.println(" \n     	Portal: "+ getDistribuidor().get(m).getDireccion().getPortal());
        		System.out.println(" \n     	Codigo Postal: "+ getDistribuidor().get(m).getDireccion().getCodPostal());
        		//---
        		System.out.println(" \n 	Contacto: " );
        		System.out.println(" \n    		Nombre: "+ getDistribuidor().get(m).getPersonaContacto().getNombre());
        		System.out.println(" \n     	Apellido: "+ getDistribuidor().get(m).getPersonaContacto().getApellido());
        		System.out.println(" \n     	DNI: "+ getDistribuidor().get(m).getPersonaContacto().getDni());
        		System.out.println(" \n     	Email: "+ getDistribuidor().get(m).getPersonaContacto().getEmail());
        		System.out.println(" \n     	Telefono: "+ getDistribuidor().get(m).getPersonaContacto().getTelefono());
        		//}
    	//}
    }
}


}
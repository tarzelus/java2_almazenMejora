
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
		Scanner sc = new Scanner(System.in);
public  void escribirLeche(){
	
	System.out.println("\nCuantas Leches quieres registrar?: ");
	int cuantas = sc.nextInt();
	
	System.out.println("**************leche************** ");
	for (int l=0 ; l<cuantas; l++){
		Leche leche = new Leche();
		System.out.println("Introduce el tipo de leche: ");
		setTipo(sc.next());
		System.out.println("Introduce la procedencia de la leche: ");
		setProcedencia(sc.next());
		System.out.println("Introduce la cantidad de litros de leche: ");
		setEurosLitro(sc.nextDouble());
		System.out.println("Introduce el numero del codigo de barras de la leche: ");
		leche.setCod_barras(sc.nextInt());
		System.out.println("Introduce el nombre del distribuidor de la leche: ");
		String di = sc.next();
		distribuleche.add(di);
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
        
        ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

        distribuidores=Leerdistri.Leer();

       
        for(int d=0; d<distribuidores.size(); d++)
    	{
    		if (distribuleche.get(m).equalsIgnoreCase(distribuidores.get(d).getNombre())){
        	System.out.println("  -------Distribuidor de la leche-----------");
        	
        		System.out.println(" 	Nombre: "+distribuidores.get(d).getNombre() );
        		System.out.println(" \n 	CIF: "+distribuidores.get(d).getCif());
        		//---
        		System.out.println(" \n 	Direccion:" );
        		System.out.println(" \n     	Ciudad: "+ distribuidores.get(d).getDireccion().getCiudad());
        		System.out.println(" \n     	Calle: "+ distribuidores.get(d).getDireccion().getCalle());
        		System.out.println(" \n     	Piso: "+ distribuidores.get(d).getDireccion().getPiso());
        		System.out.println(" \n     	Portal: "+ distribuidores.get(d).getDireccion().getPortal());
        		System.out.println(" \n     	Codigo Postal: "+ distribuidores.get(d).getDireccion().getCodPostal());
        		//---
        		System.out.println(" \n 	Contacto: " );
        		System.out.println(" \n    		Nombre: "+ distribuidores.get(d).getPersonaContacto().getNombre());
        		System.out.println(" \n     	Apellido: "+ distribuidores.get(d).getPersonaContacto().getApellido());
        		System.out.println(" \n     	DNI: "+ distribuidores.get(d).getPersonaContacto().getDni());
        		System.out.println(" \n     	Email: "+ distribuidores.get(d).getPersonaContacto().getEmail());
        		System.out.println(" \n     	Telefono: "+ distribuidores.get(d).getPersonaContacto().getTelefono());
        		}
    	}	
    }
}


}
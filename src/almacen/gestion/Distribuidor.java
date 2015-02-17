package almacen.gestion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Distribuidor {
//propiedades
	private String nombre;
	private String cif;
	private Direccion direccion;
	private Contacto personaContacto;
	

//metodos getter y setter

	public String getNombre()
			{
				return nombre;
			}
			
			public void  setNombre(String nombre1)
			{
				nombre=nombre1;
			}

	public String getCif()
			{
				return cif;
			}
			
			public void  setCif(String cif1)
			{
				cif=cif1;
			}


	public Direccion getDireccion()
			{
				return direccion;
			}
			
			public void  setDireccion(Direccion direccion1)
			{
				direccion=direccion1;
			}


	public Contacto getPersonaContacto()
			{
				return personaContacto;
			}
			
			public void  setPersonaContacto(Contacto personaContacto1)
			{
				personaContacto=personaContacto1;
			}
			
			public ArrayList<Distribuidor> leerDistri(String di) throws IOException{
				
				
			//	ArrayList<String> distribuman = new ArrayList<String>();
			  //      ArrayList<String> distribuleche = new ArrayList<String>();

			Scanner sc = new Scanner(System.in);

					
					ArrayList<Distribuidor> distribuidores = new ArrayList<Distribuidor>();

						String ruta = "/home/zubiri/Proyectosjava/java2_almacen/src/distribuidores.txt";
			 			File archivo2 = new File(ruta);
						FileReader leer2 = new FileReader (archivo2);
						BufferedReader bf2 = new BufferedReader(leer2);
						String salida2 = bf2.readLine();

				        
				        
				        String [] cortarString = null;
				        String [] cortarString1 = null;	
				        String [] cortarString2 = null;	
				        String [] cortarString3 = null;	
				        Distribuidor distribuidor = new Distribuidor();
				        
				        Contacto contacto = new Contacto();
			       		Direccion direccion = new Direccion();
			       		Productos productos = new Productos();
			       		// manzana = new Manzana();

				       
				        while(salida2!=null){
				        	//separa el string de la  linea usara el ; como referencia de la separacion
				        	
				        	cortarString = salida2.split("#");
				        
				        	
				       		
				       		cortarString1 = cortarString[0].split(",");
				       		if (cortarString1[0]== di){
					       		distribuidor.setNombre (cortarString1[0]);
					       		distribuidor.setCif (cortarString1[1]);
	

					       		cortarString2 = cortarString[1].split(",");
					       		direccion.setCiudad  (cortarString2[0]);
					       		direccion.setCalle  (cortarString2[1]);
					       		direccion.setPiso  (cortarString2[2]);
					       		direccion.setPortal  (Integer.parseInt(cortarString2[3]));
					       		direccion.setCodPostal  (Integer.parseInt(cortarString2[4]));
					       		distribuidor.setDireccion(direccion);
	
					       		
					       		cortarString3 = cortarString[2].split(",");
					       		contacto.setNombre (cortarString3[0]);
					       		contacto.setApellido (cortarString3[1]);
					       		contacto.setDni (cortarString3[2]);
					       		contacto.setEmail (cortarString3[3]);
					       		contacto.setTelefono (Integer.parseInt(cortarString3[4]));
					       		distribuidor.setPersonaContacto(contacto);
				   
					       		distribuidores.add(distribuidor);

					       	//	manzana.setDistribuidor(distribuidores);
				       		}
				       		salida2 = bf2.readLine();
				        }
					return distribuidores;
						
			}

}
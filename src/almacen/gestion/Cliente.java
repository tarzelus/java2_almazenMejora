package almacen.gestion;

import java.util.*;
import java.io.*;


public class Cliente {
//propiedades

private String nombre;
private String apellidos;
private String DNI;
private Direccion direccion;
private Double num_socio;
private Double dto;

//métodos getter y setter

public String getNombre(){
			return nombre;
		}
		
		public void  setNombre(String nombre1){
			nombre=nombre1;
		}

		public String getApellidos(){
			return apellidos;
		}
		
		public void  setApellidos(String apellidos1){
			apellidos=apellidos1;
		}

		public String getDNI(){
			return DNI;
		}
		
		public void  setDNI(String dni1){
			DNI=dni1;
		}

		public Direccion getDireccion(){
			return direccion;
		}
		
		public void  setDireccion(Direccion direccion1){
			direccion=direccion1;
		}

		public Double getNum_socio(){
			return num_socio;
		}
		
		public void  setNum_socio(Double num_socio1){
			num_socio=num_socio1;
		}

		public Double getDto(){
			return dto;
		}
		
		public void  setDto(Double dto1){
			dto=dto1;
		}

		public void leerCliente(){
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		
		    try{
				String ruta2 = "./clientes.txt";
					File archivo3 = new File(ruta2);
				FileReader leer3 = new FileReader (archivo3);
				BufferedReader bf3 = new BufferedReader(leer3);
				String salida3 = bf3.readLine();
		
				
		
		       
		        while(salida3!=null){
		        	//separa el string de la  linea usara el ; como referencia de la separacion
		        	String [] cortarString4 = salida3.split("#");
		         	
		
		       		Cliente cliente = new Cliente();
		       		String [] cortarString5 = cortarString4[0].split(",");
		       		cliente.setNombre (cortarString5[0]);
		       		cliente.setApellidos (cortarString5[1]);
		       		cliente.setDNI (cortarString5[2]);
		       		cliente.setNum_socio (Double.parseDouble(cortarString5[3]));
		       		cliente.setDto (Double.parseDouble(cortarString5[4]));
		       		
		       		
		       		Direccion direccionc = new Direccion();
		       		String [] cortarString6 = cortarString4[1].split(",");
		       		direccionc.setCiudad  (cortarString6[0]);
		       		direccionc.setCalle  (cortarString6[1]);
		       		direccionc.setPiso  (cortarString6[2]);
		       		direccionc.setPortal  (Integer.parseInt(cortarString6[3]));
		       		direccionc.setCodPostal  (Integer.parseInt(cortarString6[4]));
		       		cliente.setDireccion(direccionc);
		       		
		       		
		       		clientes.add(cliente);
		       		
		
		       		
		       		
		       		salida3 = bf3.readLine();
		        }
		       bf3.close();
		    }catch(Exception ioe){
		    	System.out.println("Error: "+ioe);
		    }
		    
		
		
		
				//---------------Impresion de la lista de clientes-----------------
			for (int cli=0 ; cli < clientes.size(); cli++){
		
				System.out.println(" \n\nNombre: "+clientes.get(cli).getNombre() );
		        System.out.println(" \nApellido: "+clientes.get(cli).getApellidos());
		        System.out.println(" \nDNI : "+clientes.get(cli).getDNI() );
		        System.out.println(" \nNumero de socio: "+clientes.get(cli).getNum_socio());
		        System.out.println(" \nDescuento "+clientes.get(cli).getDto());
			}
		
		}



}

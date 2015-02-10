import java.io.*;
import java.util.*;

public class  Cesta {
//propiedades
	private String nombreproducto;
	private Double precioku;
	private Double preciototalp;
	private Cliente cliente;
	private Double descuento;





//métodos getter y setter

	public String getNombreproducto()
		{
			return nombreproducto;
		}
		
	public void  setNombreproducto(String nombreproducto1)
		{
			nombreproducto=nombreproducto1;
		}

	public Double getPrecioku()
		{
			return precioku;
		}
		
	public void  setPrecioku(Double precioku1)
		{
			precioku=precioku1;
		}


	public Double getPreciototalp()
		{
			return preciototalp;
		}
		
	public void  setPreciototalp(Double preciototalp1)
		{
			preciototalp=preciototalp1;
		}







	public Cliente getCliente()
		{
			return cliente;
		}
		
	public void  setCliente(Cliente cliente1)
		{
			cliente=cliente1;
		}

		public Double getDescuento()
		{
			return descuento;
		}
		
		public void  setDescuento(Double descuento1)
		{
			descuento=descuento1;
		}
		
		public void cestaa(){
			//-----------------cesta---------------------------
			
			Double condescuento = 0.0;
			Double descuento1 = 0.0;
			Double totala = 0.0;

			Scanner sc = new Scanner(System.in);
			ArrayList<Cesta> cestas = new ArrayList<Cesta>();
			

		   	System.out.println("************Cesta*********** ");	   
		   	System.out.println("Introduce el codigo del cliente:");
		   		int numcli = sc.nextInt();

		   			try{
		   				//para buscar el cliente
							String ruta4 = "./clientes.txt";
				 			File archivo4 = new File(ruta4);
							FileReader leer4 = new FileReader (archivo4);
							BufferedReader bf4 = new BufferedReader(leer4);
							String salida4 = bf4.readLine();

							
					       
					        while(salida4!=null){
					        	//separa el string de la  linea usara el ; como referencia de la separacion
					        	
					        	String [] cortarString4 = salida4.split("#");
					         	Cliente cliente = new Cliente();
					       		String [] cortarString5 = cortarString4[0].split(",");
					       		cliente.setNombre (cortarString5[0]);
					       		cliente.setApellidos (cortarString5[1]);
					       		cliente.setDNI (cortarString5[2]);
					       		cliente.setNum_socio (Double.parseDouble(cortarString5[3]));
					       		cliente.setDto (Double.parseDouble(cortarString5[4]));
					       		
					       		Double nc =Double.parseDouble(cortarString5[3]);
					       		if (numcli == nc){
					       			descuento1= Double.parseDouble(cortarString5[4]);
					       		}
					       		
					       		salida4 = bf4.readLine();
					        }
					    }catch(Exception ioe){
					    	System.out.println("Error: "+ioe);
					    }

			System.out.println(" \ncuantos productos quieres añadira a la cesta? ");
    		int cuan = sc.nextInt();


		    for  (int ces=0 ; ces < cuan ; ces++){

			   	System.out.println("Introduce el codigo de barras del producto que quieras añadir a la cesta:");
			   		int codigo=sc.nextInt();


		            ArrayList<Manzana> manzanas = new ArrayList<Manzana>();

	
			   		//para recorrer manzanas
					for (int manz=0 ; manz < manzanas.size(); manz++){
			   				
			   				if  (codigo == manzanas.get(manz).getCod_barras()){
			   				Cesta cesta = new Cesta();
			   				cesta.setNombreproducto(manzanas.get(manz).getTipoManzana());
			   				cesta.setPrecioku(manzanas.get(manz).getEurosKilo());

			   				System.out.println("Cuantas manzanas: ");
			   				Double cuantas = sc.nextDouble();

			   				Double precio = cuantas * manzanas.get(manz).getEurosKilo();
			   				cesta.setPreciototalp(precio);
			   				condescuento = (1-descuento1) * precio;
			   				cesta.setDescuento(condescuento); 

			   				cestas.add(cesta);
			   				
			   				}
			   				
				
					}
			//para recorrer leches
					

		            ArrayList<Leche> leches = new ArrayList<Leche>();

					for (int lech=0 ; lech < leches.size(); lech++){
			   				
			   				if  (codigo == leches.get(lech).getCod_barras()){
			   				Cesta cesta = new Cesta();
			   				cesta.setNombreproducto(leches.get(lech).getTipo());
			   				cesta.setPrecioku(leches.get(lech).getEurosLitro());

			   				System.out.println("Cuantas leches: ");
			   				Double cuantas = sc.nextDouble();

			   				Double precio = cuantas * leches.get(lech).getEurosLitro();
			   				cesta.setPreciototalp(precio);
			   				condescuento = (1-descuento1) * precio;
			   				cesta.setDescuento(condescuento); 

			   				cestas.add(cesta);
			   				
			   				}
			   				
				
					}

			   		//para recorrer el array de lechugas

		            ArrayList<Lechuga> lechugas = new ArrayList<Lechuga>();
					
			   		for (int lechu=0 ; lechu < lechugas.size(); lechu++){
			   				
			   				if  (codigo == lechugas.get(lechu).getCod_barras()){
			   				Cesta cesta = new Cesta();
			   				cesta.setNombreproducto(lechugas.get(lechu).getTipoLechuga());
			   				cesta.setPrecioku(lechugas.get(lechu).getEurosUniad());

			   				System.out.println("Cuantas lechugas: ");
			   				Double cuantas = sc.nextDouble();

			   				Double precio = cuantas * lechugas.get(lechu).getEurosUniad();
			   				cesta.setPreciototalp(precio);
			   				condescuento = (1-descuento1) * precio;
			   				cesta.setDescuento(condescuento); 

			   				cestas.add(cesta);
			   				
			   				}
			   				
				
					}
					

					System.out.println(cestas.get(ces).getPreciototalp());
			   		System.out.println(condescuento);
				}

				for (int cest=0 ; cest < cestas.size(); cest++){
					System.out.println(" \nNombre del producto: "+cestas.get(cest).getNombreproducto() );
					System.out.println(" \nPrecio unidad/kilo: "+cestas.get(cest).getPrecioku() );
					System.out.println(" \nPrecio sin descuento: "+cestas.get(cest).getPreciototalp() );



					totala = totala + cestas.get(cest).getDescuento();
				

				}

			System.out.println(" Este es el valor de la compra con descuento "+totala );	


   		System.out.println(" \nQue quieres hacer?:" );
    	System.out.println(" \n 	1) Introducir nuevo producto" );
    	System.out.println(" \n 	2) Lectura de productos" );
    	System.out.println(" \n 	3) Ver los Clientes" );
    	System.out.println(" \n 	4) Crear Cesta" );
    	int quehacer = sc.nextInt();



		}


}


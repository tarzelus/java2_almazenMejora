package almacen.gestion;

import java.util.ArrayList;

public class Productos implements Modificar{
	private ArrayList<Distribuidor> distribuidor;
	private int cod_barras;
	private Double eurosKilo, eurosUnidad, eurosLitro;
		
	public  ArrayList<Distribuidor> getDistribuidor()
	{
		return distribuidor;
	}
	
	public void  setDistribuidor(ArrayList<Distribuidor> distribuidor2)
	{
		distribuidor=distribuidor2;
	}
	
	public int getCod_barras()
	{
		return cod_barras;
	}
	
	public void  setCod_barras(int cod_barras1)
	{
		cod_barras=cod_barras1;
	}
	public Double getEurosKilo()
	{
		return eurosKilo;
	}
	
	public void  setEurosKilo(Double eurosKilo1)
	{
		eurosKilo=eurosKilo1;
	}

	public Double getEurosUniad()
	{
		return eurosUnidad;
	}
	
	public void  setEurosUnidad(Double eurosUnidad1)
	{
		eurosUnidad=eurosUnidad1;
	}
	
	public Double getEurosLitro()
	{
		return eurosLitro;
	}
	
	public void  setEurosLitro(Double eurosLitro1)
	{
		eurosLitro=eurosLitro1;
	}

	@Override
	public void Borrar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Modificar() {
		// TODO Auto-generated method stub
		
	}

}
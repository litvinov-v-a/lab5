package ru.litvinov.lab5;

/**
* Класс "Цилиндр"
*
*  @author Litvinov V.A. 
*/

public class Cylinder extends Body
{

	private double r, h, S, V;
	
	public Cylinder(double r, double h)
	{
		this.r = r;
		this.h = h;
		this.setName("Цилиндр");
	}


	/**
	 * Метод вычисления площади
	 * 
	 */   
	@Override
	public double getArea() 
	{
		S = 2*3.14*r*(h+r);
		return S;
	}

	/**
	 * Метод вычисления объема
	 * 
	 */   
	@Override
	public double getV() 
	{
		V = 3.14*r*r*h;
		return V;
	}
	
	public double getR()
	{
		return r;
	}
	
	/**
	 * Метод вычисления диаметра
	 * 
	 */   
	public double getD()
	{
		return 2*r;
	}
	
	
	public double getH()
	{
		return h;
	}
	
	public String toString()
    {
		String str;
        str = this.getTime() + ";" + " ID = " + this.getId() + " - " + this.getName() + " \n";
        str = str + "Радиус = " + this.getR() + "; Высота = " + this.getH() + "; Диаметр = " + this.getD() +"\n";
        str = str + "Площадь: " + this.getArea()  +"\n" ;
        str = str + "Объем: " + this.getV() +  "\n-----------------";
        return str;
    }
}

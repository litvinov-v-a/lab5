package ru.litvinov.lab5;

/**
* Класс "шар"
*
*  @author Litvinov V.A. 
*/

public class Ball extends Body
{
	private double r, S, V;

	public Ball(double r)
	{
		this.r = r;
		this.setName("Шар");
	}

	/**
	 * Метод вычисления площади
	 * 
	 */   
	@Override
	public double getArea() 
	{
		S = 4*3.14*r*r;
		return S;
	}

	/**
	 * Метод вычисления объема
	 * 
	 */   
	@Override
	public double getV() 
	{
		V = (4*3.14*r*r*r)/3;
		return V;
	}
	
	double getR()
	{
		return r;
	}
	
	double getD()
	{
		return 2*r;
	}
	
	public String toString()
    {
		String str;
        str = " ID = " + this.getId() + " - " + this.getName() + " \n";
        str = str + "Радиус = " + this.getR() + "; Диаметр = " + this.getD() + "\n";
        str = str + "Площадь: " + this.getArea()  +"\n" ;
        str = str + "Объем: " + this.getV() +  "\n-----------------";
        return str;
    }

}

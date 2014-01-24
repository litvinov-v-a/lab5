package ru.litvinov.lab5;

/**
* Класс "Тетраэдр"
*
*  @author Litvinov V.A. 
*/

public class Tetraider extends Body
{
	private double a, V, S;

	public Tetraider(double a)
	{
		this.a = a;
		this.setName("Тетраэдр");
	}

	/**
	 * Метод вычисления площади
	 * 
	 */   
	@Override
	public double getArea() 
	{
		S = Math.sqrt(3)*a*a;
		return S;
	}

	/**
	 * Метод вычисления объема
	 * 
	 */   
	@Override
	public double getV() 
	{
		V = (Math.sqrt(2)*a*a*a)/12;
		return V;
	}

	public double getA()
	{
		return a;
	}
	
	/**
	 * Метод вычисления радиуса вписанной в тетраэдр сферы
	 * 
	 */   
	public double getRadVpS() 
	{
		return (Math.sqrt(6)*a) / 12;
	}
	
	/**
	 * Метод вычисления радиуса описанной около тетраэдра сферы
	 * 
	 */   
	public double getRadOpS() // радиус описанной сфера
	{
		return (Math.sqrt(6)*a) / 4;
	}
	
	public String toString()
    {
		String str;
        str = " ID = " + this.getId() + " - " + this.getName() + " \n";
        str = str + "Длина ребра:" + this.getA() + "\n";
        str = str + "Площадь: " + this.getArea()  +"\n" ;
        str = str + "Объем: " + this.getV() +  "\n";
        str = str + "Радиусы: Вп.сфера = " + this.getRadVpS() +  "; Оп. сфера = " + this.getRadOpS() + "\n-----------------";
        
        return str;
    }
}

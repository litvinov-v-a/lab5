package ru.litvinov.lab5;

/**
* Класс "Куб"
*
*  @author Litvinov V.A. 
*/

public class Cube extends Body
{

	private double a, S, V;
	
	/**
	 * Конструктор
	 * 
	 */ 
	public Cube(double a)
	{
		this.a = a;
		this.setName("Куб");
	}

	/**
	 * Метод вычисления площади
	 * 
	 */   
	@Override
	public double getArea() 
	{
		S = 6*a*a;
		return S;
	}

	/**
	 * Метод вычисления объема
	 * 
	 */   
	@Override
	public double getV() 
	{
		V = a*a*a;
		return V;
	}
	
	public double getA()
	{
		return a;
	}
	
	/**
	 * Метод вычисления радиуса вписанной в куб сферы
	 * 
	 */   
	public double getRadVpS() 
	{
		return a/2;
	}
	/**
	 * Метод вычисления радиуса описанной около куба сферы
	 * 
	 */ 
	public double getRadOpS() 
	{
		return (Math.sqrt(3)*a) / 2;
	}
	
	public String toString()
    {
		String str;
        str =   this.getTime() + ";" + " ID = " + this.getId() + " - " + this.getName() + " \n";
        str = str + "Длина ребра:" + this.getA() + "\n";
        str = str + "Площадь: " + this.getArea()  +"\n" ;
        str = str + "Объем: " + this.getV() +  "\n";
        str = str + "Радиусы: Вп.сфера = " + this.getRadVpS() +  "; Оп. сфера = " + this.getRadOpS() + "\n-----------------";
        
        return str;
    }
}

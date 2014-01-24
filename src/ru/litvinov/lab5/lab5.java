package ru.litvinov.lab5;

/**
 * Основной класс программы
 *
 *  @author Litvinov V.A. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class lab5
{
	private static List<Body> list; 
	
	public static void main(String[] args) throws IOException
    {
        inputData();
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        String str, st;
        boolean sortDown = false;
        int sortMode = 0;
        double a,r,h;
        
        
        outputData( sortDown, sortMode);
        for ( ; ; )
        { 
            System.out.println("--------------------------------------------------");
            System.out.println("                Сортировка:                      ");
	        System.out.println("--------------------------------------------------");
	        System.out.println(" 1) - по убыванию ID");
	        System.out.println(" 2) - по возврастанию ID");
	        System.out.println(" 3) - по убыванию имени");
	        System.out.println(" 4) - по возврастанию имени");
	        System.out.println(" 5) - по убыванию площади");
	        System.out.println(" 6) - по увеличению площади");
	        System.out.println(" 7) - добавить элемент");
            System.out.println(" 8) - удалить элемент");
        
	        System.out.println(" 0) - Выход");
	        System.out.println("--------------------------------------------------");
	        System.out.print(  " === > ");
	        str = input.readLine();
	        System.out.println("--------------------------------------------------");
        
	        if ( str.equals("0") ) break;
        
	        sortDown = str.equals("1") || str.equals("3") || str.equals("5");   // убывание - возрастание
	        sortMode = -1;
	        if ( str.equals("1") || str.equals("2") || str.equals("7") || str.equals("8") )  sortMode = 0;  // по ID
	        if ( str.equals("3") || str.equals("4") )  sortMode = 1;  // по имени
	        if ( str.equals("5") || str.equals("6") )  sortMode = 2;  // по площади
	        
	        
	        
	        if(str.equals("7")) // добавить
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("                 Добавление элемента");
            	System.out.println("--------------------------------------------------");
            	System.out.println(" Выберите тип нового элемента:");
            	System.out.println("--------------------------------------------------");
            	System.out.println(" 1) - Шар");
            	System.out.println(" 2) - Куб");
               	System.out.println(" 3) - Тетраэдр");
               	System.out.println(" 4) - Цилиндр");
                System.out.println("--------------------------------------------------");
                System.out.print(  " === > ");
                st = input.readLine();
                System.out.println("--------------------------------------------------");
             
                if ( st.equals("1") )
                {
                	System.out.print(" Введите радиус шара:");
                	r = Double.parseDouble( input.readLine() );
                    list.add( new Ball( r) );
                }
                if ( st.equals("2") )
                {
                	System.out.print(" Введите ребро куба:");
                	a = Double.parseDouble( input.readLine() );
                    list.add( new Cube( a) );
                }
                if ( st.equals("3") )
                {
                	System.out.print(" Введите ребро тетраэдра:");
                	a = Double.parseDouble( input.readLine() );
                    list.add( new Tetraider( a) );
                }
                if ( st.equals("4") )
                {
                	System.out.print(" Введите радиус цилиндра: ");
                	r = Double.parseDouble( input.readLine() );
                	System.out.print(" Введите высоту цилиндра: ");
                	h = Double.parseDouble( input.readLine() );
                    list.add( new Cylinder( r, h) );
                }
                
              
                System.out.println("--------------------------------------------------  ");
            }
            
            if(str.equals("8"))
            {
            	System.out.println("--------------------------------------------------");
            	System.out.println("                 Удаление элемента");
            	System.out.println("--------------------------------------------------");
            	System.out.print(" Введите ID объекта: ");
            	
            	st = input.readLine();
            	int id = Integer.parseInt(st);
            	
            	for(int i = 0; i< list.size(); i++)
            	{
                    if( list.get(i).getId() == id) 
                    {
                        list.remove(i);
                        break;
                    }
            	}
            	
            	System.out.println("--------------------------------------------------");
            }
            if( sortMode < 0 )
            {
                System.out.println("|      Ошибка при вводе. Попробуйте еще раз...   |");
                System.out.println("==================================================");  
            }
            else 
            {
            	 outputData( sortDown, sortMode);
            }
        }
    }
    
    private static void outputData(boolean sortDown, int sortMode)
    {
    	 Collections.sort(list, new SortMode(sortDown,sortMode));
         
         for (Body p: list ) 
         {
             System.out.println(p);
         }
    }
    
    private static void inputData()
    {
    	list = new ArrayList();
    	
		list.add(new Ball(2));
    
    	list.add(new Cylinder(2, 4) );
      
        list.add(new Cube(7) );
     
        list.add(new Tetraider(8));        
    }
}

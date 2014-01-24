package ru.litvinov.lab5;

import java.util.Comparator;
/**
  *  Класс содержащий в себе параметры сортировки объектов
  *
  *  @author Litvinov V.A. 
  */

public class SortMode implements Comparator<Body>
{
    private int sortMode;
    private boolean sortDown;
    
    public SortMode(boolean sortDown, int sortMode) 
    {
    	this.sortDown = sortDown;
    	this.sortMode = sortMode;
    }
    
/**
 * Метод сравнения объектов
 *
 */ 
    public int compare(Body p1, Body p2) 
    {
    	int res = 0;
		    
        if ( sortMode == 0)
        {
            if ( p1.getId() > p2.getId() ) res = 1;  
            else res = -1;         
        }
	        
        if ( sortMode == 1 )
        {
            res = p1.getName().compareTo(p2.getName());
        }
	        
        if ( sortMode == 2 )
        {
            if ( p1.getArea() > p2.getArea() ) res = 1;
            else res = -1;
        }
	        
        if (sortDown) res*=(-1);

        return res;
    }
}

package ru.litvinov.lab5;

/**
* Абстрактный класс "тело"
*
*  @author Litvinov V.A. 
*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Body implements GetV, GetArea
{	
	 public int id;
	 private static int nextId = 1;
	 private String name;
     private boolean sortDown;
     private int sortMode;
     
     { id = nextId++; }
     
     
     public int getId()
     {
         return id;
     }
     
     public String getName()
     {
         return name;
     }
     
     public void setName(String name0)
     {
         name = name0;
     }
     
     public void setSortMode(int t)
     {
         sortMode = t;
     }
     
     public void setSortDown(boolean t)
     {
         sortDown = t;
     }
     
    public String getTime() 
    {
	DateFormat dateFormat = new SimpleDateFormat("dd.MM.YYYY HH:mm:ss");
	Date date = new Date();
        return dateFormat.format(date);
    }
    
}

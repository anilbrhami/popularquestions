package teststrings;

import java.util.ArrayList;
import java.util.List;

public class _Test {

	int getValue() 
	{
	    int returnValue = 10;
	    try 
	    {
	        String[] Languages = {"Java", "Ruby"};
	        System.out.println(Languages[5]);
	    }
	    catch (Exception e) 
	    {
	        System.out.println("Catch Block :" + returnValue);
	        return returnValue;
	    }
	    finally
	    {
	        returnValue += 10;
	        System.out.println("Finally Block :" + returnValue);
	    }
	return returnValue;
	}
	
	 public static void main(String[] args) {
		 {
			 _Test var = new _Test();
			    System.out.println("Main Block:" + var.getValue());
			   }
	 }
	}
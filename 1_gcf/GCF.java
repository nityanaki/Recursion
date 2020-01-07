//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - GCF lab: This lab creates a method that finds the greatest common factor between two numbers.

import java.util.*;
import static java.lang.System.*;   

public class GCF
{
	//instance variables, constructors, and other methods not shown 
	
	public static int gcf(int n1, int n2)
	{
		if (n1%n2==0)
			return n2;
		else
			return gcf(n2,n1%n2);
		
	}
}
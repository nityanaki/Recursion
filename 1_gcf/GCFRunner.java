//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - GCF lab: This lab creates a method that finds the greatest common factor between two numbers.

import java.util.*;
import static java.lang.System.*;

public class GCFRunner
{
	public static void main( String args[] )
	{
		//add test cases
		System.out.println("GCF(16,256) ----- " + GCF.gcf(16,256));
		System.out.println("GCF(1000,2000) ----- " + GCF.gcf(1000,2000));
		System.out.println("GCF(1254,2546) ----- " + GCF.gcf(1254,2546));
		System.out.println("GCF(214,356) ----- " + GCF.gcf(214,356));
		System.out.println("GCF(90,99) ----- " + GCF.gcf(90,99));
		System.out.println("GCF(21,28) ----- " + GCF.gcf(21,28));
		System.out.println("GCF(55,5) ----- " + GCF.gcf(55,5));
		System.out.println("GCF(315,211) ----- " + GCF.gcf(315,211));		
	}
}
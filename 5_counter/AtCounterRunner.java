//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class AtCounterRunner
{
	public static void main(String args[])
	{
		//instantiate an AtCounter
		AtCounter tom = new AtCounter();
		System.out.println(tom);
		//test the code
		System.out.println("0 0 has " + tom.countAts(0, 0) + " @s connected.");
		System.out.println("2 5 has " + tom.countAts(2, 5) + " @s connected.");
		System.out.println("5 0 has " + tom.countAts(5, 0) + " @s connected.");
		System.out.println("9 9 has " + tom.countAts(9, 9) + " @s connected.");
		System.out.println("3 9 has " + tom.countAts(3, 9) + " @s connected.");
	}
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		if (word.length()<7)
			return 0;
		else
		{
			for (int i=0;i<word.length()-6;i++)
			{
				String beg = word.substring(0,i);
				boolean found = false;
				if (word.substring(i, i+7).equals("chicken"))
					found = true;
				if (found)
					return 1+countChickens(beg+word.substring(i+7));
				else
					continue;
			}
		}
		return 0;
	}
}
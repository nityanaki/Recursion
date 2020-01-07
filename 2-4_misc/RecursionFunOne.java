//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int bubble=num/10;
		if (num>0)
		{
			int comp = (num%10);
				if (comp%2==1)
					return 1+countOddDigits(bubble);
			return 0+countOddDigits(bubble);
		}

		return 0;
	}
}
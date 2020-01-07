//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  - The constructor will randomly load @s and –s into the matrix.  Take a provided row and col location and count how many @ signs connect to the original location.  @ signs are connected if they are connected up, down, left, and right of one another.  You must use a matrix.


import static java.lang.System.*;

public class AtCounter
{
   private String[][] atMat;

	public AtCounter()
	{
		//size the matrix
		atMat = new String[10][10];
		//use nested loops to randomly load the matrix
		for (int r=0;r<atMat.length;r++)
		{
			for (int c=0;c<atMat[r].length;c++)
			{
				int rand = (int)(Math.random()*2)+1;
				if (rand==1)
					atMat[r][c]="@";
				else
					atMat[r][c]="-";
			}
		}
		//you will need to use Math.random()
	}

	public int countAts(int r, int c)
	{
		//add in recursive code to count up the # of @s connected
		//start checking at spot [r,c]
		if (r>-1&&c>-1&&r<atMat.length&&c<atMat[0].length&&atMat[r][c]=="-")
			return 0;
		else if (r>-1&&c>-1&&r<atMat.length&&c<atMat[0].length&&atMat[r][c]=="@")
		{
			atMat[r][c]="x";
			return 1 + countAts(r+1,c)+countAts(r,c+1)+countAts(r-1,c)+countAts(r,c-1);
		}
		else
			return 0;
	}

	/*
	 *this method will return all values in the matrix
	 *this method should return a view of the matrix
	 *that looks like a matrix
	 */
	public String toString()
	{
		String output="";
		for (int r=0;r<atMat.length;r++)
		{
			for (int c=0;c<atMat[r].length;c++)
			{
				output+=atMat[r][c]+" ";
			}
			output+="\n";
		}
		return output;
	}
}
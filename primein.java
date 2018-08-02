/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class prime
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   
	int s1, s2,count = 0, i, j;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the lower limit : "); 
		s1 = s.nextInt();
		System.out.print("Enter the upper limit :"); 
		s2 = s.nextInt();
		System.out.println("Prime numbers between given range are :");

		for(i = s1; i <= s2; i++)
		{
			for( j = 2; j < i; j++)
			{
				if(i % j == 0)
				{
					count = 0;
					break;
				}
				else
				{
					count = 1;
				}
			}
			if(count == 1)
			{
				System.out.println(i);
			}
		}
	}
}

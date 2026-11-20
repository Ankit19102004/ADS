import java.util.*;
import java.lang.*;
import java.io.*;

class test
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int M=sc.nextInt();
		String B="";
		while (M!=0){
		     B = B.concat(String.valueOf(A));
		    M= M-1;
		}
		System.out.println(B);

	}
}

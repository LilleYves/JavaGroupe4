package javaapplication2;

import java.util.Scanner;


public class JavaApplication2
{
	public static void main(String[] args)
	{
		Scanner accept =new Scanner(System.in);
		System.out.print("Enter first Number ");
			int a = accept.nextInt();
		System.out.print("Enter second Number ");
			int b = accept.nextInt();
		System.out.print("Enter third Number ");
			int c = accept.nextInt();
		System.out.println("The Average of the three numbers is : "+(a+b+c)/3);
		
	}
	
}

package Question2;

import java.util.Scanner;

public class MainApplication
{
	public static void main(String[] args) 
	{
		//System.out.println("MMS");
		MaxMinPrice m1=new MaxMinPrice();
		//System.out.println(m1);
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Select mode of price");
		System.out.println("1:maximun price");
		System.out.println("2:minimum price");
		int choice=scan.nextInt();
		
		switch(choice)
		{
		case 1: m1.maxProduct();
		       break;
		case 2:m1.minProduct();
		       break;
		}
	}
	

}

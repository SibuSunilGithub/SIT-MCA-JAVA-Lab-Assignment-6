/*
Write a program to perform division of two number after taking both the number as 
input from the user. Handle all the possible exceptions (/ by zero, number format etc) 
and display suitable messages.
*/

import java.util.Scanner;
import java.util.InputMismatchException;

class Ass{
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		
		try{
			System.out.print("Enter two numbers: ");
			int a=Integer.parseInt(sc.nextLine());
			int b=Integer.parseInt(sc.nextLine());
			int c=a/b;
			System.out.println("division of two numbers is: "+c);
		}catch(ArithmeticException ae){
			System.out.println("The value of b cant be zero.");
		}catch(NumberFormatException ne){
			System.out.println("You need to input only two integers.");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
/*
Create a custom exception class called InvalidAgeException. Write a program that 
prompts the user to enter their age. If the age is less than 0 or greater than 120, throw 
an InvalidAgeException.
*/

import java.util.Scanner;

class InvalidAgeException extends Exception{
	private String mes;
	InvalidAgeException(String mes){
		this.mes=mes;
	}
	public String getMessage(){
		return mes;
	}
	public String toString(){
		return mes;
	}
}5

class Ass{	
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		try{
			System.out.print("Enter your age: ");
			int age=Integer.parseInt(sc.nextLine());
			if(age<0 || age>120)
				throw new InvalidAgeException("The age should be in between 0 to 120");
			System.out.println("Your age is:"+age);
		}catch(NumberFormatException ne){
			System.out.println("You need to input only integer age.");
		}catch(InvalidAgeException ie){
			System.out.println(ie);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
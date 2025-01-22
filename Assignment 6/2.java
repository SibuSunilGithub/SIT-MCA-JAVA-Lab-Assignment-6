+/*
Write a program to store some number into an array and display them. Declare an 
integer array of size 5 in the main method. Ask the user for number of elements he/she 
wants to store in the array. If number of elements is more than the size of array, throw 
and handle ArrayIndexOutOfBoundsException. Define a method insertIntoArray(int 
a[], int size) to insert data into the array and make sure user is inserting integer data 
only otherwise handle the exception and display suitable message.
*/

import java.util.Scanner;

class Ass{
	Scanner sc =new Scanner(System.in);
	public void insertIntoArray(int a[], int size){
		for(int i=0;i<size;i++){
			System.out.print("Enter element "+i+": ");
			a[i]=Integer.parseInt(this.sc.nextLine());
		}
	}
	
	public static void main(String args[]){
		Ass ass = new Ass();
		int a[]=new int[5];
		try{
			System.out.print("Enter number of element: ");
			int size=Integer.parseInt(ass.sc.nextLine());
			if(size>5)
				throw new ArrayIndexOutOfBoundsException();
			ass.insertIntoArray(a,size);
		}catch(NumberFormatException ne){
			System.out.println("You need to input only inters.");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("The size of the array must be equal or less than 5.");
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
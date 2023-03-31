package assignment2;

/*Write a program that prompts the user to input a positive integer. It should then print the multiplication 
table of that number */
 
import java.util.Scanner;
 
 public class Maltiplicationtable {
     
	 int n;
	
	 public static void main(String[] args) {
	Scanner s = new Scanner (System.in);	 
    System.out.print(" Enter the value : ");
		 int n = s.nextInt();
		  
		 
	 if ( n>=0)
		 {
		 
		 for (int i=1; i<=10; i++)
		 
			 System.out.println( n*i );
		 }
     }
 }

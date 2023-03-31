package assignment2;

/*Write a Java program that accepts two double variables and test 
if both strictly between 0 and 1 and false otherwise.*/
  
//Hint n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1
import java.util.Scanner;

public class BetweenZeroandOne {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        double n1 = scanner.nextDouble();
	        
	        System.out.print("Enter the second number: ");
	        double n2 = scanner.nextDouble();
	        
	        if (n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1) {
	            System.out.println("Both numbers are strictly between 0 and 1.");
	        } else {
	            System.out.println("At least one number is not strictly between 0 and 1.");
	        }        
	        // scanner.close();
	   }
  }
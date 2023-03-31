package assignment2;
  
import java.util.Scanner;
public class Menudriven_app {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        int choice;
	        
	        do {
	            System.out.println("Menu:");
	            System.out.println("1. Add");
	            System.out.println("2. Subtract");
	            System.out.println("3. Multiply");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            choice = scanner.nextInt();
	            
	            switch(choice) {
	                case 1:
	                    System.out.print("Enter first number: ");
	                    int num1 = scanner.nextInt();
	                    System.out.print("Enter second number: ");
	                    int num2 = scanner.nextInt();
	                    int sum = num1 + num2;
	                    System.out.println("Sum: " + sum);
	                    break;
	                
	                case 2:
	                    System.out.print("Enter first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter second number: ");
	                    num2 = scanner.nextInt();
	                    int diff = num1 - num2;
	                    System.out.println("Difference: " + diff);
	                    break;
	                
	                case 3:
	                    System.out.print("Enter first number: ");
	                    num1 = scanner.nextInt();
	                    System.out.print("Enter second number: ");
	                    num2 = scanner.nextInt();
	                    int product = num1 * num2;
	                    System.out.println("Product: " + product);
	                    break;
	                
	                case 4:
	                    System.out.println("Exiting...");
	                    break;
	                
	                default:
	                    System.out.println("Invalid choice. Please enter a valid choice.");
	            }
	        } while (choice != 4);
	        
	        scanner.close();

	}

}

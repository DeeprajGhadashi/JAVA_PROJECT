package assignment1;

/*wap that ask two numbers from user and print greater number among two*/

import java.util.Scanner;

public class Graternumber {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

      int num1;
      System.out.print("Enter num1: ");
      num1 = sc.nextInt();

	  int num2;
	  System.out.print("Enter num2: ");
	  num2 = sc.nextInt();	      

	  if ( num1>num2)
	    {
	     System.out.println(num1);
	    }
	  else
	    {
	     System.out.println(num2);
	    }
	     
	}
	
}


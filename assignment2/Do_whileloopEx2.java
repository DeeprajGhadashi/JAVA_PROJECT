package assignment2;

/* Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed.
The loop should ask the user whether he or she wishes to perform the operation again. If so,
the loop should repeat; otherwise it should terminate.(while loop)*/

import java.util.Scanner;

public class Do_whileloopEx2 {

	public static void main(String[] args) {
		int num1 ,num2,sum , i;
		   
     Scanner S1= new Scanner ( System.in);
          
     
     do { 
     
     	System.out.print("emter the number1: ");
         num1 = S1.nextInt();
         
        System.out.print(" enter the number2: ");
         num2 = S1.nextInt();
           
        sum=num1+num2;
        System.out.println(" the sum is: " + sum);
        
        System.out.println(" do you want to perform sum again then click (1/2) :");     
        i = S1.next().charAt(0);
        
     } 
     while (i ==1 || i==2);
     

	}

}

package assignment2;

/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 .....*/
import java.util.Scanner;

public class FibonacciSeries {
           
	
	public static void main(String[] args) {
		
		int num, a=0, b=0, c=1;
		
		Scanner S= new Scanner(System.in);
		     System.out.println(" enter the number : ");   
		      num  = S.nextInt();
		      
		     System.out.println(" fibonacci series:");
		      for ( int i=1 ; i<= num ; i++ )
		    	  
		      { 
		    	  
		      a=b;
		      b=c;
		      c=a=b;
		      System.out.print(a+" "); 
		      
		      
		   }
     	}
	}
	


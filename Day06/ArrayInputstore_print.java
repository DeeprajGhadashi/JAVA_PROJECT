package Day06;

//wap to ask 8 numbers from user and store them in an array and print them 
import java.util.Scanner;

public class ArrayInputstore_print {

	public static void main(String[] args) {
	
		/*
		 * int h[]= new int[100];
		 * h[0]=22;
		 * rest all array elements have value zero 
		 * 
		 * 
		 */
		
		Scanner s= new Scanner (System.in);
		System.out.println("enter size of array");
		int size= s.nextInt();
    	int k[]= new int[size];
		
		//System.out.println(k.length);

		
		for(int i=0;i<k.length;i++)
		{
		 System.out.println("enter number");
		
		k[i]= s.nextInt();
		}
		for(int i=0;i<k.length;i++)
		{
		System.out.println(k[i]);
		}
	
		
		
		
	}

}

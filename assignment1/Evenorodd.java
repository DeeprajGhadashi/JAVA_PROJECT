package assignment1;

/*wap to check is number is evenor odd.*/

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int num=s.nextInt(); 
		
		if(num%2==0)
        System.out.println(" the number is even");
		else
		System.out.println("the number is odd");
	}

	}

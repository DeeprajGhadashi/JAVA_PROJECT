package assignment1;

/*using ternary check if number entered by user is positive or negative .
In case number is positive store "Positive number" else store negative number to Result variable*/

import java.util.Scanner;

public class Ternarychecknumber {

	public static void main(String[] args) {
	
		Scanner s1= new Scanner(System.in);
		System.out.println("marks obtain:");
		int num=s1.nextInt();
     
	    String result= num>0 ?   "positive number" :"negative number" ;
	    System.out.println(result);
	
	}
}

package assignment1;

/* wap to demonstrate ternary operator .define a variable marks.ask its value from user 
and using ternary operator check if marks > 40 store "Pass" in result varible else store "Fail"*/

import java.util.Scanner;

public class Ternaryopreator {
	
    public static void main(String[] args) {
		
    	Scanner s1= new Scanner(System.in);
		System.out.print("marks obtain :");
		int marks=s1.nextInt();
		
	    String result = marks >40 ? "Pass" : "Fail";
		System.out.println("you are " + result );
	}
      
	}



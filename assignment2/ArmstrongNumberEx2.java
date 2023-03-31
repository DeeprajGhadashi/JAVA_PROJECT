package assignment2;

/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the 
 * number is equal to the number itself, then the number is called an Armstrong number.
  For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/

public class ArmstrongNumberEx2 {

	public static void main(String[] args) {
	
		int i= 1, a,b, c;
		while ( i <=500)  //153
		{
			a=i%10;          //a=3
			b=i%100;          //b=53
			c=(b-a)/10;       //(53-3)10+5
			c=i/100;  //1
			
		 if((a*a*a)+(b*b*b)+(c*c*c)==i)
		  
			 System.out.println(i);
		    i++;
		}	
    }
}



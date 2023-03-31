package assignment2;

/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each digit of the 
 * number is equal to the number itself, then the number is called an Armstrong number.
  For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/

public class ArmstrongNumbersEx2 {

	public static void main(String[] args) {
		 
		int i= 1 , arm;
		System.out.println(" armstrong number betwwen 1 to 500");
		while ( i< 500)
		{
			arm= armstrongornot (i);
			if (arm==i)
              System.out.println(i);
			i++;
		}   
	}    
	  static int armstrongornot ( int num)
	  {  
         int x, a=0;
	while ( num!=0)
	{ 
	    x= num%10;
	    a=a+(x*x*x);
	    num/=10;}

		return a;
		
     }
}

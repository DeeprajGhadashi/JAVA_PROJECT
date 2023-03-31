package assignment2;

//Write program to find largest among three numbers

public class Largestbetwwenthree {

	public static void main(String[] args) {
		int a=10,b=20,c=30;
	// using ternary operator
	/*	 int max=a>b? ( (b>c)? b:c ) : ((c>a)? c:a);
		 System.out.println("maximum value is : " + max); */
	
	// using nested if..else	
		if(a>b)                                       
		{                                              
	        if(a>c)
	        System.out.println(a);
	        else
	        System.out.println(c);
		}
		else
		{
	         if(b>c)
	        System.out.println(b);
	        else
	 	        System.out.println(c);
		}    
	}
}






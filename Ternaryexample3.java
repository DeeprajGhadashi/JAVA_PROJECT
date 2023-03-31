package day2;
   //wap to find max of three numbers using ternary operator 

   //nested ternary operator 
public class Ternaryexample3 
{

	public static void main(String[] args)
	
		{ 
		int a= 27;
		int b= 3;
		int c= 5;
	   // int maxresult=(a<b) ? ((c>b)? c : b ) : ((c>a)? c : a);
		
	  
	    
	 //condition ?  ( condition ? variable1 : variable2 )  :( condition ? variable1 : variable2 )
	   int min = (a<=b) ?    ((a<=c)?a:c)      :((b<=c)?b:c );
	  	
	// System.out.println(" the maximum value is " +maxresult);	
	   
	 
	System.out.println(min);
		}
}
 
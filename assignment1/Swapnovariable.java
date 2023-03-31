package assignment1;

//How to swap two numbers without using a third variable?

public class Swapnovariable {

	public static void main(String[] args) {
		
		int a=20;
        int b=45;
        System.out.println("Before swaping the numbers :");	
	    System.out.println("First number :" + a);
	    System.out.println("Second number :" +b);
	    
            a=a+b;         // 20+45=65
            b=a-b;         // 65-45=20
            a=a-b;         //65-20=45
           
            System.out.println("Before swaping the numbers :");	
    	    System.out.println("First number :" + a);
    	    System.out.println("Second number :" +b);
    	    
        
    } 

}

package assignment1;

/* wap to ask product name and price of product from user and calculate discount i.e 
if price > 2000 then discount is 10 percent of price 
else 
discount is 7 % of price*/

import java.util.Scanner;

public class discount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	      double discount,finalprice;
	      
		  String name;
	      System.out.print("Enter name: ");
	      name = s.nextLine();
		
	      int initialprice;
	      System.out.print("Enter num1: ");
	      initialprice = s.nextInt();
	      
	      if(initialprice >=2000)
	      {
	    	  discount = 0.1 * initialprice;
	    	 // finalprice= initialprice-discount;
		     //System.out.println(discount);
	      }
	      else
	      {
	    	  discount = 0.07 * initialprice;
	    	 // finalprice= initialprice-discount;
	    	 //System.out.println(discount);
	      }
	     finalprice= initialprice-discount;
	      
	     System.out.println(discount);
	      
		
	}

}

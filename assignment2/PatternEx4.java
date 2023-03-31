package assignment2;

/*Write a program to print following :
iv)
         *
       ***
     *****
   *******
 *********


     


*/
public class PatternEx4 {

	public static void main(String[] args) {
		
		int i,j,k;
		for(i=1; i<=9;i++) {
			if(i%2==0) {
				continue;
			}
			for(j=0;j<=9-i;j++) {
				System.out.print(" ");
			}
			for(k=j;k<=9;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	  }
   }


package assignment2;
/*Write a program to print following :



i)

****
****
****
****  10*4

*/

public class patternEx1 {

	public static void main(String[] args) {
		for (int i=1;i<=4;i++) {
			
			for(int j=1;j<=10;j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

package assignment2;
/*
Write a program to print following :
ii)

*
**
***
****
*****

*/


public class PatternEx2 {

	public static void main(String[] args) {
		//int i,j;
		for ( int i=1;i<=5;i++) {
			for ( int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package assignment2;
 
/*Write a program to display first 1 to 20  even number on screen .
Terminate the program when number 16 is found using break command */

public class Evennumber_break {

	public static void main(String[] args) {
		int count = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
            }
            if (i == 16) {
                System.out.println("Terminating the program...");
                break;
            }
        }
        System.out.println("Total even numbers displayed: " + count);

	}

}

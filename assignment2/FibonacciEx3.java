package assignment2;

public class FibonacciEx3 {

	public static void main(String[] args) {
		 int n = 500, firstTerm = 0, secondTerm = 1;
	        
		    System.out.println("Fibonacci Series Upto " + n + ": ");
		    
		    while (firstTerm <= n) {
		      System.out.print(firstTerm + ", ");

		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
		    }
	}

}

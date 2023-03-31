package Day06;

//one dimensional array 
//1 d array  searching | sorting |traversal 

public class Array1D_Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       int u[]= {13,4545,454,545,56,76};
		
		// line 15 will print array  from 0 to 5 index
		for(int i=0;i<u.length;i++)			
		System.out.print ("    "+u[i]);
		  
		System.out.println();
		  
		// line 21 will print array  from 5 to 0 index
		// printing array in reverse order
		for(int i=u.length-1 ;i>=0 ;i--)
			System.out.print ("    "+u[i]);
		
		
	}

}

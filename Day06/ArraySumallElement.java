package Day06;

//wap to define an array and print sum of all array elements 

public class ArraySumallElement {

	public static void main(String[] args) {
       int k[]= {11,2,3,4,6,7,8};
		
		//for each 
		for(int u : k)			
		System.out.println(u);
		
			
		
		int sum=0;
		
		//for(int i=0;i<k.length;i++)
		//		sum +=k[i];
		
		for(int m  : k)			
		sum+=m; 
		System.out.println(sum);
		

	}

}

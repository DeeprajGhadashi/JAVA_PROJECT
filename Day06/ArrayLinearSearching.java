package Day06;

//wap to  ask 10 roll number from user  
//and search for particular value and also print its index position
//linear searching 
import java.util.Scanner;
public class ArrayLinearSearching {

	public static void main(String[] args) {
int k[]= new int [10];
		
		Scanner s= new Scanner(System.in);
		
		for(int i=0;i<10 ;i++)
		{
			System.out.println("enter roll number");
			k[i]= s.nextInt();
		}
		//searching number 5 exists in array or not 
		int x;
		for( x= 0;x<10;x++)
		{
			if(k[x]==5)
			{
				System.out.println(" found");
				break;
				
			}
			
		}
		if( x==10)
		{
			System.out.println("not found");
		}
		
		

	}


	}



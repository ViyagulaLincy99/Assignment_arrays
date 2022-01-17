//write a program to add two integer array and dislay the values
import java.util.Scanner;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sq=new Scanner(System.in);//creating a scanner object
		System.out.println("Enter the size of an  First array:");
		int s1=sq.nextInt();//getting the size from the user of the first array
		int [] arr1=new int[s1];
		System.out.println("Enter the elements of an First array:");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sq.nextInt();//getting the elements for the first array
		}
		System.out.println("Enter the size of an  second array:");
		int s2=sq.nextInt();//getting the size of the second array
		int [] arr2=new int[s2];
		System.out.println("Enter the elements of an second array:");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=sq.nextInt();//getting the elements of the second array
		}
		
		int [] sum=new int[s1];
		for(int i=0;i<s1;i++) {
			sum[i]=arr1[i]+arr2[i];//adding the two array
		}
		for(int val:sum)
			System.out.print(val);//printing the result
	
	}
		}


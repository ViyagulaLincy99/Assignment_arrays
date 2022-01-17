//write a program to find the average value of the given array
import java.util.Scanner;

public class AvgValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num = new int[6];//declaring the array with the size 6
		int sum=0;//initializing the sum to 0
		Scanner sd=new Scanner(System.in);//creating the scanner object
		for(int i=0;i<num.length;i++)
		{
			num[i]=sd.nextInt();//getting the user input
			sum=sum+num[i];//adding the values
		}
		System.out.println("Average is"+(sum/5));

	}

}


//write a program to add elements in the integer array
//importing the scanner class
import java.util.Scanner;
//create a class of array
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] num = new int[10];//declaring the array with the size 10
int sum=0;//initializing the sum to 0
Scanner sd=new Scanner(System.in);//creating the scanner object
for(int i=0;i<num.length;i++)
{
	num[i]=sd.nextInt();//getting the user input
	sum=sum+num[i];//adding the values
}
System.out.println(sum);//printing the values

	}

}

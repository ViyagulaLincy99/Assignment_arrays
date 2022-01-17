//write a program to find a count of even and odd number from the array
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ecount=0,ocount=0;//initializing the even count and odd count to zero
		Scanner st=new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int s1=st.nextInt();
		int [] num1=new int[s1];
		System.out.println("Enter the elements of an array:");
		for(int i=0;i<s1;i++)
		{
			num1[i]=st.nextInt();
		}
		for(int i=0;i<s1;i++)
		{
			if(num1[i]%2==0)//checking the condition for the even number
			{
				ecount++;//even  count incremented
			}
			else
			{
				ocount++;//odd count incremented
			}
		}
		System.out.println(ecount);//printing the even count 
		System.out.println(ocount);//printing the odd count
		
			}
		}


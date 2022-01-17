//write a program to delete a 3rd position in the given array
public class DelArray {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int [] num = {10,20,30,40,50,60,70};
		for(int i=2;i<num.length-1;i++)
		{
			num[i]=num[i+1];
			
		}
		for(int i=0;i<num.length;i++)
		{
		System.out.println(num[i]);
		}
	}
}


//write a program to sorting the array
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] a1 = {25,23,45,67,89};//declaring and initializing the array
for(int i=0;i<a1.length;i++)
{
	for(int j=i+1;j<a1.length;j++)
	{
	if(a1[i]>a1[j])
	{
		
		
		int temp=a1[j];
		a1[j]=a1[i];
		a1[i]=temp;
	}
	}
}
for(int i=0;i<a1.length;i++)
{
System.out.println(a1[i]);
}
}
}
	
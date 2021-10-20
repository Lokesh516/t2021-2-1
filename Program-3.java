import java.util.Scanner;
class  OddNumber
{
	public static void main(String[] rgs) 
	{
		int j,i=1;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
		        i=1;
			for( j=1;j<=a-1;j++)
			{
			if(j==1)
			System.out.print(i);
		        else
			 System.out.print(","+i);
			  i=i+2;
			}
	       }
		else
		{
			for( j=1;j<=a;j++)
			{
			if(j==1)
			System.out.print(i);
		       else
			 System.out.print(","+i);
				i=i+2;
			}
		}
	}
}

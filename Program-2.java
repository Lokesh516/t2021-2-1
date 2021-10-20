import java.util.Scanner;
class  Odd
{
	public static void main(String[] args) 
	{
		int i=1,j;
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		for(j=1;j<=a;j++)
		{
		 if(j==1)
		   System.out.print(i);
		  else
	            System.out.print(","+i);
		 i=i+2;
		}
	}
}

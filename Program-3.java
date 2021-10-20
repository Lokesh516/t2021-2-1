import java.util.Scanner;
class  OddNumber
{
	public static void main(String[] rgs) 
	{
		int j,i;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0)
		{
			 i=1;
			for( j=1;j<=a-1;j++)
			{
				System.out.println(i);
				i=i+2;
			}
	    }
		else
		{
			for( j=1;j<=a;j++)
			{
				System.out.println(i);
				i=i+2;
			}
		}

}
}

import java.util.Scanner;
class Calculator 
{
 double add(double a,double b)
	{
	 return a+b;
	}
 double sub(double a,double b)
	{
	 return a-b;
	}
double mul(double a,double b)
	{
	return a*b;
	}
double div(double a,double b)
	{
	return a/b;
	}

public static void main(String[] args)
{
	double c;
	Calculator e=new Calculator();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value:");
	double a=sc.nextDouble();
	System.out.println("Enter b value:");
	double b=sc.nextDouble();
	System.out.println("Enter the choice(Add,Sub,mul,Div):");
	String ch=sc.next();
  switch(ch)
	{
		case "Add":
			 c=e.add(a,b);
		    System.out.println(c);
			break;

     case "sub":
			 c=e.sub(a,b);
		    System.out.println(c);
			break;
		case "mul":
		   c=e.mul(a,b);
		    System.out.println(c);
			break;
		case "Div":
			 c=e.div(a,b);
		    System.out.println(c);
			break;
		default:
          System.out.println("invalid output");
	}
}
}


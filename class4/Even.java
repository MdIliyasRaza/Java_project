import java.util.Scanner;
class Even{
public static void main(String[] args)
{
int x;
System.out.print("Enter an int to check if it is odd or even:");
Scanner in=new
Scanner(System.in);
x=in.nextInt();
if(x%2==0)
System.out.print("You enter an even no.:");
else
System.out.print("You Enter an odd no.:");
}
}
import java.util.Scanner;
class Largest{
public static void main(String[] args)
{
int x,y,z;
System.out.println("Enter 3 integers");
Scanner in=new
Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=in.nextInt();
if(x>y&&x>z)
System.out.println("First number is largest.");
else if(y>x&&y>z)
System.out.println("Second no. is largest.");
else if(z>x&&z>y)
System.out.println("Third no. is largest.");
else
System.out.println("Enter no. are not distinct.");
}
}
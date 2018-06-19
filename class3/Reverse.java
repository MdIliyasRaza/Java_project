import java.util.Scanner;
class Reverse{
public static void main(String[] args)
{
int n,reverse=0;
System.out.print("Enter a Number to reverse :");
Scanner in=new
Scanner(System.in);
n=in.nextInt();
while(n!=0)
{
reverse=reverse*10;
reverse=reverse+n%10;
n=n/10;
}
System.out.println("Reverse of no. is:"+reverse);
}
}

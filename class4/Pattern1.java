import java.util.Scanner;
class Pattern1{
public static void main(String[] args)
{
Scanner in=new
Scanner(System.in);
System.out.print("Enter N:");
int n=sc.nextInt();
System.out.print("Enter Symbol:");
char c=sc.nextInt().charAt(0);
for(int i=n;i>0;i--)
{
for(int j=0;j<n-i;j++)
{
System.out.print(" ");
}
for(int j=0;j<(i*2)-1;j++)
{
System.out.println(c);
}
System.out.println();
}
}
}
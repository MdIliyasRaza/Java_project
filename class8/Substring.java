import java.util.Scanner;
class Substring{
public static void main(String[] args)
{
String String,sub;
int i,c,length;
Scanner in=new Scanner(System.in);
System.out.println("Enter a string to print it's all substrings");
String=in.nextLine();
length=String.length();
System.out.println("Substring of\""+String+"\"are");
for(c=0;c<length;c++)
{
for(i=1;i<=length-c;i++)
{
sub=String.substring(c,c+i);
System.out.println(sub);
}
}
}
}
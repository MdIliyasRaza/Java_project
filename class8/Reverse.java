import java.util.Scanner;
class Reverse{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuffer sbr=new StringBuffer(s);
sbr.reverse();
System.out.println(sbr.toString());
}
}
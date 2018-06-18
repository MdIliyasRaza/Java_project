class Student2
{
public static void main(String[] args)
{
int rem;
num=153;
int sum=0;
n=num;
while(n>0){
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==n){
System.out.print("armstrong no.");
}
else{
System.out.print("not an armstrong no.");
}
}
}
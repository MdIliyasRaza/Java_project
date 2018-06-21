abstract class Animal{
public abstract void sound();
}
class Dog extends Animal{
public void sound(){
 System.out.println("Woof");
}
public static void main(String[] args)
{
Animal obj=new Dog();
obj.sound();
}
}

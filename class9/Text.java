import java.io.*;
class Text{
public static void main(String[] args)
{
try{
/*File file=new File("C:\\Users\\user\\Desktop\\traning\\class8\\bbb.txt");
if(file.createNewFile()){
System.out.println("created");
}
else
System.out.println("exists");

*/
FileReader reader=new FileReader("C:\\Users\\user\\Desktop\\traning\\class8\\aaa.txt");
int character;
while((character=reader.read())!=-1){
System.out.print((char)character);
}
reader.close();
}
catch(IOException e){
e.printStackTrace();
}
}
}
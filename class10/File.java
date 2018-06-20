import java.io.*;
class File{
    public static void main(String args[]) throws IOException {
FileReader fr = new FileReader("C:\\Users\\student\\Desktop\\training\\class10\\abc.txt");
FileWriter fw = new FileWriter("C:\\Users\\student\\Desktop\\training\\class10\\xyz.txt");      
try {
          
          int c=fr.read();
          while(c!=-1) {
            fw.write(c);
		c=fr.read();      
 }
      } catch(IOException e) {
          System.out.println(e);
      } finally { 
          fr.close();
          fw.close();
      }
        }
    }
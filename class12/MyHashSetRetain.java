import java.util.*;
class HashSetRetain{
public static void 
main(String[] args){
HashSet<String> hs=new HashSet<String>();
hs.add("first");
hs.add("second");
hs.add("third");
hs.add("apple");
hs.add("rat");
System.out.println(hs);
HashSet<String> subSet=new HashSet<String>();
subSet.add("rat");
subSet.add("second");
subSet.add("first");
hs.retainAll(subSet);
System.out.println("HashSet containt:");
System.out.println(hs);
}
}
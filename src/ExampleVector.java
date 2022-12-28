//Use of Enumeration
import java.util.*;

public class ExampleVector {
    public static void main(String[] args){
        Vector v=new Vector();
        v.addElement("one");
        v.addElement("Two");
        v.addElement("Three");
        System.out.println(v);
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            String s=(String) e.nextElement();
            System.out.println(s+" "+s.length());
        }
    }
}

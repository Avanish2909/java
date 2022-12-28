import java.util.ArrayList;
import java.util.Iterator;

public class ExampleIterator {
    public static void main(String[] args){
        ArrayList a1=new ArrayList();
        for(int i=0;i<=10;i++)
            a1.add(i);
        System.out.println(a1);
        Iterator it=a1.iterator();
        while(it.hasNext()){
            Integer I=(Integer) it.next();
            if(I>3 && I<8)
                it.remove();
        }
        System.out.println(a1);
    }
}

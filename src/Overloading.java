class P{
    public void f1(int x){
        System.out.println("class A");
    }
  // if function f1(x,y) write here then also be run this program.
/** public void f1(int x, int y){
        System.out.println("class B");
    }
 */
}
class Q extends P       // function overloading.
{

 // if f1(x) write here then this function is also run in the program.
/**
    public void f1(int x) {
        System.out.println("class A");
    }
*/
    public void f1(int x, int y){
        System.out.println("class B");
    }
}
public class Overloading {
    public static void main(String[] args){
        Q obj=new Q();
        obj.f1(5);
        obj.f1(10,20);
    }
}

class A2{
    int a;
    public A2(){
        System.out.println("A");
    }
/**
    public A2(int x)
    {
        a=x;
        System.out.println("A");
    }
 */
}
class B2 extends A2{
    int b;
    public B2(){
        super();  //If you not write super keyword here then compile will be written here super keyword itself.
        System.out.println("B");

        //If we are passing argument in constructor A2 then we will be written super keyword with argument...
    /**    super(4);   */
    }
}
public class Example6 {
    public static void main(String[] args){
        B2 obj=new B2();
    }
}

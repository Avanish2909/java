class A3{
    public A3(){
        System.out.println("A 1");
    }
}
class B3 extends A3{
    public B3(){
        // Constructor Chaining method..
        this(4);   //If this keyword is not write here then constructor B3() run only here otherwise constructor run B3(int k) constructor and execute constructor A().
        System.out.println("B 1");
    }
    public B3(int k){
    //  ...         <-- constructor write here super keyword itself because this keyword calling its.
        System.out.println("B 2");
    }
}
public class Example7 {
    public static void main(String[] args){
        B3 o1=new B3();
    }
}

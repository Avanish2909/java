//Static member function...
class parent {
    static int y=4;   //Static member variable do not inherit.
    // if write static keyword then called function-hiding...otherwise called function overriding.
    // In all cases parent class function f1() & child class f1() will be same otherwise show error.
    public static void f1()
    {
        System.out.println("hello");
    }
}
 class Child extends parent{
    static {y=5;}
        public static void f1(){
            System.out.println("man");
        }
 }

public class Example5 {
    public static void main(String[] args){
        System.out.println("y="+Child.y);
    }
}

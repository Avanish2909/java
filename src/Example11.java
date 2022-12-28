//if inner class is static
/**
class Outer{
    static int x=10;
    static class Inner{
        void if1() {
            System.out.println("if1()"+x);
        }
    }
}
public class Example11 {
    public static void main(String[] args) {
        Outer.Inner o1 = new Outer.Inner();
        o1.if1();
    }
}
 */

//if inner class is non-static
class Outer{
    class Inner{
        int x=10;  // or static int x=10;
        void if1() {
            System.out.println("if1()"+x);
        }
    }
}
public class Example11 {
    public static void main(String[] args) {
        Outer out=new Outer();
        Outer.Inner o1=out.new Inner();
        o1.if1();
    }
}
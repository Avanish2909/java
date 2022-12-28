// Instance member variable and static member veriable Example:
class Hello {
    int x;  // Instance variable
     private static int y;  // static member variable

    public void fun1() {
    }  // instance member function

    public static void fun2() {
        y = 4;
    }  // static member variable
    public static void showDimension(){
        System.out.println(y);
    }
    static class test {
        public static String country="INDIA";
    }
}
    public class Example1 {
        public static void main(String[] args) {
            Hello ex1 = new Hello();
            Hello ex2 = new Hello();

            Hello.fun2();
            Hello.showDimension();
            System.out.println(Hello.test.country);
        }
    }


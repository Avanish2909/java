//Function Overriding...
class A
{
    public void f2(int x){
        System.out.println("class A");
    }
}
class B extends A
{
    public void f2(int x){
        System.out.println("class B");
    }
}
public class Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.f2(5);
    }
}

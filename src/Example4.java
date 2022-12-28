// super keyword example...
class A1
{
    int z;   // int x;
    public void f1(){}
}
class B1 extends A1
{
    int z;    // int y;
    public void f1(){
    //  this
        super.f1();
    }
    public void f2(){
        int z;
        z=2;
        this.z=3;    // y=3;
        super.z=4;   // x=4
    }
}
public class Example4 {
    public static void main(String[] args){
        B1 obj=new B1();
        obj.f1();
        obj.f2();
    }
}

/**
interface I1 { }
interface I2 { }
interface I3 extends I1,I2{ }
interface I4 { }
class A10 { }
class B10 extends A10 implements I3,I4 { }
public class Exmaple10 {
    public static void main(String[] args){}
}
*/
interface I1{
    void f1();
}
interface I2{
    void f2();
}
class A10 implements I1,I2{
    public void f1(){}
    public void f2(){}
    public void f3(){}
}
class Example10{
    public static void main(String[] args){
        I2 obj=new A10();
    //  obj.f1();  // error because create object interface I2 but if we create object interface I1 then no error for I1 but show error for I2 and class A10.
        obj.f2();
    //  obj.f3();

    }
}
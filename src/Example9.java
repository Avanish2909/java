abstract class Person8{
    abstract void show();
}
class Student8 extends Person8{
    //declared show() function here so that abstract void show() is also contain abstract method in person class by inheritance.
     void show()
    {
        //some code...
    }
}
public class Example9 {
    public static void main(String[] args){
        Student8 s=new Student8();
        s.show();
    }
}

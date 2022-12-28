class Greeting{
    public void sayHello(){
        System.out.println("Hello");
    }
}
class India{
    Greeting g=new Greeting()          //Anonymous class
    {
        public void sayHello(){
            System.out.println("Namaste");
        }
    };
}
public class Example12 {
    public static void main(String[] args){
        India India=new India();
        India.g.sayHello();
    }
}

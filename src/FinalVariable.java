class Dummy   //create final class.
{
    public void someFunction(){}
}
/**
final class Dummy   //create final class.
{
    public final void someFunction(){}
}
*/
class MoreDummy extends Dummy   // error  //does't inherit class Dummy because final keyword use of Dummy class.
{
    public void someFunction(){}; // error  //does't override the final function
}
public class FinalVariable {
    private final int x; //final instance member variable
    private final static int y; //final static member variable

    //Create a static initializer block
    static
    {
        y=4;
    }
    //Create a initializer block
    {
        x=5;
    }

    // otherwise create a constructor
    FinalVariable(){

    }
    public void fun(){
        final int k;  // final local variable
/**  k=k+1;  // error.   */  // if we use k variable then show error because k is 'blank'.
    }
    public static void main(String[] args){
        Example e1=new Example();
    }
}

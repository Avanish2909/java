public class Test1 {
    private static int k;
    static  //Static Intialization Block
    {
        System.out.println("Static Initialization Block: K="+k);
        k=10;
    }
    public static void main(String[] args){
        new Test1();
    }
}

public class Box {
    private int l,b,h;
    //If you are not creating a constructor then compiler create a constructor, in which no argument passing and no code write in constructor -->  public Box(){...}  <-- that's called default constructor.
    public Box()  //Constructor
    {
        l=10;b=8;h=4;
    }
    public Box(int L, int B, int H)  //Constructor Overloading
    {
        l=L; b=B; h=H;
    }
    public static void main(String[] args){
        Box b1=new Box();
        Box b2=new Box(20,15,5);
    }
}

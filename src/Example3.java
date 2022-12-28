class Boxx
{
    private int l,b,h;
    public void setDimension(int l, int b, int h)  //instance member function
    {
        this.l=l; this.b=b; this.h=h;  // here 'this' is represent caller object b1.
    }
    class GiftTaker{
        public void acceptGift(Boxx Boxx){}
    }
    public void sendBox()
    {
        GiftTaker gf=new GiftTaker();
        gf.acceptGift(this);   // here 'this' is represent the caller object b1 because b1 can't write here because b1 is not a object of its class.
    }
}
public class Example3 {
    public static void main(String[] args){
        Boxx b1=new Boxx();
        b1.setDimension(12,10,5);
        b1.sendBox();
    }
}

class Boxs{
    private int length, breadth, height;
    public void setDimension(int l, int b, int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("L="+length);
        System.out.println("B="+breadth);
        System.out.println("H="+height);
    }
}
class Example{
    public static  void main(String[] args) {
        Boxs smallBox = new Boxs();
        smallBox.setDimension(10, 15, 5);
        smallBox.showDimension();
        smallBox=new Boxs();
        smallBox.showDimension();
    }
}

class T1 extends Thread{
    @Override
    public void run() {
        int i;
        for(i=0;i<=10;i++)
            System.out.println("i="+i+" Thread A");
    }
}
class T2 extends Thread{
    @Override
    public void run() {
        int i;
        for(i=0;i<=10;i++)
            System.out.println("i="+i+" Thread B");
    }
}
public class ThreadExample1 {
    public static void main(String[] args){
    T1 o1=new T1();
    T2 o2=new T2();
    o1.start();
    o2.start();
    }
}

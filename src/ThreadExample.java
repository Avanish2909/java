//Threads Example
class X implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 10; i++)
            System.out.println("Thread A " + i);
    }
}
class Y implements Runnable {
    public void run() {
        int i;
        for (i = 0; i <= 10; i++)
            System.out.println("Thread B " + i);
    }

}

public class ThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new X());
        Thread t2 = new Thread(new Y());
        t1.start();
        t2.start();
    }
}


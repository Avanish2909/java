import java.util.Scanner;

public class InputExample1 {
    public static void main(String[] args){
        System.out.println("Enter your name and age");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int age=sc.nextInt();
        System.out.println("Name:"+name+"Age:"+age);
    }
}

import java.util.Scanner;

public class ExampleGUI {
    public static void main(String[] args){
        System.out.println("Enter two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("Sum is "+sum);
    }
}

import java.util.Scanner;

/**
public class ArrayExample{
    public static void main(String args[]){
        int arr[];  //local variable because arr[] is a reference variable
        arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
    }
}
*/
class ArrayExample{
    public static void main(String[] args){
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 5 number");
        for(int i=0;i<5;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<5;i++)
            System.out.println("arr["+i+"]="+arr[i]);
    }
}

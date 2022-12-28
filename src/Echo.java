// argument Example:
public class Echo {
    public static void main(String[] args){
        for(int i=0;i<args.length;i++)
        System.out.println(args[0]);
        int s=0;
        for (int i=0;i<args.length;i++){
            s=s+Integer.parseInt(args[i]);
        }
        System.out.println("Sum is "+s);
    }
}

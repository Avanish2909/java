import java.util.LinkedList;

public class ExampleList {
    public static void main(String[] args){
        LinkedList List=new LinkedList();
        List.addFirst("Surya");
        List.add(1,"Akash");
        List.addLast("Shreya");
        System.out.println(List.getFirst());
        System.out.println(List.get(1));
        System.out.println(List.getLast());
    }
}

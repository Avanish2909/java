//Generic Methods
/**
public class ExampleGeneric {
    public void printArray(String[] s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public void printArray(Integer[] n){
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
    public static void main(String[] args){
        ExampleGeneric e1=new ExampleGeneric();
        String countries[]=new String[]{"India","Pakistan","Nepal"};
        Integer numbers[]={12,34,56,77};
        e1.printArray(countries);
        e1.printArray(numbers);
    }
}
*/
public class ExampleGeneric {
    // public <E1,E2,...> void printArray( E1[]s, E2[]g, ... ){
    public <E> void printArray(E []s)     //public <anyName> void printArray( anyName []s){
    {
        for(E x:s)      //for(int i=0;i<s.length;i++)
        {
            System.out.println(x);     //System.out.println(s[i]);
        }
    }

    public static void main(String[] args){
        ExampleGeneric e1=new ExampleGeneric();
        String countries[]=new String[]{"India","Pakistan","Nepal"};
        Integer numbers[]={12,34,56,77};
        e1.printArray(countries);
        e1.printArray(numbers);
    }
}

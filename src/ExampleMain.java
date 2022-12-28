public class ExampleMain {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setRollno(100);
        s1.setName("Avanish");
        s1.setAge(20);
        System.out.println("Rollno: "+s1.getRollno());
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
    }
}

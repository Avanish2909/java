import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException
    {
        File f1=new File("D:/MysirG/name1.txt");
        f1.createNewFile();  //Atomically create a new, empty file named by this abstract pathname if and only if a file with this name does not yet exist.

        System.out.println("Is exist:"+f1.exists());
        System.out.println("File size:"+f1.length());
        System.out.println("Can file Read:"+f1.canWrite());
        System.out.println("File name:"+f1.getName());
        //f1.delete();
    }
}


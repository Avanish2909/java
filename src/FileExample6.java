//Use of BufferedReader
import java.io.*;
public class FileExample6 {
    public static void main(String[] args) throws IOException{

        FileReader fr=new FileReader("name4.txt");
        BufferedReader bf=new BufferedReader(fr);
        char[] s=new char[20];
        bf.read(s,2,4);
        System.out.println(s);
        bf.close();
    }
}


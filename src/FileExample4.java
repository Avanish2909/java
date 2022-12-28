//Use of BufferedReader
import java.io.*;
public class FileExample4 {
    public static void main(String[] args) throws IOException{
        int ch;
        FileReader fr=new FileReader("name4.txt");
        BufferedReader bf=new BufferedReader(fr);
        while((ch=bf.read())!=-1){
            System.out.print((char)ch);
        }
        bf.close();
    }
}

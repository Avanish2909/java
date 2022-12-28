//Use of another method of Read file by String readLine()
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
// for all import package --> you write --> import java.io.*;

public class FileExample5 {
    public static void main(String[] args) throws IOException{
        FileReader fr=new FileReader("name4.txt");
        BufferedReader bf=new BufferedReader(fr);
        String s1;
        while((s1=bf.readLine())!=null)
            System.out.println(s1);
        bf.close();
    }
}

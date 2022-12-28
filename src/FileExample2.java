//Use of FileInputStream
import java.io.*;
public class FileExample2 {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        fin=new FileInputStream("./names3.txt");
        do{
            i=fin.read();
            if(i!=-1)
                System.out.print((char)i);  //Since 'i' is a type pf integer so its convert into char type , then you write '(char)' before i.
        }while(i!=-1);
        fin.close();
    }
}

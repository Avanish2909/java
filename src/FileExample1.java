import java.io.*;
public class FileExample1 {
    public static void main(String[] args) throws IOException{

        FileOutputStream fout;
        fout=new FileOutputStream("./names3.txt",true);
        String s="TATA";
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
            fout.write(ch[i]);
        fout.close();

    }
}

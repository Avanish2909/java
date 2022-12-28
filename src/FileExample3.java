//Use of BufferWriter
import java.io.*;

public class FileExample3 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw=new FileWriter("file1.txt",true);  //FileWriter is a subclass of writer file
        BufferedWriter bf=new BufferedWriter(new FileWriter("./name4.txt",true));    //If you write Object in above method then you write
/**     BufferedWriter bf=new BufferedWriter(fw);         */
        bf.write("Computer");
        bf.close();

    }
}

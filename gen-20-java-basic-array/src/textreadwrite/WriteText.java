package textreadwrite;

import java.io.*;

public class WriteText {

    public static void writeFile(String dir, String content){

        try {

            FileWriter writer = new FileWriter(dir, false);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

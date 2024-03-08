package textreadwrite;

import java.io.*;

public class ReadText {

    public static void readFile(String dir) {
        File file = new File(dir);

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));


            String st;

            while ((st = br.readLine()) != null)

                // Print the string
                System.out.println(st);

    }
    catch(IOException e){
        System.out.println("Gagal read");
    }

}
}

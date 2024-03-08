
import textreadwrite.ReadText;
import textreadwrite.WriteText;

import java.util.Scanner;

public class MainIO {


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            //Tugas read write file teks
            System.out.println("Isi teks yang di read:");
            ReadText.readFile("test.txt");

            System.out.println();
            System.out.println("Ketik teks yang akan di write ke file:");
            String line = in.nextLine();
            WriteText.writeFile("testfile.txt", line);

            //System.out.println("Isi teks yang di write:");
            //ReadText.readFile("testfile.txt");
        }
    }


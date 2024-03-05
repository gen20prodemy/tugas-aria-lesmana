
import java.util.Scanner;
import java.io.*;
public class InputCatch {



    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        boolean finish = false;
        while(!finish) {
            System.out.println("Input nama file utk dibaca:");
            String filename = in.nextLine();
            try {
                // Creating an instance of FileReader class
                FileReader fileReader = new FileReader(filename);
                BufferedReader br = new BufferedReader(fileReader);

                System.out.println("File terbaca:");
                System.out.println(br.readLine());
                fileReader.close();
                finish = true;
            } catch (IOException e) {
                finish = false;
                System.out.println(e);
            }
        }
    }



}

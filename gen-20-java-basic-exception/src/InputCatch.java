
import java.util.Scanner;
import java.io.*;
public class InputCatch {



    public static void main (String[] args) {
        try {
            // Creating an instance of FileReader class
            FileReader fileReader = new FileReader("input.txt");
            System.out.println(fileReader.read());
            fileReader.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }



}

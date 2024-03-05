
import java.lang.ArithmeticException;
import java.util.*;


public class InputThrow {
    public static void main(String[] args ) throws ArithmeticException{

        Scanner in = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.println("x=");
            int x = in.nextInt();
            System.out.println("y=");
            int y = in.nextInt();
            int s = x / y;
            System.out.println("x/y=");
            System.out.println(s);
        }
    }
}

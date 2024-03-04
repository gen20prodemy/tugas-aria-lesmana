import java.util.Scanner;

public class InputCustom {



        public static void cekInputAngka(int n) throws ExceptionInputSalah {
            if(n<0)
                throw new ExceptionInputSalah("input tdk valid");
        }

        public static void main (String[] args) {
            Scanner in = new Scanner(System.in);
            try{
                int n = in.nextInt();
                cekInputAngka(n);

            }
            catch (ExceptionInputSalah e){

            }


        }
    }




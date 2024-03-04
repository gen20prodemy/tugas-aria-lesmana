import java.util.Scanner;

public class InputCustom {



        public static void cekInputAngka(int n) throws ExceptionInputSalah {
            if(n<=0)
                throw new ExceptionInputSalah("input tdk valid");
        }

        public static void main (String[] args) throws ExceptionInputSalah {

            System.out.println("Masukkan input sembarang:");
            Scanner in = new Scanner(System.in);

            int n = in.nextInt();

            try {
                cekInputAngka(n);
            }
            catch (ExceptionInputSalah e){
                System.out.println("Exception buatan tertangkap");
            }

            cekInputAngka(n);//menimbulkan error

        }
    }




import java.util.*;


public class Main {

    public static ArrayList<Product> stockUp(Product[] input){
        ArrayList<Product> out = new ArrayList<Product>(Arrays.asList(input));
        return out;
    }

    public static void main(String[] args) {

        Makanan mieInstan = new Makanan("Mie Instan",6000);
        Minuman airMineral = new Minuman("Air Mineral",3000);
        Obat paracetamol = new Obat("Paracetamol",8000);

        mieInstan.adakanPromo();
        airMineral.adakanPromo();
        paracetamol.adakanPromo();


        Product[] kumpul = {mieInstan,airMineral,paracetamol};

        List<Product> stok = stockUp(kumpul);

        for (Product x : stok) {
            System.out.print(x.getNama() + " = ");
            System.out.println(x.getHarga());

        }
        System.out.println("Setelah harga diubah:");
        mieInstan.setHarga(10000);
        airMineral.setHarga(6000);
        paracetamol.setHarga(5000);

        for (Product y : stok ){

            System.out.print(y.getNama() + " = ");
            System.out.println(y.getHarga());
        }
    }
}
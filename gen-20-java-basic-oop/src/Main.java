import java.util.*;


public class Main {

    public static void main(String[] args) {

        Makanan mieInstan = new Makanan("Mie Instan",6000);
        Minuman airMineral = new Minuman("Air Mineral",3000);
        Obat paracetamol = new Obat("Paracetamol",8000);
        Product[] kumpul = {mieInstan,airMineral,paracetamol};

        Makanan kue1 = new Makanan("Kue1", 6000);
        Makanan kue2 = new Makanan("Kue2", 6000);
        Makanan kue3 = new Makanan("Kue3", 6000);
        Product[] kumpul2 = {kue1, kue2, kue3};

        System.out.println("List produk beda jenis:");
        for (Product x : kumpul) {
            System.out.print(x.getNama() + " = ");
            System.out.println(x.getHarga());
        }
        System.out.println("Paket produk sejenis:");
        for (Product y : kumpul2) {
            System.out.print(y.getNama() + " = ");
            System.out.println(y.getHarga());
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1. Edit Harga");
        System.out.println("2. Lihat promo");
        System.out.println("3. Override harga produk sejenis");
        int select = scan.nextInt();

        switch (select) {

            case 1:
                for (Product x : kumpul) {
                    System.out.print(x.getNama() + " = ");
                    int n=scan.nextInt();
                    x.setHarga(n);
                }

            System.out.println("Setelah harga diubah:");
            for (Product x : kumpul) {

                System.out.print(x.getNama() + " = ");
                System.out.println(x.getHarga());
            }
            break;

            case 2:
                System.out.print(mieInstan.getTipe() + " = ");
                mieInstan.adakanPromo();
                System.out.print(airMineral.getTipe() + " = ");
                airMineral.adakanPromo();
                System.out.print(paracetamol.getTipe() + " = ");
                paracetamol.adakanPromo();
                break;

            case 3:
            kue1.setHarga(3000);
            kue2.setHarga(10000);
            kue3.setHarga(7000);

            for (Product z : kumpul2) {
                System.out.print(z.getNama() + " = ");
                System.out.println(z.getHarga());
            }
            break;

        }
    }
}
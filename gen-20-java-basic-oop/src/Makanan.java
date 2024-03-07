public class Makanan extends Product {


    public Makanan(String nama) {
        super(nama, 5000);
        this.tipe="Makanan";
    }

    public Makanan(String nama, int harga) {
        super(nama, harga);
        this.tipe="Makanan";
    }

    public void resetHarga(){
        this.harga = 5000;
        System.out.println("Harga default utk makanan:"+harga);
    }

    public void adakanPromo(){
        System.out.println("Gratis 1 item untuk setiap pembelian 2 produk makanan sejenis ");
    }

}

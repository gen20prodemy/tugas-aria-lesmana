public class Makanan extends Product {

    public Makanan(String nama, int harga) {

    super(nama, harga);
    }

    public void setHarga(){

        this.harga = 5000;
        System.out.println("Harga default utk makanan:"+harga);
    }

    public void isiBersih(){
        System.out.println("Gram");
    }
    public void adakanPromo(){
        System.out.println("Gratis 1 item untuk setiap pembelian 2 produk makanan sejenis ");
    }

}

public class Obat extends Product {

    public Obat(String nama, int harga) {
        super(nama, harga);
    }
    public void isiBersih(){
        System.out.println("Tablet/Kaplet");
    }
    public void setHarga(){

        this.harga = 8000;
        System.out.println("Harga default utk obat:"+harga);
    }

    public void adakanPromo(){
        System.out.println("Diskon sebesar 30% untuk setiap produk obat sirup");
    }
}
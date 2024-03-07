public class Obat extends Product {

    public Obat(String nama) {
        super(nama,8000);
        this.tipe="Obat";
    }
    public Obat(String nama, int harga) {
        super(nama, harga);
        this.tipe="Obat";
    }

    public void resetHarga(){

        this.harga=8000;
        System.out.println("Harga default utk obat:"+harga);
    }

    public void adakanPromo(){
        System.out.println("Diskon sebesar 30% untuk setiap produk obat sirup");
    }
}
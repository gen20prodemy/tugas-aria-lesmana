public class Product {
    int harga=1000;
    String nama = " ";
    String tipe = "Produk";

    public Product(String nama){
        this.nama=nama;
    }

    public Product(String nama, int harga){
        this.nama=nama;
        this.harga=harga;
    }

    public void resetHarga(){
        this.harga = 1000;
    }

    public void setHarga(int harga){
        this.harga = harga;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public int getHarga() {
        return harga;
    }
    public String getNama(){
        return nama;
    }
    public String getTipe() {return tipe;}

    public void adakanPromo(){
        System.out.println("Diskon 10% untuk total pembelian diatas 100.000");
    }
}

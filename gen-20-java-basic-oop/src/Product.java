public class Product {
    int harga=0;
    String nama = " ";


    public Product(String nama, int harga ){
        this.nama=nama;
        this.harga=harga;
    }

    public void setHarga(){
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
    public void isiBersih(){
        System.out.println("Kilogram");
    }
    public void adakanPromo(){
        System.out.println("Diskon 10% untuk total pembelian diatas 100.000");
    }
}

public class Minuman extends Product{

    public Minuman(String nama, int harga) {
        super(nama, harga);
    }

    public void isiBersih(){
        System.out.println("Mililiter");
    }
    public void setHarga(){

        this.harga = 4000;
        System.out.println("Harga default utk minuman:"+harga);
    }

    public void adakanPromo() {
        System.out.println("Dapatkan kupon belanja untuk setiap pembelia 1 kardus air mineral 600 ml");
    }
}
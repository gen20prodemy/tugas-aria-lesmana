package DataSiswa;

public class DataSiswa {
    int id;
    String nama;
    boolean lulus;

    public DataSiswa(int id, String nama, boolean lulus){
        this.id=id;
        this.nama=nama;
        this.lulus=lulus;
    }
    public int getId(){
        return id;
    }
    public String getNama(){
        return nama;
    }
    public boolean getLulus(){
        return lulus;
    }
}

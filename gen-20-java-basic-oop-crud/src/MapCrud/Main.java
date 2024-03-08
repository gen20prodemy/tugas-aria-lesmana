package MapCrud;

import CrudTemplate.CrudInterface;
import DataSiswa.DataSiswa;

import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        Map <Integer, DataSiswa> daftar = new TreeMap<Integer, DataSiswa>();
        DataSiswa siswa1 = new DataSiswa(123,"Paijo",true);
        DataSiswa siswa2 = new DataSiswa(211,"Sutisna",false);
        DataSiswa siswa3 = new DataSiswa(301,"Susana",true);

        CrudInterface crud = new CrudToMap();

        crud.addData(daftar,siswa1);
        crud.addData(daftar,siswa2);
        crud.addData(daftar,siswa3);

        crud.readData(daftar);

        System.out.println("Operasi read data spesifik");
        crud.readData(daftar,211);
        System.out.println("Operasi update data");
        crud.updateData(daftar,211,"Sule",true);

        crud.readData(daftar);

        System.out.println("Operasi delete data");
        crud.deleteData(daftar,123);

        crud.readData(daftar);
    }
}

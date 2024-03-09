package MapCrud;

import CrudTemplate.CrudInterface;
import POJO.DataSiswa;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args){
        Map <Integer, DataSiswa> daftar = new TreeMap<Integer, DataSiswa>();
        DataSiswa siswa1 = new DataSiswa(123,"Paijo",true);
        DataSiswa siswa2 = new DataSiswa(211,"Sutisna",false);
        DataSiswa siswa3 = new DataSiswa(301,"Susana",true);
        Scanner scan = new Scanner(System.in);

        CrudInterface crud = new CrudToMap();

        crud.addData(daftar,siswa1);
        crud.addData(daftar,siswa2);
        crud.addData(daftar,siswa3);

        boolean repeat = true;
        while(repeat){
        System.out.println("Menu:");
        System.out.println("1. Tampilkan data");
        System.out.println("2. Tampilkan data spesifik");
        System.out.println("3. Update data");
        System.out.println("4. Hapus data");
        int select = scan.nextInt();
        int input;
        switch(select) {

            case 1:
                crud.readData(daftar);
                break;

            case 2:
                System.out.println("Input Id Siswa:");
                input = scan.nextInt();
                crud.readData(daftar, input);
                break;

            case 3:
                System.out.println("Input Id Siswa: ");
                input = scan.nextInt();
                System.out.println("Input Nama Siswa: ");
                scan.nextLine();
                System.out.println("Input status lulus:");
                String newNama = scan.nextLine();
                boolean newLulus = Boolean.parseBoolean(scan.nextLine());
                crud.updateData(daftar, input, newNama, newLulus);
                break;

            case 4:
                System.out.println("Input Id Siswa: ");
                input = scan.nextInt();
                crud.deleteData(daftar, input);
                break;

            default: repeat=false;
        }

        }
    }
}

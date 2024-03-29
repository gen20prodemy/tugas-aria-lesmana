package FileCrud;

import CrudTemplate.CrudAbstract;
import POJO.DataSiswa;

import java.io.*;
import java.util.*;
public class Main {


    public static void main(String[] args) {

        CrudAbstract crud = new CrudToFile();
        String filename = "database.txt";
        File database = new File(filename);
        Scanner scan = new Scanner(System.in);

        int select = scan.nextInt();

        switch(select) {
            case 1:

                if (database.exists()) {
                    System.out.println("Error: file exists");

                } else {
                    try {
                        database.createNewFile();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                DataSiswa siswa1 = new DataSiswa(123, "Adi", true);
                DataSiswa siswa2 = new DataSiswa(222, "Bedu", true);
                DataSiswa siswa3 = new DataSiswa(300, "Charlie", true);
                DataSiswa siswa4 = new DataSiswa(404, "Desta", true);
                DataSiswa siswa5 = new DataSiswa(512, "Ely", true);
                crud.addData(database, siswa1);
                crud.addData(database, siswa2);
                crud.addData(database, siswa3);
                crud.addData(database, siswa4);
                crud.addData(database, siswa5);

                System.out.println();

            case 2:
                crud.readData(database);

            case 3:
                System.out.println("Update database:");
                crud.updateData(database, 404, "Deddy", false);

                System.out.println();

            case 4:
                System.out.println("Delete data");
                crud.deleteData(database, 512);
                System.out.println();
                crud.readData(database);


        }
    }
}

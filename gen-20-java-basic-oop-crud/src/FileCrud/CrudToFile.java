package FileCrud;

import CrudTemplate.CrudAbstract;
import DataSiswa.DataSiswa;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CrudToFile extends CrudAbstract {

    @Override
    public void addData(File database, DataSiswa d) {

        int id = d.getId();
        String nama = d.getNama();
        boolean lulus = d.getLulus();

        String row;
        try {
            RandomAccessFile raf = new RandomAccessFile(database, "rw");
            boolean found = checkDataExist(raf,id,nama);

            if (found == false) {
                //delimiter
                row = Integer.toString(id) + "," + String.valueOf(nama) + "," + lulus;

                raf.writeBytes(row);

                raf.writeBytes(System.lineSeparator());

                System.out.println("Data berhasil diinput");

                raf.close();
            }else System.out.println("Data sudah ada");
        } catch (IOException ioe) {

            System.out.println(ioe);
        } /*catch (NumberFormatException ioe){
                System.out.println(ioe);}*/


    }


    @Override
    public void readData(File database) {
        System.out.println("Isi Database:");
        String row;
        try {
            RandomAccessFile raf = new RandomAccessFile(database, "rw");

            while (raf.getFilePointer() < raf.length()) {
                row = raf.readLine();

                String[] lineSplit = row.split(",");

                int number = Integer.parseInt(lineSplit[0]);
                String name = lineSplit[1];
                String lulus = lineSplit[2];

                System.out.println("No. Induk: " + number + "\nNama: " + name + "\nLulus: " + lulus);
            }
        } catch (IOException ioe) {

            System.out.println(ioe);
        }
    }

    @Override
    public void deleteData(File database, int id) {
        try {
            RandomAccessFile raf = new RandomAccessFile(database, "rw");
            boolean found = checkDataExist(raf,id);
            if (found == true) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {

                    String row = raf.readLine();

                    int index = row.indexOf(',');
                    String idcomp = row.substring(0, index);
                    if (Integer.parseInt(idcomp)==id) {
                        continue;
                    }
                    tmpraf.writeBytes(row);
                    tmpraf.writeBytes(System.lineSeparator());
                }
                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer()
                        < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();

                tmpFile.delete();

                System.out.println("Data dihapus. ");
            }
        }catch (IOException ioe){

        }
    }

    @Override
    public void updateData(File database, int id, String nama, boolean kelulusan) {

        try {
            RandomAccessFile raf = new RandomAccessFile(database, "rw");
            boolean found = checkDataExist(raf,id,nama);

            if (found) {

                File tmpFile = new File("temp.txt");

                RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");

                raf.seek(0);

                while (raf.getFilePointer() < raf.length()) {

                    String row = raf.readLine();

                    int index = row.indexOf(',');
                    String idcomp = row.substring(0, index);
                    if (Integer.parseInt(idcomp)==id) {

                        row = String.valueOf(id) + ","+ nama+","+kelulusan;
                    }

                    tmpraf.writeBytes(row);

                    tmpraf.writeBytes(System.lineSeparator());
                }

                raf.seek(0);
                tmpraf.seek(0);

                while (tmpraf.getFilePointer()
                        < tmpraf.length()) {
                    raf.writeBytes(tmpraf.readLine());
                    raf.writeBytes(System.lineSeparator());
                }

                raf.setLength(tmpraf.length());

                tmpraf.close();
                raf.close();
                tmpFile.delete();

                System.out.println("Data diedit");
            }
        }catch(IOException ioe){

        }
    }

    boolean checkDataExist(RandomAccessFile raf,int newId, String newNama) {

        boolean found = false;
        try {
            while (raf.getFilePointer() < raf.length()) {

                String row = raf.readLine();

                String[] lineSplit = row.split(",");

                int id = Integer.parseInt(lineSplit[0]);
                String nama = lineSplit[1];

                // if condition to find existence of record.
                if (nama == newNama || id == newId) {
                    found = true;
                    break;
                }
            }

        } catch (IOException ioe) {

        }
        return found;
    }

    boolean checkDataExist(RandomAccessFile raf,int newId) {
        boolean found = false;
        try {
            while (raf.getFilePointer() < raf.length()) {

                String row = raf.readLine();

                String[] lineSplit = row.split(",");

                int id = Integer.parseInt(lineSplit[0]);

                if (id == newId) {
                    found = true;
                    break;
                }
            }

        } catch (IOException ioe) {

        }
        return found;
    }

}


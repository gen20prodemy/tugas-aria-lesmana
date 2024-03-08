package MapCrud;

import CrudTemplate.CrudInterface;
import DataSiswa.DataSiswa;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
public class CrudToMap implements CrudInterface {

    @Override
    public void addData(Map<Integer, DataSiswa> m, DataSiswa d) {
        int maxKey = 0;
        boolean duplicate=false;
        if (!m.isEmpty()) {
            maxKey = Collections.max(m.keySet());
            for (DataSiswa x : m.values()) {

                if (x.getId() == d.getId() || x.getNama() == d.getNama()) duplicate = true;
            }
        }
        if(!duplicate) m.put(maxKey + 1, d);
        else System.out.println("Data sudah ada");
    }
    @Override
    public void readData(Map<Integer, DataSiswa> m) {
        System.out.println("=====List Data=====");
        System.out.println("N|Id|Nama|Lulus");
        for (Map.Entry<Integer, DataSiswa> x : m.entrySet()) {
            System.out.print(x.getKey() + ":");
            System.out.print(x.getValue().getId()+";");
            System.out.print(x.getValue().getNama()+";");
            System.out.println(x.getValue().getLulus());
        }
        System.out.println();
    }
    @Override
    public void readData(Map<Integer, DataSiswa> m, int id) {
        System.out.println("=====List Data=====");
        for (Map.Entry<Integer, DataSiswa> x : m.entrySet()) {
            if(x.getValue().getId()==id) {
                System.out.print(x.getKey() + ":");
                System.out.print(x.getValue().getId() + ";");
                System.out.print(x.getValue().getNama() + ";");
                System.out.println(x.getValue().getLulus());
            }
        }
        System.out.println();
    }
    @Override
    public void deleteData(Map<Integer, DataSiswa> m, int id) {
        //Iterator<Map.Entry<Integer, DataSiswa>> it = m.entrySet().iterator();

        boolean exist=false;

        for(Map.Entry<Integer,DataSiswa> entry: m.entrySet()){
            if ((entry.getValue().getId())==id) {
                exist=true;
                int key =entry.getKey();
                m.remove(key);
                break;
            }
        }
        /*while(it.hasNext()){
            entry=it.next();
            if ((entry.getValue().getId())==id) {
                exist=true;
                int key =entry.getKey();
                m.remove(key);
            }
        }*/

        if(!exist) System.out.println("Data tdk ditemukan");
    }

    @Override
    public void deleteData(Map<Integer, DataSiswa> m, DataSiswa d) {
        Iterator<Map.Entry<Integer, DataSiswa>> it = m.entrySet().iterator();
        Map.Entry<Integer,DataSiswa> entry;
        boolean exist=false;

        while(it.hasNext()){
            entry=it.next();
            if ((entry.getValue().getId())==d.getId()) {
                exist=true;
                int key =entry.getKey();
                m.remove(key);
                break;
            }
        }

        if(!exist) System.out.println("Data tdk ditemukan");
    }
    @Override
    public void updateData(Map<Integer, DataSiswa> m, int id, String nama,boolean kelulusan) {
        boolean exist=false;
        DataSiswa d = new DataSiswa(id,nama,kelulusan);
        for (Map.Entry<Integer, DataSiswa> entry : m.entrySet()) {
            if ((entry.getValue().getId())==d.getId()) {
                m.put(entry.getKey(),d);
                exist=true;
                break;
            }
        }
        if(!exist) System.out.println("Data tdk ditemukan");
    }
}

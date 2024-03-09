package CrudTemplate;

import java.io.File;
import POJO.DataSiswa;

public abstract class CrudAbstract {

    public abstract void addData(File database, DataSiswa d);
    public abstract void readData(File database);
    public abstract void deleteData(File database, int id);
    public abstract void updateData(File database, int id,String nama,boolean kelulusan);
}

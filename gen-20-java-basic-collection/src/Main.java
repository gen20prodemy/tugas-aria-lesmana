

import java.io.*;
import java.util.*;

public class Main {
    /*public List<String> buatList(){

    }
    public ArrayList<String> buatArrList(){

    }
    public Queue<String> buatQueue(){

    }*/
    public static void main(String[] args) {
        System.out.println("Hello world!");

         List<String> l1 = new ArrayList<String>();
        l1.add("Apel");
        l1.add("Banana");
        l1.add("Citrus");
        l1.add("Delima");
        l1.add("Enau");

        Iterator<String> l1Iterator = l1.iterator();

        while(l1Iterator.hasNext()) {
            System.out.println(l1Iterator.next());
        }


        Set<String> s1 = new HashSet<String>(l1);

        for(String x:l1) s1.add(x);

        for(String x:s1) System.out.println(x);

        Set<String> s2 = new HashSet<String>(l1);
        s2.addAll(l1);
        for(String x:s2) System.out.println(x);

        Set<String> t1 = new TreeSet<String>(l1);
        t1.addAll(l1);

        Iterator<String> t1Iterator = t1.iterator();

        while(t1Iterator.hasNext()) {
            System.out.println(t1Iterator.next());
        }

        Map <Integer,String> m1 = new HashMap<>();
        int i=0;
        for(String x:l1) {
            m1.put(i,x);
            i++;
        }

        for (Map.Entry<Integer, String> y :
                m1.entrySet()) {

            // Printing keys
            System.out.print(y.getKey() + ":");
            System.out.println(y.getValue());
        }
    }
}
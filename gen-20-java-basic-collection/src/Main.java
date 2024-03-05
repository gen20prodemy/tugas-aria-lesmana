

import java.io.*;
import java.util.*;

public class Main {

    public static Map<Integer,String> buatMap(List<String> input){

        Map<Integer,String> mapped = new HashMap<Integer,String>();
        int i=0;
        for(String x: input) {
            mapped.put(i,x);
            i++;
        }
        return mapped;

    }


    public static void main(String[] args) {

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

        System.out.print("Hashset1 elements: ");
        for(String x:s1) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println();
        Set<String> s2 = new HashSet<String>(l1);
        s2.addAll(l1);

        System.out.print("Hashset2 elements: ");
        for(String x:s2) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println();
        Set<String> t1 = new TreeSet<String>(l1);
        t1.addAll(l1);

        Iterator<String> t1Iterator = t1.iterator();
        System.out.print("Treeset elements: ");
        while(t1Iterator.hasNext()) {
            System.out.print(t1Iterator.next());
            System.out.print(", ");
        }
        System.out.println();
        Queue<String> myQueue = new LinkedList<>(l1);


        System.out.print("Queue elements: ");


        while (!myQueue.isEmpty()) {
            System.out.print(myQueue.poll()+", ");
        }
        System.out.println();

        Map <Integer,String> m1 = buatMap(l1);

        System.out.println("Map elements:");
        for (Map.Entry<Integer, String> y :
                m1.entrySet()) {

            // Printing keys
            System.out.print(y.getKey() + ":");
            System.out.println(y.getValue());
        }

    }
}
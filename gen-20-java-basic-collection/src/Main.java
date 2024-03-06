

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

        List<String> list1 = new ArrayList<String>();
        list1.add("Apel");
        list1.add("Banana");
        list1.add("Citrus");
        list1.add("Delima");
        list1.add("Elderberry");

        Iterator<String> list1Iterator = list1.iterator();

        System.out.print("ArrayList elements: ");
        while(list1Iterator.hasNext()) {
            System.out.print(list1Iterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");

        Set<String> hashset1 = new HashSet<String>(list1);

        for(String x: list1) hashset1.add(x);//hashset menggunakan iterasi manual

        System.out.print("List ke Hashset1 elements: ");
        for(String x: hashset1) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println("\n");

        Set<String> hashset2 = new HashSet<String>(list1);
        hashset2.addAll(list1);//hashset menggunakan method addall

        System.out.print("List ke Hashset2 (addAll) elements: ");
        for(String x: hashset2) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println("\n");

        List<String> list2 = new ArrayList<String>();
        list2.addAll(hashset1);
        System.out.print("HashSet ke List elements: ");
        for(String x: list2) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println("\n");


        Set<String> treeset1 = new TreeSet<String>(list1);
        treeset1.addAll(list1);

        Iterator<String> tree1Iterator = treeset1.iterator();
        System.out.print("List ke Treeset elements: ");
        while(tree1Iterator.hasNext()) {
            System.out.print(tree1Iterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");

        List<String> list3 = new ArrayList<String>();
        list3.addAll(treeset1);
        System.out.print("TreeSet ke List elements: ");
        for(String x: list3) {
            System.out.print(x);
            System.out.print(", ");
        }
        System.out.println("\n");

        Queue<String> queue1 = new LinkedList<>(list1);
        System.out.print("List ke Queue elements: ");

        while (!queue1.isEmpty()) {
            System.out.print(queue1.poll()+", ");
        }
        System.out.println("\n");

        Map <Integer,String> map1 = buatMap(list1);

        System.out.println("List ke Map elements:");
        for (Map.Entry<Integer, String> y :
                map1.entrySet()) {

            // Printing keys
            System.out.print(y.getKey() + ":");
            System.out.println(y.getValue());
        }
        System.out.println();

        Vector<String> vector1 = new Vector<String>(list1);
        System.out.println("List ke Vector elements: " + vector1);
        Vector<String> vector2 = new Vector<String>(hashset1);
        System.out.println("HashSet ke Vector elements: " + vector2);

    }
}
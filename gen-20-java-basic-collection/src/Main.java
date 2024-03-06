

import java.util.*;

public class Main {

    public static List<String> buatList(String[] item){
        List<String> barang = new ArrayList<String>();
        barang = Arrays.asList(item);
        return barang;
    }

    public static void printList(List<String> ls){
        Iterator<String> lsIterator = ls.iterator();

        System.out.print("ArrayList elements: ");
        while(lsIterator.hasNext()) {
            System.out.print(lsIterator.next());
            System.out.print(", ");
        }
        System.out.println("\n");
    }

    public static void cariList(List<String> ls, String find){
        if (ls.contains(find))
            System.out.print("Item bernama " + find + " ada di index: " + ls.indexOf(find));
        System.out.println("\n");
    }

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

        String[] buah = {"Apel","Banana","Citrus","Delima","Elderberry"};
        //List<String> list1 = new ArrayList<String>();
        List<String> list1 = buatList(buah);
        /*list1.add("Apel");
        list1.add("Banana");
        list1.add("Citrus");
        list1.add("Delima");
        list1.add("Elderberry");*/

        Scanner scan = new Scanner(System.in);


        System.out.println("Menu: ");
        System.out.println("1.Print daftar item");
        System.out.println("2.Cari item");
        System.out.println("3.Konversi dan print daftar item");
        int select = scan.nextInt();
        if(select==1) printList(list1);

        if(select==2) {
            scan.nextLine();
            System.out.println("Cari item berdasarkan string: ");
            String in = scan.nextLine();
            cariList(list1,in);
        }
        if(select==3) {
            System.out.print("List ke Hashset1 elements: ");

            Set<String> hashset1 = new HashSet<String>(list1);

            for (String x : list1) hashset1.add(x);//hashset menggunakan iterasi manual

            System.out.print("List ke Hashset1 elements: ");
            for (String x : hashset1) {
                System.out.print(x);
                System.out.print(", ");
            }
            System.out.println("\n");

            Set<String> hashset2 = new HashSet<String>(list1);
            hashset2.addAll(list1);//hashset menggunakan method addall

            System.out.print("List ke Hashset2 (addAll) elements: ");
            for (String x : hashset2) {
                System.out.print(x);
                System.out.print(", ");
            }
            System.out.println("\n");


            Set<String> treeset1 = new TreeSet<String>(list1);
            treeset1.addAll(list1);

            Iterator<String> tree1Iterator = treeset1.iterator();
            System.out.print("List ke Treeset elements: ");
            while (tree1Iterator.hasNext()) {
                System.out.print(tree1Iterator.next());
                System.out.print(", ");
            }
            System.out.println("\n");

            List<String> list2 = new ArrayList<String>();
            list2.addAll(hashset1);
            System.out.print("HashSet ke List elements: ");
            for (String x : list2) {
                System.out.print(x);
                System.out.print(", ");
            }
            System.out.println("\n");
            List<String> list3 = new ArrayList<String>();
            list3.addAll(treeset1);
            System.out.print("TreeSet ke List elements: ");
            for (String x : list3) {
                System.out.print(x);
                System.out.print(", ");
            }
            System.out.println("\n");

            Map<Integer, String> map1 = buatMap(list1);

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
            System.out.println();

            Queue<String> queue1 = new LinkedList<>(list1);
            System.out.print("List ke Queue elements: " + queue1);
            //System.out.print("Contoh hasil method queue peek: "+ queue1.peek());
            System.out.println("\n");
        }
    }
}
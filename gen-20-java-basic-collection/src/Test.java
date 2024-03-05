import java.util.*;

public class Test {
    public static void main(String[] args){
    List<String> fruits = new ArrayList<>();
    fruits.add("apple");
    fruits.add("orange");
    fruits.add("banana");
    fruits.add("banana boat");
    fruits.add("banana minion");
    for (int i = 0; i < 5; i++) {


    if (fruits.get(i).contains("banana")) {
        System.out.println(fruits.get(i));
    }
    }
    }
}


package dsa.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Traverse {
    public static void main(String[] args) {
        // 3 ways to traverse an arraylist
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");
        strings.add("C");
        strings.add("D");
        strings.add("E");

        for (int i = 0; i < strings.size(); i+=2) {
            String letter = strings.get(i);
            System.out.print(letter);
        }
        System.out.println();
        for (String letter: strings) {
            System.out.print(letter);
        }
        System.out.println();
        Iterator<String> iterator = strings.iterator();

        while (iterator.hasNext()) {
            String letter = iterator.next();
            System.out.print(letter);
        }
        System.out.println();

    }
}

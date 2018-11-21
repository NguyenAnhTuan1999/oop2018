package week11;

import java.util.ArrayList;

public class Task2 {

    private static  <T extends Comparable<T>> void maxValue(ArrayList<T> list) {
        T max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) max = list.get(i);
        }
        System.out.println("Max = " + max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> listInteger = new ArrayList<>();
        listInteger.add(3);
        listInteger.add(12);
        listInteger.add(1);
        maxValue(listInteger);
    }
}

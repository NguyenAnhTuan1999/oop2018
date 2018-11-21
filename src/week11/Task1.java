package week11;

import java.util.Arrays;

public class Task1 {

    private static <T extends Comparable> void sort( T[] t) {
        Arrays.sort(t);
    }

    private static <T extends Comparable> void printArray(T[] t) {
        for (int i = 0; i < t.length; i++) {
            System.out.print(t[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer integers[] = {1, 5, 6, 9, 7, 2, 3};
        sort(integers);
        printArray(integers);
        Float floats[] = {1f, 3f, 9f, 22f, 0f, 2f};
        sort(floats);
        printArray(floats);
        Character characters[] = {'a', 'b', 'c', 'z', 'd', 'e', 'f'};
        sort(characters);
        printArray(characters);
    }
}

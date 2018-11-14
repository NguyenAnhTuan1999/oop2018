package week10;

import java.util.Random;

public class Task2 {

    public static void bubbleSort(double[] a) {
        for (int i = 0; i < 999; i++) {
            for (int j = 0; j < 999 - i; j++) {
                if (a[j] > a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static double[] getArray() {
        double[] a = new double[1000];
        for (int i = 0; i < 1000; i++) {
            a[i] = new Random().nextDouble()*500;
        }
        return a;
    }

    public static void printArray(double[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        double[] a = getArray();
        bubbleSort(a);
        printArray(a);
    }
}

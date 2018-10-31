package week7.task2;

import week7.task1.Addition;
import week7.task1.BinaryExpression;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2 {

    public void printLengthOfString(String string) throws NullPointerException {
        System.out.println(string.length());
    }

    public void printArray(int[] array) throws ArrayIndexOutOfBoundsException {
        for (int i=0; i<=array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void divide(int a, int b) throws ArithmeticException {
        System.out.println("a/b = " + a/b);
    }

    public void castObject(BinaryExpression binaryExpression) throws ClassCastException {
        System.out.println(((Addition) binaryExpression).toString());
    }

    public void readFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String lineData;
        while ((lineData = br.readLine()) != null) {
            System.out.println(lineData);
        }
        br.close();
    }

    public void openFile(String filePath) throws FileNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
    }

    public static void main(String[] args) {
        Task2 example = new Task2();

        try {
            example.printLengthOfString(null);
        } catch (NullPointerException e) {
            System.out.println("Gap loi: " + e.getMessage());
        }

        try {
            int[] a = {1, 2, 3};
            example.printArray(a);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Gap loi: Vuot qua gioi han cua mang: " + e.getMessage());
        }

        try {
            example.divide(4, 0);
        } catch (ArithmeticException e) {
            System.out.println("Gap loi: " + e.getMessage());
        }

        try {
            example.castObject(new BinaryExpression());
        } catch (ClassCastException e) {
            System.out.println("Gap loi: " + e.getMessage());
        }

        try {
            example.readFile("C://");
        } catch (IOException e) {
            System.out.println("Gap loi: " + e.getMessage());
        }

        try {
            example.openFile("C://file.txt");
        }

        catch (FileNotFoundException e) {
            System.out.println("Gap loi: " + e.getMessage());
        }
    }

}

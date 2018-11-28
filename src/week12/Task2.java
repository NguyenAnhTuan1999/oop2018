package week12;

public class Task2 {

    public static void main(String[] args) {
        int[] a = new int[]{3, 5, 7, 9, 5, 0, 1};

        Sort sort = new Sort(new SelectionSort());

        sort.sortDescending(a);
        for (int i: a) {
            System.out.print(i + " ");
        }

        System.out.println();
        sort = new Sort(new BubbleSort());
        sort.sortUpAscending(a);
        for (int i: a) {
            System.out.print(i + " ");
        }
    }
}

interface Strategy {
    void sortUpAscending(int[] arr);
    void sortDescending(int[] arr);
}

class BubbleSort implements Strategy {

    @Override
    public void sortUpAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class SelectionSort implements Strategy {

    @Override
    public void sortUpAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    @Override
    public void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] > arr[index]){
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}

class Sort {

    Strategy strategy;

    public Sort(Strategy strategy){
        this.strategy = strategy;
    }

    public void sortUpAscending(int[] arr){
        strategy.sortUpAscending(arr);
    }

    public void sortDescending(int[] arr) {
        strategy.sortDescending(arr);
    }
}
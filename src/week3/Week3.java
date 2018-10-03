package week3;

public class Week3 {

    public static int max(int m, int n) {
        // TODO: Tìm giá trị lớn nhất của hai số nguyên, giá trị trả về của hàm là số lớn nhất
        if (m > n){
            return m;
        }
        else{
            return n;
        }
    }

    public static int minOfArray(int[] array) {
        // TODO: Tìm giá trị nhỏ nhất của của một mảng số nguyên (kích thước mảng <= 100 phần tử)
        int min = array[0];
        for (int i=1; i<array.length; i++){
                if (array[i]<min){
                    min = array[i];
                }
        }
        return min;
    }

    /**
     * Chương trình tính chỉ số BMI và in ra kết quả đánh giá
     * @param weight cân nặng
     * @param height chiều cao
     * @return Thiếu cân, Bình thường, Thừa cân, Béo phì
     */
    public static String calculateBMI(double weight, double height) {
        // TODO: Viết chương trình tính chỉ số BMI và in ra kết quả đánh giá
        double BMI = weight/(height*height);
        if (BMI<18.5) return "Thiếu cân";
        else if (BMI>=18.5 && BMI<=22.99) return "Bình thường";
        else if (BMI>22.99 && BMI<=24.99) return "Thừa cân";
        else if (BMI>24.99) return "Béo phì";
        return null;
    }

    public static void main(String[] args){
        System.out.println(max(2, 9));
        int[] a = {1, 5, 8, 6, 87, 32, 16, 99, 12, 0, -9, -100};
        System.out.println(minOfArray(a));
        System.out.println(calculateBMI(80, 1.9));

    }
}

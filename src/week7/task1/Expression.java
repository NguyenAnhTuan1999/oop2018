package week7.task1;

public abstract class  Expression {

    public abstract String toString();

    public abstract int evaluate();


}

class ExpressionTest {

    public static void main(String[] args) {

        Numeral ten = new Numeral(10);
        Numeral one = new Numeral(1);
        Numeral two = new Numeral(2);
        Numeral three = new Numeral(3);

        Square squareOfTen = new Square(ten);

        Subtraction subtraction1 = new Subtraction(squareOfTen, one);

        Multiplication multiplication = new Multiplication(two, three);

        Addition addition2 = new Addition(subtraction1, multiplication);
        System.out.println("Ket qua cuar bieu thuc: (10^2 - 1 + 2*3)^2 la: ");
        System.out.println(new Square(addition2).evaluate());

        Subtraction subtraction = new Subtraction(ten, two);
        System.out.println("Ket qua phep tru:");
        System.out.println(subtraction.evaluate());

        Multiplication multiplication1 = new Multiplication(ten, one);
        System.out.println("Ket qua phep nhan:");
        System.out.println(multiplication1.evaluate());

        Division division = new Division(ten, two);
        System.out.println("Ket qua phep chia:");
        System.out.println(division.evaluate());

        try {
            Numeral zero = new Numeral(0);
            Division division1 = new Division(three, zero);
            System.out.println(division1.evaluate());
        }
        catch (ArithmeticException e) {
            System.out.println("Loi chia cho 0!");
        }
    }

}

package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(this.numerator*other.denominator + other.numerator*this.denominator, this.denominator*other.denominator);

        return a;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(this.numerator*other.denominator - other.numerator*this.denominator, this.denominator*other.denominator);

        return a;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(this.numerator*other.numerator, this.denominator*other.denominator);
        return a;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        Fraction a = new Fraction(this.numerator*other.denominator, this.denominator*other.numerator);
        return a;
    }
    public void printlnFraction(){
        if(this.numerator == 0){
            System.out.println(0);
        }
        else if(this.numerator == this.denominator){
            System.out.println(1);
        }
        else if(this.denominator == 1){
            System.out.println(this.numerator);
        }
        else {
            System.out.println(this.numerator + "/" + this.denominator);
        }
    }

    public Fraction simplifyFraction(){
        Fraction a = new Fraction(this.numerator, this.denominator);
        if(this.numerator == 0){
            a.numerator = 0;
            a.denominator = 1;
        }
        else if(this.numerator >= this.denominator){
            for(int i=this.denominator; i>1; i--){
                if(this.denominator % i == 0){
                    a.numerator = this.numerator / i;
                    a.denominator = this.denominator / i;
                    break;
                }
            }
        }
        else{
            for(int i=this.numerator; i>1; i--){
                if(this.numerator % i == 0 && this.denominator % i == 0){
                    a.numerator = this.numerator / i;
                    a.denominator = this.denominator / i;
                    break;
                }
            }
        }
        return a;
    }

    public boolean equals(Fraction a){
        return (this.simplifyFraction().numerator == a.simplifyFraction().numerator && this. simplifyFraction().denominator == a.simplifyFraction().denominator);
    }

    public static void main(String[] args){
        Fraction a = new Fraction(1, 2);
        Fraction b = new Fraction(6, 3);
        System.out.print("a + b = " );
        a.add(b).printlnFraction();
        System.out.print("a - b = ");
        a.subtract(b).printlnFraction();
        System.out.print("a.b = ");
        a.multiply(b).simplifyFraction().printlnFraction();
        System.out.print("a:b = ");
        a.divide(b).simplifyFraction().printlnFraction();
        b.simplifyFraction().printlnFraction();

    }
}

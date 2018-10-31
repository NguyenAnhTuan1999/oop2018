package week7.task1;

public class Numeral extends Expression {

    private int value;

    public Numeral(int value){
        this.value = value;
    }

    public Numeral(){
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        return this.value;
    }
}

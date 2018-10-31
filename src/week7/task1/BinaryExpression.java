package week7.task1;

public class BinaryExpression extends Expression {

    public Expression left(){
        return this;
    }

    public Expression right(){
        return this;
    }

    @Override
    public int evaluate() {
        return 0;
    }
}

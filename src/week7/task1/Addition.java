package week7.task1;

public class Addition extends BinaryExpression {

    private Expression left;
    private Expression right;

    public Addition(Expression firstExpression, Expression secondExpression){
        left = firstExpression;
        right =secondExpression;
    }

    @Override
    public int evaluate() {
        return left.evaluate() + right.evaluate();
    }
}

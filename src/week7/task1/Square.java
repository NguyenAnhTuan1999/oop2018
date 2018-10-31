package week7.task1;

public class Square extends Expression {

    private Expression expression;

    public Square(Expression expression){
        this.expression = expression;
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public int evaluate() {
        int expressionValue = this.expression.evaluate();
        return expressionValue*expressionValue;
    }
}

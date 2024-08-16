package LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good
 * <p>
 * User: piyushbajaj
 * Date: 25/04/23
 * Time: 10:24 pm
 */
public class Expression implements ArithmeticExpression {

    ArithmeticExpression leftExpression;
    ArithmeticExpression rightExpression;
    Operation operation;

    public Expression(final ArithmeticExpression leftExpression, final ArithmeticExpression rightExpression,
                      final Operation operation) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
        this.operation = operation;
    }

    @Override
    public int evaluate() {
        int value = 0;

        switch (operation) {
            case ADD:
                value = leftExpression.evaluate() + rightExpression.evaluate();
                break;
            case DIVIDE:
                value = leftExpression.evaluate() / rightExpression.evaluate();
                break;
            case MULTIPLY:
                value = leftExpression.evaluate() * rightExpression.evaluate();
                break;
            case SUBTRACT:
                value = leftExpression.evaluate() - rightExpression.evaluate();
                break;
        }

        System.out.println("Expression value is: " + value);
        return value;
    }
}

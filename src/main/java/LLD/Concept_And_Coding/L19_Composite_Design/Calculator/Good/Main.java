package LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good
 * <p>
 * User: piyushbajaj
 * Date: 25/04/23
 * Time: 10:28 pm
 */
public class Main {
    public static void main(String[] args) {
        ArithmeticExpression two = new java.lang.Number(2);

        ArithmeticExpression one = new java.lang.Number(1);
        ArithmeticExpression seven = new java.lang.Number(7);

        ArithmeticExpression addExpression = new Expression(one, seven, Operation.ADD);

        ArithmeticExpression parentExpression = new Expression(two, addExpression, Operation.MULTIPLY);

        System.out.println(parentExpression.evaluate());

    }
}

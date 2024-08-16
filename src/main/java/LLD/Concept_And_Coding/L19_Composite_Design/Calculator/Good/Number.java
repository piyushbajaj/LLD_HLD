package LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good;

import lombok.AllArgsConstructor;

/**
 * Project: DSAlgo
 * Package: LLD.Concept_And_Coding.L19_Composite_Design.Calculator.Good
 * <p>
 * User: piyushbajaj
 * Date: 25/04/23
 * Time: 10:22 pm
 */

@AllArgsConstructor
public class Number implements ArithmeticExpression {
    int value;

    @Override
    public int evaluate() {
        System.out.println("Number: " + value);
        return value;
    }
}

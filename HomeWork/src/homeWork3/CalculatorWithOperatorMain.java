package homeWork3;

public class CalculatorWithOperatorMain  {
    public static void main(String[] args) {
        CalculatorWithOperator sc = new CalculatorWithOperator();        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        result = sc.getSum(sc.getSum(4.1,sc.getMultiply(15,7)),sc.getPow((sc.getDiv(28,5)),2));
        System.out.println(result);

    }
}


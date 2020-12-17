package homeWork3;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {
        CalculatorWithMathExtends ff = new CalculatorWithMathExtends();
        double result;
        result = ff.getSum(ff.getSum(4.1,ff.getMultiply(15,7)),ff.getPow((ff.getDiv(28,5)),2));
        System.out.println(result);
    }
}

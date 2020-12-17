package homeWork3;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy jj  = new CalculatorWithMathCopy();
        double result;
        result = jj.getSum(jj.getSum(4.1,jj.getMultiply(15,7)),jj.getPow((jj.getDiv(28,5)),2));
        System.out.println(result);
    }
}

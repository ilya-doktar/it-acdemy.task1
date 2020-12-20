package homeWork3;

public class CalculatorWithCounterMain extends CalculatorWithCounter implements ICalculator{
    public static void main(String[] args) {

        CalculatorWithCounter cc = new CalculatorWithCounter();

        double result ;

        result = cc.getSum(cc.getSum(4.1,cc.getMultiply(15,7)),cc.getPow((cc.getDiv(28,5)),2));

        System.out.println(result);
        System.out.println(cc.count);
    }
}

package homeWork3;

public class CalculatorWithMathCopyMain implements ICalculator {
    public static void main(String[] args) {
        CalculatorWithMathCopy jj  = new CalculatorWithMathCopy();
        double result;
        result = jj.getSum(jj.getSum(4.1,jj.getMultiply(15,7)),jj.getPow((jj.getDiv(28,5)),2));
        System.out.println(result);
    }

    @Override
    public double getDiv(double a, double b) {
        return 0;
    }

    @Override
    public double getMultiply(double a, double b) {
        return 0;
    }

    @Override
    public double getSum(double a, double b) {
        return 0;
    }

    @Override
    public double getSub(double a, double b) {
        return 0;
    }

    @Override
    public double getPow(double a, int b) {
        return 0;
    }

    @Override
    public int getAbs(int a) {
        return 0;
    }

    @Override
    public double getSqrt(double a) {
        return 0;
    }
}

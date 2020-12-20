package homeWork3;

public class CalculatorWithMathExtendsMain implements ICalculator{
    public static void main(String[] args) {
        CalculatorWithMathExtends ff = new CalculatorWithMathExtends();
        double result;
        result = ff.getSum(ff.getSum(4.1,ff.getMultiply(15,7)),ff.getPow((ff.getDiv(28,5)),2));
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

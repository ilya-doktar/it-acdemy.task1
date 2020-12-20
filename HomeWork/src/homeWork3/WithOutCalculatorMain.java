package homeWork3;

public class WithOutCalculatorMain implements ICalculator {
    public static void main(String[] args) {
        double a = 4.1 + 15 * 7 + Math.pow((28 / 5), 2);
        System.out.println(a);
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

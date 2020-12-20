package homeWork3;

import javax.swing.*;

public class CalculatorWithOperatorMain implements ICalculator {
    public static void main(String[] args) {
        CalculatorWithOperator sc = new CalculatorWithOperator();        //4.1 + 15 * 7 + (28 / 5) ^ 2
        double result;
        result = sc.getSum(sc.getSum(4.1,sc.getMultiply(15,7)),sc.getPow((sc.getDiv(28,5)),2));
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


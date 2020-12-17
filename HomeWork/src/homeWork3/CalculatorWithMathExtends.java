package homeWork3;

public class CalculatorWithMathExtends extends CalculatorWithOperator {
    public double getPow(double a, int b){
        double result = Math.pow(a,b);
        return result;
    }

    public int getAbs(int a){
        int result = Math.abs(a);
        return result;
    }

    public double getSqrt(double a){
        double result = Math.sqrt(a);
        return result;
    }
}

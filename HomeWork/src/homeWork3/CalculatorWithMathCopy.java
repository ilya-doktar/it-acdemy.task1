package homeWork3;

public class CalculatorWithMathCopy {
    public double getDiv(double a, double b){
        double result;
        result = a / b;
        return result;
    }
    public double getMultiply(double a, double b){
        double result ;
        result = a * b;
        return result;
    }
    public double getSum(double a, double b){
        double result;
        result = a + b;
        return result;
    }
    public double getSub(double a , double b){
        double result ;
        result = a - b;
        return result;
    }


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

package homeWork3;

public class CalculatorWithOperator {

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
        double result = 1;
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }
        return result;
    }

    public int getAbs(int a){
       int result = (a < 0) ? -a : a;
       return result;
    }

    public double getSqrt(double a){
        double result = Math.sqrt(a);
        return result;
    }

}

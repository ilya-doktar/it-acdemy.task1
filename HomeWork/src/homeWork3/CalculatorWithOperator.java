package homeWork3;

public class CalculatorWithOperator  implements ICalculator{

    public long count = 0;

    public double getDiv(double a, double b){
        double result;
        result = a / b;
        count++;
        return result;
    }
    public double getMultiply(double a, double b){
        double result ;
        result = a * b;
        count++;
        return result;
    }
    public double getSum(double a, double b){
        double result;
        result = a + b;
        count++;
        return result;
    }
    public double getSub(double a , double b){
        double result ;
        result = a - b;
        count++;
        return result;
    }

    public double getPow(double a, int b){
        double result = 1;
        for (int i = 1; i <= b ; i++) {
            result *= a;
        }
        count++;
        return result;
    }

    public int getAbs(int a){
       int result = (a < 0) ? -a : a;
       count++;
       return result;
    }

    public double getSqrt(double a){
        double result = Math.sqrt(a);
        count++;
        return result;
    }

}

package HomeWork2;

public class Loops1 {


        public static void main(String[] args) {
            System.out.println(" = " + getMultiply(9));//1.1.1
            //       System.out.println(" = " + getFactorial(5));

        }
        public static long getMultiply(long a){
            long result = 1;
            if(a < 0 || a == 0){
                return result;
            }
            System.out.print(result);
            for (int i = 2; i <= a; i++) {
                System.out.print(" * "+ i );
            }
            for (int i = 1; i <=a ; i++) {
                result = result * i ;
            }
            return result;
        }
  /*  public static long getFactorial(long a){
        int result = 1;
        if (a < 0 || a == 0) {
            return result;
        }
        for ()

        return result;
    }*/ // рекурсия 1.1.2*

    }



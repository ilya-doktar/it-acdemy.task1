package HomeWork2.loops;

import java.util.Objects;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println(getMultiply(2123));
    }
    public static String getMultiply(int a){

        if( a == (double)a){
            System.out.println("Введено не целое число");
            return "";
        }

        String out = "";
        int result = 1;
        int j = 1;
        int b = a;

       while ( b/10 > 0) {
           b = b/10;
           j++;
       }

       for (int i = 0; i < j; i++) {
           int c = a % 10;
           a = a / 10;
           result = result * c;
           out = out +  " * " + c;
       }
        out = out + "= " + result;
       return out;
    }
}


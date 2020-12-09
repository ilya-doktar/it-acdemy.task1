package HomeWork2;

import java.util.Objects;

public class Loops2 {
    public static void main(String[] args) {
        System.out.println(getMultiply(412321253));
    }
    public static String getMultiply(int a){
        if( a % a !=0){
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


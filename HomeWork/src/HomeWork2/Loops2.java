package HomeWork2;

import java.util.Objects;

public class Loops2 {
    public static void main(String[] args) {
        getMultiply(4123212);
    }
    public static void getMultiply(int a){
        String out = "";
        int result = 1;
        int j = 1;
        int b = a;
       while ( b/10 > 0) {
           b = b/10;
           j++;
       }
       System.out.println("Count of numbers: " + j);
       for (int i = 0; i < j; i++) {
           int c = a % 10;
           a = a / 10;
           result = result * c;
           out = out + c + " * ";
       }
        out = out + "= " + result;
        System.out.println(out);
    }
}


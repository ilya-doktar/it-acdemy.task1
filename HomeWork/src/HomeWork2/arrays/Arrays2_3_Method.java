package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays2_3_Method {

    public static int  getSumEvenElements ( int[] a ){
       int result = 0;
       for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] % 2 == 0){
                result += a[i];
           }
           System.out.print(a[i]+" ");

       }
        return result;
   }
    public static int getMaxValueEven(int[] a){
        int result = 0;
       for (int i = 0; i < a.length; i++) {
           if(i % 2 ==0 && a[i] > result){
               result=a[i];
           }
       }
       return result;
   }
    public static int[] getElementsGreaterThanAvg(int[] a){
        int sum = getSum(a);
        float avg = sum / a.length;
        int y = 0, j = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<avg){
                j++;
            }
        }
        int[] result = new int[j];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<avg){
              result[y] = a[i];
              y++;
            }
        }
        return result;
   }
    public static int[] getTwoMinElements (int[] a){
        int min1 = a[0];
        int min2 = a[0];
        int j = a[0];
       for (int i = 0; i < a.length ; i++) {
           if(a[i]< min1){
                min1 = a[i];
           }
       }
       for (int i = 0; i < a.length ; i++) {
           if(a[i] < min2 && a[i] > min1){
               min2 = a[i];
           }
       }
       int[] result = {min1,min2};
       return result;
   }
    public static int getSum(int[] a){
        int sum = 0;
        for (int i = 0; i < a.length ; i++) {
            sum += a[i];
        }
        return sum;
    }

}

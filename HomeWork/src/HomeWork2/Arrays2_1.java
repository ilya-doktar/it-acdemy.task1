package HomeWork2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays2_1 {
    public static void main(String[] args) {
        int[] container = arrayFromConsole();
        System.out.println(Arrays.toString(container));
        System.out.println(Arrays.toString(getEverySecondElement(container)));
        System.out.println(Arrays.toString(getReversElements(container)));

    }
    public static int[] arrayFromConsole(){
        Scanner in = new Scanner(System.in);
        System.out.print("введите длину массива: ");
        int a = in.nextInt();
        int [] result = new int[a];        ;
        for (int i = 0; i < result.length ; i++) {
            result[i] = in.nextInt();
        }
        return result;
    }
    public static int[]  getEverySecondElement(int[] a) {
        int[] result = new int[a.length/2];
        int j = 0;
        for (int i = 1; i < a.length; i+=2) {
            result[j]=a[i];
            j++;
        }
        return result  ;
    }
    public static int[] getReversElements(int[] a){
        int[] result = new int[a.length];
        int j = 0;
        for (int i = a.length-1; i >= 0 ; i--) {
            result[j] = a[i];
            j++;
        }
        return result;
    }
}

package HomeWork2.arrays;

import java.util.Arrays;
import java.util.Random;

public class Arrays2_3 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5,100);
        System.out.println(Arrays.toString(container));
        System.out.println(Arrays.toString(Arrays2_3_Method.getElementsGreaterThanAvg(container)));
        System.out.println(Arrays2_3_Method.getSumEvenElements(container));
        System.out.println(Arrays2_3_Method.getMaxValueEven(container));
        System.out.println(Arrays.toString(Arrays2_3_Method.getTwoMinElements(container)));
        System.out.println(Arrays2_3_Method.getSum(container));
    }
    public static int[] arrayRandom(int size,int maxValueExclusion){
        Random rand = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = rand.nextInt(maxValueExclusion);
        }
        return result;
    }
}

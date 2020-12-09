package HomeWork2;

import java.util.Arrays;
import java.util.Random;

public class Arrays2_3 {
    public static void main(String[] args) {
        int[] container = arrayRandom(5,100);
        System.out.println(Arrays.toString(container));
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

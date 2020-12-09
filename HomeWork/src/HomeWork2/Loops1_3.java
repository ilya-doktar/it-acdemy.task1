package HomeWork2;

import java.util.Scanner;

public class Loops1_3 {
    public static void main(String[] args) {
        System.out.println(getPow());
    }
    public static float getPow (){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        float a = in.nextFloat();
        System.out.print("Введите степень в которую хотите возвести: ");
        int  b = in.nextInt();
        float result = 1;
        for (int i = 1; i <= b ; i++) {
            result = result * a;
        }
        System.out.print(a + " ^ " + b + " = ");
        return result;

    }
}

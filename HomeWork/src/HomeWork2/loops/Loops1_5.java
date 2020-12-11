package HomeWork2.loops;

public class Loops1_5 {
    public static void main(String[] args) {
//        int result2 = 2;
//        while(result2 < 10) {
//            for (int i = 1; i <= 10; i++) {
//                System.out.print(result2 + " * " + i + " = ");
//                System.out.println(" = " + result2 * i);
//            }
//            System.out.println(" ");
//            result2++;
//        }
        getTbMultiply(2,5);
        System.out.println();
        getTbMultiply(6,9);

    }
    public static void getTbMultiply(int a, int b){
        for (int i = 1; i <= 10; i++) {
            for (int j = a; j <= b; j++) {
                System.out.print(j+" x " + i + " = " +(j * i)+"\t");
            }
            System.out.print("\n");
        }
    }
}

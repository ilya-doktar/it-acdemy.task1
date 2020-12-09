package HomeWork2;

public class Loops1_5 {
    public static void main(String[] args) {
        int result2 = 2;
        while(result2 <= 10) {
            for (int i = 1; i <= 10; i++) {
                System.out.print(result2 + " * " + i);
                System.out.println(" = " + result2 * i);
            }
            System.out.println(" ");
            result2++;
        }

    }
}

package HomeWork1;

public class Task2 {
    public static void main(String[] args) {
        int a, b;
        a = 8;
        b = 2;
        boolean tr = true;
        boolean fl = false;
        System.out.println("2.1: "+(5+b/a));
        a = 8;
        System.out.println("2.2: " + ((5 + 2) / a));
        a = 8;
        b = 2;
        System.out.println("2.3: " + ((5 + b++) / a));
        a = 8;
        b = 2;
        System.out.println("2.4: "+((5 + b++) / --a));
        a = 8;
        b = 2;
        System.out.println("2.5: " + ((5 * 2 >> b++) / --a));
        a = 8;
        b = 2;
        System.out.println("2.6: " + ((5 + 7 > 20 ? 68 : 22 * 2 >> b++) / --a));
        a = 8;
        b = 2;
        //System.out.println("2.7" + (5 + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --a);
        a = 8;
        b = 2;
        System.out.println("2.8: " + (6 - b > 3 && 12 * 12 <= 119));
        System.out.println("2.9: " + (tr&&fl));


    }
}

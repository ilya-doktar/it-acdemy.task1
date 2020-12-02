package HomeWork1;

public class Task4 {
    public static void main(String[] args) {
        boolean gf = Task4.sleepIn(false,false);
        System.out.println(gf);
    }


    public static boolean sleepIn(boolean weekday, boolean vacation) {

        if(!weekday || vacation){
            System.out.println("Можем спать дальше !");
            return true;
        }
        else {
            System.out.println("Пора идти на работу!");
            return false;
        }
    }
}

package HomeWork1;
import javax.naming.spi.ObjectFactoryBuilder;
import java.util.Objects;
import java.util.Scanner;

public class Task5_1_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();
        String vsya = "Вася";
        String nastya = "Анастасия";


        if (!Objects.equals(name, vsya ) && !Objects.equals(name,nastya)){
            System.out.println("Добрый день! А вы кто?");

        }
        if (Objects.equals(name,nastya)) {
            System.out.println("Я тебя так долго ждал!");

        }
        if(Objects.equals(name,vsya)){
            System.out.println("Привет!\nЯ тебя так долго ждал!");
        }







    }
}

package homeWork6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) throws IOException {
        printRates(new NBRBLoader());

            File file = new File("D:\\Current.txt");
            file.createNewFile();
            SiteLoader loader = new NBRBLoader();
            String eurStr = "Курс " + SiteLoader.Currency.EUR + ": " + loader.load(SiteLoader.Currency.EUR) + "\n";
            String rubStr = "Курс " + SiteLoader.Currency.RUB + ": " + loader.load(SiteLoader.Currency.RUB) + "\n";
            String usdStr = "Курс " + SiteLoader.Currency.USD + ": " + loader.load(SiteLoader.Currency.USD) + "\n";

        try( FileWriter writer = new FileWriter(file)){
            writer.write("");
            writer.append(eurStr);
            writer.append(rubStr);
            writer.append(usdStr);
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.err.println(e.getStackTrace() + "Упс, ошибка записи в файл...");
        }

    }

    public static void printRates(SiteLoader loader){
        System.out.println("Курс " + SiteLoader.Currency.EUR + ": " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Курс " + SiteLoader.Currency.RUB + ": " + loader.load(SiteLoader.Currency.RUB));
        System.out.println("Курс " + SiteLoader.Currency.USD + ": " + loader.load(SiteLoader.Currency.USD));
    }
}


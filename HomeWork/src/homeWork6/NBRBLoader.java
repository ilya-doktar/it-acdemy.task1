package homeWork6;

import java.sql.SQLOutput;

public class NBRBLoader extends SiteLoader{

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        //TODO дописываем код сюда
        int serachResult;
        String searchString = "\"Cur_OfficialRate\"";
        String resultStr = content.substring(content.indexOf(searchString) + 19, content.lastIndexOf("}"));
        double result = Double.parseDouble(resultStr);
        return result;
    }
}


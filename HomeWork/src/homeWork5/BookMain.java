package homeWork5;



import java.io.*;
import java.util.*;

public class BookMain {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("D:\\book.txt");
        Scanner scan = new Scanner(fr);
        String withoutPP = scan.nextLine().replaceAll("\\pP", "");
        String[] words = withoutPP.split("\\s+^\\s*$");
        Set<String> uniqWords = new LinkedHashSet<>(Arrays.asList(words));
        Map words10 = new HashMap();
        SortMap bvc = new SortMap(words10);
        TreeMap<String,Integer> top10 = new TreeMap<>(bvc);

        for(String word : uniqWords){
            int count = 0;
            for (int i = 0; i<words.length; i++) {
                if (word.equals(words[i])) {
                    count++;
                }
            }
            words10.put(word, count);
        }

         top10.putAll(words10);
        int i = 0;
        for (Map.Entry<String, Integer> element : top10.entrySet())
        {
            if(i != 10) {
                String key = element.getKey();
                Integer value = element.getValue();
                System.out.println(key + ":" + value);
                i++;
            }
        }










        fr.close();
    }

}

package homeWork5;

import java.util.Comparator;
import java.util.Map;

public class SortMap implements Comparator<String> {
    Map<String,Integer> sort;

    public SortMap(Map<String,Integer> sort){
        this.sort = sort;
    }

    public int compare(String a, String b){
        if (sort.get(a) >= sort.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}

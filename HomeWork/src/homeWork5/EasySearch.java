package homeWork5;

public class EasySearch implements ISearchEngine{



    public long search(String text, String word){

        long count = 0;
        StringBuilder str = new StringBuilder();
        str.insert(0, " ").append(word).append(" ");
        int index = text.indexOf(String.valueOf(str));
        while (index != -1){
            count++;
            index = text.indexOf(String.valueOf(str), index+1);
        }
        return count;
    }
}

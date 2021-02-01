package homeWork4;


import java.util.Comparator;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        DataContainer<Integer> container  = new DataContainer<>(arr);
        container.add(10);
        container.add(15);
        container.add(1);
        container.add(0);
        container.add(-4);
        //DataContainer.sort(comparator);



    }
}

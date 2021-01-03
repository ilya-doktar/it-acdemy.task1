package homeWork4;

import java.util.concurrent.ConcurrentNavigableMap;

public class DataContainerMain {
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,null,4,null};
        DataContainer<Integer> container  = new DataContainer<>(arr);
        container.add(5);
        container.add(666);
        container.add(228);
      // System.out.println(container.get(3));
      // System.out.println(container.get(10));
        container.getItems();//?????
        container.delete(99);
        container.delete(2255\);
    }
}

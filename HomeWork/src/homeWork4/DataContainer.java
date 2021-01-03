package homeWork4;

import java.util.Arrays;



public class DataContainer<T> {
 private T data [];



  DataContainer(T[] obj){
      this.data = obj;
  }


  public int add(T item) {
      boolean isOverLoaded = false;
      int breakIndex = 0;
      if(item == null){
          breakIndex = -1;

      }else{
          for (int i = 0; i < data.length; i++) {
              if (data[i] == null) {
                  data[i] = item;
                  breakIndex = i;
                  isOverLoaded = true;
                  System.out.println(data[i]);
                  break;
              }
          }
          if (!isOverLoaded){
              T copyData [] = Arrays.copyOf(data,data.length + 1);
              copyData[copyData.length-1]=item;
              data = copyData;
              breakIndex = data.length - 1;

          }
      }
      return breakIndex;
  }

  public T get(int index){
      if(index > data.length){
          return null;
      }
      return data[index];
  }

  public T[] getItems(){
      return this.data;
  }

  public boolean delete(int index){//удалить ячейку

      if (data.length>index){
          data[index] = null;
          return true;
      }
      return false;
  }

  public boolean delete(T item){
      for (int i = 0; i < data.length; i++) {
          if (data[i] == item){
              data[i] = null;
              for (int j = 0; j < data.length; j++) {
                  System.out.println(data[j]);
              }
              return true;
          }
      }
      return false;
  }

}

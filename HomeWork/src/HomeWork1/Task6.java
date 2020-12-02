package HomeWork1;

public class Task6 {
    public static void main(String[] args) {
        int[] array = new int[] {0,1,2,3,4,5,6,7,8,9};
        String phoneNumber = Task6.createPhoneNumber(array);
        System.out.println(phoneNumber);

    }

    public static String createPhoneNumber (int[] array ){
        String result = "";
        for(int i = 0;i< array.length; i++){
            if(i == 0){
                result = result + "(";
                result = result + array[i];
            }
            else if(i == 3){
                result = result + ") ";
                result = result + array[i];
            }
            else if(i == 6){
                result = result + "-";
                result = result + array[i];
            }
            else{
                result = result + array[i];
            }
        }
        return result;

    }

}

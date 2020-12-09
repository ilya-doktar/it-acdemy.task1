package HomeWork1;

public class BitOperations {
    public static void main(String[] args) {
//задание 1 
    //1.2.все возможные побитовые операции с 42 и 15
       int  a  = 42, b = 15;// в двоичной а = 101010, b = 1100011
        System.out.println(a&b);//вывод будет десять 101010 & 1111 =  1010(10 в десятичной) И
        System.out.println(a|b);//101111(результат) ИЛИ
        System.out.println(a^b);//1001010  исключающее ИЛИ
        System.out.println(a<<b);//101010000000000000000 сдвиг битов влево
        System.out.println(a>>b);//0 сдвиг битов вправо


    //1.3
       int  s = -42,v = -15;
        System.out.println(s&v);// 010000 И ( берем 48 в двоичной , меняем 1 на 0  и прибавляем 1)
        System.out.println(s|v);// 0111 ИЛИ
        System.out.println(s^v); // 100111
        System.out.println(s<<v); // 0101100000000000000000
        System.out.println(s>>v); // 1


      //1.5
       /* double h =  42.5;
        double m =  4;
        System.out.println(h & m); //нельзя проводить побитовые опреации с вещественными числами
        */


    }


}






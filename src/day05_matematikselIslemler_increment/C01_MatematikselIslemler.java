package day05_matematikselIslemler_increment;

public class C01_MatematikselIslemler {

    public static void main(String[] args) {

        int a = 27;
        int b= 4;
        System.out.println(a/b);

        System.out.println(32/5);

        double c= 27;
        System.out.println(c/b);

        double sonuc1= a/b;
        System.out.println("sonuc1: "+ sonuc1);

        double sonuc2= (double) (a/b);
        System.out.println("sonuc2: "+ sonuc2);

        double sonuc3= (double)a/b;
        System.out.println("sonuc3: "+ sonuc3);

        System.out.println();

 //       Java iki tamsayiyi bolerseniz sonucu tam sayi olarak verir.
        //   eger bolen sayi veya bolunen sayidan biri double ise sonucu

        System.out.println(2567/10);
        System.out.println(256%10);
        System.out.println(25%10);
        System.out.println(2%10);
        System.out.println(2567%10);




    }
}

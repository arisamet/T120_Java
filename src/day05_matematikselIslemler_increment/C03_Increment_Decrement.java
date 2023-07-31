package day05_matematikselIslemler_increment;

import java.util.Arrays;

public class C03_Increment_Decrement {

    public static void main(String[] args) {

        int sayi= 10 ;

        sayi= 2*sayi+5;
        System.out.println(sayi);
sayi= 10;

        sayi*=2;
        sayi+=5;
        System.out.println(sayi);

        sayi= 10;

        sayi*=3;

        sayi -=3;

        sayi /=3;

        System.out.println(sayi);

        int a = 10;

        int b = a;
        a++;
        System.out.println("a: "+ a + " b : "+b);

        a= 10;
        a++;
        b=a;
        System.out.println("a: "+ a + " b : "+b);


        //Bu kullanim sadece a++ a-- ++a --a icin gecerlidir
        //burada ++ veya --'yi once mi yoksa sonra mi kullanacagimiza
        //bizden istenen duruma gore karar veririz
        //artirma once ise ++a
        //artirma sonra ise a++

        a= 20;
        System.out.println(a++); // 20
        System.out.println(a); // 21
        a= 20 ;
        System.out.println(--a); // 19
        System.out.println(a); // 19

        a= 20 ;
        System.out.println(a--);
        System.out.println(a);
        System.err.println("Helloo World");

        /*
            ÖDEV SORUSU: Aşağıdaki gibi bir ATM Karşılama Ekranı Hazırlayıp yazdırınız
        **********  WISE BANK   **********
            WISE ATM'YE HOŞGELDİNİZ
            1 – Bakiye Sorgulama
            2 – Para Yatırma
            3 – Para Çekme
            4 – Bilgi Güncelleme
            5 – Kart İade
        **********  WISE BANK   **********
*/

        byte b1= Byte.MAX_VALUE;
        byte b2 =Byte.MIN_VALUE;

        System.out.println("Byte Max. Deger: = "+ b2);
        System.out.println("b2 = " + b2);
        System.out.println("");

    }
}

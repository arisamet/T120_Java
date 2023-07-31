package practice_day02;

import java.util.Scanner;

public class P02_DataCasting {
    public static void main(String[] args) {


        //-Int olarak verilen 3 sayının toplamını double olarak yazdırın
        //Ipucu: double>float>long>int>short>byte

        //int a = 8, b = 3, c = 9;
        //int toplam = (a + b + c);
        //System.out.println("Toplam " + (double) toplam);
        //System.out.println("Toplam " + (short) toplam);


        //2- Kullanıcıdan iki double sayı alın ve ilk sayıyı ikinci sayıa bölün ve
        //sonucu tam sayı yazdırın

       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen iki onsdalikli sayi giriniz: ");
       double sayi1 = scan.nextDouble();
       double sayi2 = scan.nextDouble();
       int sonuc = (int) (sayi1 / sayi2);
       System.out.println("sonuc = "+sonuc);







    }
}

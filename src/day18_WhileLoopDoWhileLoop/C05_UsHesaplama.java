package day18_WhileLoopDoWhileLoop;

import day17_methodOlusturma_MethodOverlooding.C02_tamBolenlerSayisiniBulma;

import java.util.Scanner;

public class C05_UsHesaplama {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ussunu hesaplayacagimiz pozitif bir sayi giriniz: ");
        double sayi = scanner.nextDouble();
        System.out.println("Lutfen hesaplanacak us icin pozitif bir sayi giriniz : ");
        int us = scanner.nextInt();
        usHesapla(sayi, us);



    }

    public static void usHesapla(double sayi, int us) {


        double sonuc = 1;
        while (us > 0) {

            sonuc *= sayi;
            us--;
        }

        System.out.println("Sonuc " + sonuc);
    }
}
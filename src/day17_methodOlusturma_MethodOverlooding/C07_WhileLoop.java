package day17_methodOlusturma_MethodOverlooding;

import java.util.Scanner;

public class C07_WhileLoop {

    public static void main(String[] args) {
        //Soru 4 : Main methodda Kullanicidan bir sifre isteyin,
        // Olusturacagimiz bir methodda asagidaki sartlari kontrol edin
        // ve methoddan true veya false dondurun
        //
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //          tum sartlari saglanincaya kadar tekrar tekrar deger isteyin
        //         tum sartlar saglaninca , "sifre basariyla kaydedildi" yazdirin
        //         - ilk harf kucuk harf olmali
        //         - son karakter rakam olmali
        //         - sifre bosluk icermemeli
        //         - uzunlugu en az 10 karakter olmali
            boolean sonuc = false;
            while (sonuc == false) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen sifrenizi giriniz: ");
            String sifre = scanner.nextLine();


        }
        //public static boolean sifreKontrolEt(String sifre){

        //    int sayac = 0;//sayac hatalari saysin

        //    //          - ilk harf kucuk harf olmali

        //    char ilkharf = sifre.charAt(0);
        //    if (!(ilkharf>= 'a'&& ilkharf<= 'z')
        //        System.out.println("Ilk karakter kucuk harf olmali");
        //        sayac++;
        //    }
        //    //         - son karakter rakam olmali

        //    char sonKarakter = sifre.char
        //    //         - sifre bosluk icermemeli
        //    //         - uzunlugu en az 10 karakter olmali

        System.out.println("sifreniz basariyla kaydedildi");
    }


}




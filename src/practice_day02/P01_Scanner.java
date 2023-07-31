package practice_day02;

import java.util.Scanner;

public class P01_Scanner {
    public static void main(String[] args) {

        /*


        1- Kullanıcıdan ad/soyad/yas/mail adresi/şifre bilgileirini alıp
        sisteme kaydedildiğini aşağıdaki formatta yazdırın.
                *****       KAYIT BAŞARILI      *****
        Adınız: Tarık
        Soyadınız: Yiğit
        Yaşınız:42
        Mail Adresiniz:tarik@yigit.com
        Şifreniz: A2e365
        şeklinde sistemimize kaydınız başarıyla tamamlanmıştır.

*/
        Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen asagidaki bilgileri giriniz!");
        //System.out.print("Adiniz: ");
        //String name= scan.nextLine();
        //System.out.println("");
        //System.out.println("Soyadiniz: ");
        //String surname= scan.nextLine();
        //System.out.println();
        //System.out.println("Yasiniz: ");
        //int yas= scan.nextInt();
        //System.out.println();
        //System.out.println("Mail adresiniz:");
        //String mail= scan.next();
        //System.out.println();
        //System.out.println("Sifreniz: ");
        //String sifre = scan.next();
        //System.out.println();
        //System.out.println("*****       KAYIT BAŞARILI      *****");
        //System.out.println("Adiniz: "+ name);
        //System.out.println("Soyadiniz: "+surname);
        //System.out.println("Yasiniz: "+yas);
        //System.out.println("Mail adresiniz: "+mail);
        //System.out.println("Sifreniz: " + sifre);
        //System.out.println("seklinde sistemimize kaydınız başarıyla tamamlanmıştır.");


        // 2- Kullanıcıdan üçgenin kenarını ve o kenarın yüksekliğini girmesini isteyerek
        //üçgenin alanını hesaplayıp yazdırın

        //System.out.println("Lutfen alani hesaplanacak olan ucgenin ilgili ayrit degerlerini giriniz");
        //System.out.println("Ucgenin bir kenarinin uzunlugunu giriniz: ");
        //double kenar = scan.nextDouble();
        //System.out.println("Kenara ait yuksekligi giriniz: ");
        //double yukseklik = scan.nextDouble();
        //System.out.println("============= Bilgileri Girilen Ucgenin Alan Hesabi Sonucu ==========");
        //System.out.println("Ucgenin Alani : "+(kenar*yukseklik)/2);


        //
        System.out.println("Lutfen iki adet sayi giriniz: ");
        System.out.println("Birinci Sayi: ");
        double sayi1 = scan.nextDouble();
        System.out.println("Ikinci Sayi: ");
        double sayi2 = scan.nextDouble();
        System.out.println("Girdiginiz 1. sayi: " + sayi1 + " 'dir\n" + "Girdiginiz 2.sayi : " + sayi2 + " dir");
        System.out.println("Hokus pokus");
        sayi1 = 15;
        sayi2 = 10;
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println("Girdiğiniz değerler yer değiştirdi\n"+"1.Sayı: "+sayi1+" oldu\n"
                    +"2.Sayı: "+sayi2+" oldu");
        //3-Kullanıcıdan iki sayı alıp üçüncü bir değişken kullanmadan sayı değerlerini
        //değiştirin (Swap)
        //        */
        //System.out.println("Lütfen iki adet sayı giriniz");
        //System.out.print("Birinci Sayı: ");
        //double sayi1= scan.nextDouble();
        //System.out.print("İkinci Sayı: ");
        //double sayi2= scan.nextDouble();
        //System.out.println("Girdiğiniz 1. Sayı:"+sayi1+"'dir\n" +
        //        "Girdiğiniz 2. sayı: "+sayi2+"'dir");
        //System.out.println("------- Hokus Pokus -------");
        ////sayi1=10 sayi2=15
        //sayi1=sayi1+sayi2;   //sayi1=25
        //sayi2=sayi1-sayi2;  //sayi2=10
        //sayi1=sayi1-sayi2;  //sayi1=15
        //System.out.println("Girdiğiniz değerler yer değiştirdi\n"+"1. Sayı: "+sayi1+" oldu\n"
        //       +"2. Sayı: "+sayi2+" oldu");

    }


}

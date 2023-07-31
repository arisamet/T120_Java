package day16_methodOlusturma_Kullanma;

import java.util.Scanner;

public class C03_MethodOlusturma {

    // Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    // Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    // isim bosluk soyisim seklinde bize donduren bir method olusturun
    // input : isim : Ali Soyisim :YILMAZ.    output : Ali Yilmaz

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz: ");// Tek isim istedik
        String isim = scanner.next();

        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyIsim = scanner.next();

        System.out.println(isimduzenle(isim, soyIsim));

        String duzenliIsim = isimduzenle(isim, soyIsim);

    }

    public static String isimduzenle(String isim, String soyisim) {

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        String IstenenFormattaIsimSoyisim = isim + " " + soyisim;

        return IstenenFormattaIsimSoyisim;


    }


}

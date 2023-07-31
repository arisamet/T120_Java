package Practice_day06;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class MethodCreation {
    /*
Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz: ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz: ");
        String soyisim = scan.nextLine();
        System.out.println(isimSoyisimYazdir(isim, soyisim));
    }

    private static String isimSoyisimYazdir(String isim, String soyisim) {
        isim= isim.toUpperCase().charAt(0)+ isim.substring(1).toLowerCase();
        soyisim= soyisim.toUpperCase().charAt(0)+ soyisim.substring(1).toLowerCase();
        String duzenliIsim= isim+" "+soyisim;
        return duzenliIsim;

    }


}



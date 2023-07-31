package Practice_day06;

import java.util.Scanner;

public class MethodCreations {

    public static void main(String[] args) {

        /*
    Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak "asal sayi" veya "asal sayi degil"
        sonuclarini donduren bir method olusturun.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz:");
        int sayi= scan.nextInt();
        System.out.println( asalSayiKontrol(sayi));
    }

    private static String asalSayiKontrol(int sayi) {
        String sonuc= "sayi asal sayidir";
        for (int i = 2; i <sayi ; i++) {
            if (sayi%i==0){
                sonuc="sayi asal sayi degildir";
            }
        }
       return sonuc;

    }

}

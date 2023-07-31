package Soru_cozumleri;

import java.util.Scanner;

public class S07_TamBolenlerSayisiniBulma {
    public static void main(String[] args) {

        // Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();
        System.out.println(tamBolenlerSayisi(sayi));

    }

    public static int tamBolenlerSayisi(int sayi) {

        int sayac = 0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
            return sayac;
    }

}



package Soru_cozumleri;

import java.util.Scanner;

public class S04_KupHesaplama {
    public static void main(String[] args) {

       // Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz: ");
         int sayi = scanner.nextInt();
        double kup=  (sayi * sayi * sayi) /2d;
        System.out.println("Girdiginiz sayini kupunun yarisi: "+ kup + "dir");
    }
}

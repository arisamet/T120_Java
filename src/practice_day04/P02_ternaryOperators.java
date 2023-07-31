package practice_day04;

import java.util.Scanner;

public class P02_ternaryOperators {
    public static void main(String[] args) {

        // SORU: Kenar degerleri verilen ucgenin ikizkenar ucgen olup olmzadigini
        // Kontrol edip donut veren kod dizisini yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println(" Kontrol etmek istediginiz ucgenin kenar degerlerini giriniz: ");
        System.out.print("kenar-1: ");
        double kenar1 = scan.nextDouble();
        System.out.print("kenar-2: ");
        double kenar2 = scan.nextDouble();
        System.out.print("kenar-3: ");
        double kenar3 = scan.nextDouble();

             System.out.println(kenar1 > 0 && kenar2 > 0 && kenar3 > 0 ?
                     kenar1 == kenar2 && kenar1 == kenar3 && kenar2 == kenar3 ?
                             "Girdiğiniz değerler bir ikizkenar üçgene aittir"
                   : " Ucgen ikizkenar degil" :"Yanlis deger girdiniz");



     //  Soru: Kenar değerleri verilen üçgenin ikizkenar üçgen olup olmadığını kontrol edip
     //  dönüt veren kod dizisini yazınız.
     //          */
     //  Scanner scan = new Scanner(System.in);
     //  System.out.println("Kontrol etmek istediğiniz üçgenin kenar değerlerini giriniz.");
     //  System.out.print("Kenar-1: ");
     //  double kenar1 = scan.nextDouble();
     //  System.out.print("Kenar-2: ");
     //  double kenar2 = scan.nextDouble();
     //  System.out.print("Kenar-3: ");
     //  double kenar3 = scan.nextDouble();

     //           System.out.println(kenar1 > 0 && kenar2 > 0 && kenar3 > 0 ? //bir
     //          kenar1 == kenar2 && kenar1 == kenar3 && kenar2 == kenar3 ? //iki
     //                 "Girdiğiniz değerler bir ikizkenar üçgene aittir" ://iki
     //                 "Girdiğiniz üçgen ikizkenar değildir" ://bir
     //         "Yanlış Değer girdiğiniz ");

    }
}

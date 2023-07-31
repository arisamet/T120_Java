package practice_day03;

import java.util.Scanner;

public class P01_IfElseStatements {

    public static void main(String[] args) {
        // Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        // sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        // "istediginiz birim sisteme kayitli degil" yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen mesafeyi km olarak yaziniz: ");
        double km = scanner.nextDouble();
        System.out.println("Donusturmek istediginiz birim cinsini yaziniz: ");
        char birim = scanner.next().charAt(0);


        if (birim == 'm' || birim == 'M') {
            System.out.println("Km olarak yazdiginiz degerin karsiligi : " + km * 1000 + "dir");
        } else if (birim == 's' || birim == 'S' || birim == 'C' || birim == 'c') {
            System.out.println("Km olarak yazdiginiz degerin karsiligi: " + km * 100000 + "cm dir");
        } else if (birim == 'd' || birim == 'D') {
            System.out.println("Km olarak yazdiginiz degerin karsiligi: " + km * 10000 + "dm dir");

        } else {

            System.out.println("Girdiginiz deger sistemimizde bulunmamaktadir.");
        }


        //   Not: Birden fazla if,elseif,else durumlarında en son adıma bakılır.
        //   else ile ile bitiyorda if else bloğu tüm ihtimalleri kapsamalıdır.
        //   else ile bitiyorsa kapsanmayan ihtimaller de vardır.

        //  1- Öğrenci notunu harf notuna dönüştüren bir kod yazınız
        //  85-100 -----> AA
        //  80-85 ------> BA
        //  75-80 ------> BB
        //  65-75 ------> CB
        //  50-65 ------> CC
        //  50 Altı ise  ------> FF

        System.out.println("Lutfen notunuzu giriniz: ");
        double not = scanner.nextDouble();
        if (not > 100) {
            System.out.println("Notunuz 100'den fazla olamaz. harf karsiligi olamaz.");
        } else if (not >= 85 && not <= 100) {
            System.out.println("Girdiniz " + not + " 'un harf karsiligi AA");
        } else if (not >= 80 && not < 85) {
            System.out.println("Girdiniz " + not + " 'un harf karsiligi BA");
        } else if (not >= 75 && not < 80) {
            System.out.println("Girdiniz " + not + " 'un harf karsiligi BB");
        } else if (not >= 65 && not < 75) {
            System.out.println("Girdiniz " + not + "un harf karsiligi CB");
        } else if (not <= 50 && not < 65) {
            System.out.println("Girdiniz " + not + "un harf karsiligi CC");
        } else
            System.out.println("Girdiniz " + not + "un harf karsiligi FF");

    }


}
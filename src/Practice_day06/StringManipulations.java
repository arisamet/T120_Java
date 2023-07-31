package Practice_day06;

import java.util.Scanner;



public class StringManipulations {
    public static void main(String[] args) {


/*
        Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
         - cumlede is geciyorsa, "calismak guzeldir"
         - ikisini de iceriyorsa "Hem ev lazim hem is"
          - hicbirini icermiyorsa "cok calisman lazim" yazdirin.

 */


        Scanner scanner = new Scanner(System.in);
     //  System.out.println("Lutfen bir cumle yaziniz: ");
     //  String cumle= scanner.nextLine();
     //  String kucukcumle= cumle.toLowerCase();

     //  if (kucukcumle.contains("ev")&& kucukcumle.contains("is")){
     //      System.out.println("Hem ev hem is lazim");
     //  } else if (kucukcumle.contains("ev")) {
     //      System.out.println("home home sweet home");
     //  } else if (kucukcumle.contains("is")) {
     //      System.out.println("calismak guzeldir");
     //  }else {
     //      System.out.println("cok calisman lazim");


    //   ÖDEV-Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
    //   duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
    //   basariyla kaydedildi" yazdirin
    //           - ilk harf kucuk harf olmali
    //           - son karakter rakam olmali
    //           - sifre bosluk icermemeli
    //          - uzunlugu en az 10 karakter olmali

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz: ");
        String sifre= scanner.nextLine();
        char sonkrktr= sifre.charAt(sifre.length()-1);
        char ilkrktr= sifre.charAt(0);

         if (!Character.isLowerCase(ilkrktr)){
            System.out.println("Ilk harf kucuk harf olmali");
        }if (!Character.isDigit(sonkrktr)) {
            System.out.println("Son karakter rakam olmali");
        }  if (sifre.contains(" ") ){
            System.out.println("Sifre bosluk icermemeli");
        } if (sifre.length() < 10) {
            System.out.println("Uzunluk en az 10 karakter olmali");
        } else {
            System.out.println("Sifre basariyla kaydedildi");
            }
        }

}




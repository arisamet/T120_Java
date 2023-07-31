package day11_StringManipulations;

import java.util.Scanner;

public class C02_Length {

    public static void main(String[] args) {

        String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";

        System.out.println("isim uzunlugu: " + isim.length());

        System.out.println("son harf: " + isim.charAt(isim.length() - 1));

        System.out.println("sondan besinci harf : " + isim.charAt(isim.length() - 5));


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz: ");

        String isim1 = scanner.nextLine();


        int uzunluk = isim1.length();

        if (uzunluk % 2 == 0) {
            System.out.println("Uzunluk cift, ortadaki harf : "+ isim1.charAt(uzunluk/2-1)+ isim1.charAt(uzunluk/2));
        } else {
            System.out.println("uzunluk tek ortadaki harf : "+ isim1.charAt(uzunluk-1)/2);
        }


       //String isim = "Ramazan Uzunkavaklaraltindayataruyumazoglu";
       //// son harfi yazdirin
       //System.out.println("isim uzunlugu : " + isim.length()); // 42
       //System.out.println("son harf : " + isim.charAt(isim.length()-1)); // u
       //// sondan 5.harfi yazdirin
       //System.out.println(isim.charAt(isim.length()-5)); // z
       //// kullanicidan ismini alin
       //// ve ortadaki harfi yazdirin
       //// ismin uzunlugu cift sayi ise orta kisimdaki 2 harfi yazdirin
       //Scanner scanner = new Scanner(System.in);
       //System.out.println("Lutfen isminizi yaziniz");
       //String girilenIsim = scanner.nextLine();
       //int uzunluk = girilenIsim.length();
       //if (uzunluk % 2 == 0){ // uzunluk ciftse
       //    System.out.println("Uzunluk cift, ortadaki iki harf : " +
       //            girilenIsim.charAt(uzunluk/2 -1)+
       //            girilenIsim.charAt(uzunluk/2));
       //}else{ // uzunluk tekse
       //    System.out.println("Uzunluk tek, ortadaki harf : " + girilenIsim.charAt((uzunluk-1)/2));


    }









}
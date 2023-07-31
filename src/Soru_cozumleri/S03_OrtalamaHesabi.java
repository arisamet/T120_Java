package Soru_cozumleri;

import java.util.Scanner;

public class S03_OrtalamaHesabi {
    public static void main(String[] args) {
        // Kullanicidan 5 tane sayi alin,
        // alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen 5 adet tamsayi giriniz: ");
        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();
        int sayi4= scanner.nextInt();
        int sayi5= scanner.nextInt();


        int ortalama= (sayi1+sayi2+sayi3+sayi4+sayi5)/5;

        System.out.print("5 adet sayinin ortalamasi: "+ ortalama);


    }
}

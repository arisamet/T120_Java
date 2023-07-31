package day03_Scanner;

import java.util.Scanner;

public class C02_Scanner {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       System.out.println("Lutfen bir tamsayi giriniz: ");

        int girilenSayi = scanner.nextInt();

        System.out.println("girilen sayinin karesi: " +girilenSayi*girilenSayi);







    }
}

package day03_Scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen birdouble sayi giriniz: ");

        double girilenDouble= scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz: ");

        int girilenInt= scanner.nextInt();

        System.out.println("iki sayinin toplami: "+ (girilenInt+girilenDouble));
        System.out.println("iki sayinin carpimi : "+ girilenDouble*girilenInt);
    }
}

package day03_Scanner;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin iki kenarini giriniz: ");

        double kenar1= scanner.nextDouble();
        double kenar2= scanner.nextDouble();

        System.out.println("Dikdortgenin alani: "+ kenar2*kenar1);


    }
}

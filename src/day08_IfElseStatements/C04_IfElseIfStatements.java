package day08_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseIfStatements {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi % 3 == 0 && sayi % 5 == 0) {
            System.out.println("Super Sayi");

        } else if (sayi % 3 == 0) {
            System.out.println("3un kati ");

        } else if (sayi % 5 == 0)
            System.out.println("5in kati");

        }
    }



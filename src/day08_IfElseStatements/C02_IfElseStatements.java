package day08_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz:");
        int girilenSayi= scanner.nextInt();

  if (girilenSayi % 3== 0&& girilenSayi%5==0) System.out.println("super sayi");


       else if (girilenSayi % 3 == 0) System.out.println("3 un kati");

       else if (girilenSayi % 5 == 0) System.out.println("5 in kati");

       else System.out.println("Yaramaz sayi");




    }
}



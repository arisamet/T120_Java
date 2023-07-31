package day08_IfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz: ");

        char girilenKarakter= scanner.next().charAt(0);
        //:Kullanici ne kadar uzun kelime veya karakter girse de ilk karakteri alir.

        if (girilenKarakter>='A' && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter buyuk harf");

        }else {
            System.out.println("girilen karakter buyuk harf degil");
        }


    }
}

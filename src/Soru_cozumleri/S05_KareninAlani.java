package Soru_cozumleri;

import java.util.Scanner;

public class S05_KareninAlani {
    public static void main(String[] args) {
      //  Kullanıcıdan karenin kenar uzunluğunu alın.
        //  Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

        Scanner scanner= new Scanner(System.in);
        System.out.println("Karenin bir kenar uzunlugunu giriniz: ");
        int kenar= scanner.nextInt();
        int kareninAlani= kenar*kenar;
        int karenincevresi= (4*kenar);
        System.out.println("Karenin Alani : " + kareninAlani);
        System.out.println("Karenin cevresi :"+ karenincevresi);



    }
}


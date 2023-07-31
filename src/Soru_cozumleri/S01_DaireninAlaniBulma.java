package Soru_cozumleri;

import java.util.Scanner;

public class S01_DaireninAlaniBulma {
    public static void main(String[] args) {
       // Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        //Dairenin Alani  = 3.14*r*r           Dairenin Cevresi = 2*3.14.r


        Scanner scanner= new Scanner(System.in);
        System.out.println(" Lutfen dairenin yaricapini giriniz : ");
        double r= scanner.nextDouble();
        double pi= 3.14;
        double alan= pi*r*r;
        double cevre= 2*pi*r;

        System.out.println("Dairenin alani: " +alan);
        System.out.println("");// Alt satira gecmek icin kullaniriz.
        System.out.println("Dairenin cevresi "+ cevre);





    }
}

package day05_matematikselIslemler_increment;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz: ");

        int girilensayi= scanner.nextInt();


        int birlerBasamagi = 0;
        int rakamlarToplami= 0;


        birlerBasamagi = girilensayi % 10 ;

        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilensayi = girilensayi /10 ;

        birlerBasamagi = girilensayi % 10;

        rakamlarToplami = rakamlarToplami + birlerBasamagi;

        girilensayi = girilensayi /10;

        birlerBasamagi = girilensayi % 10;

        rakamlarToplami= rakamlarToplami + birlerBasamagi;

        girilensayi = girilensayi /10;

        System.out.println("rakamlar toplami: "+ rakamlarToplami);



    }
}

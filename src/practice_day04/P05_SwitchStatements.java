package practice_day04;

import java.util.Scanner;

public class P05_SwitchStatements {
    public static void main(String[] args) {
        // Kullanicidan o gunun hangi gin oldugunu girmesini isteyin
        // Haftanin kacinci gunu oldugunu yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bugun gunlerden hangi gun?");
        String gun = scan.next();
        switch (gun){
           case "Pazartesi" :// switch case durumunda eger case sayi ise direk yazilir case metin ise " " arasinda yazilir.
               System.out.println(gun+ "haftanin 1.gunudur");
               break;


            case "Sali " :
                System.out.println(gun + " haftanin 2.gunudur");
                break;
            case "Carsamba " :
                System.out.println(gun + " haftanin 3.gunudur");
                break;
            case "Persembe" :
                System.out.println(gun + " haftanin 4.gunudur");
                break;
            case "Cuma " :
                System.out.println(gun + " haftanin 5.gunudur");
                break;
            case "Cumartesi " :
                System.out.println(gun + " haftanin 6.gunudur");
                case "Pazar " :
                System.out.println(gun + " haftanin 7.gunudur");
                break;
            default:


                System.out.println(" Yanlis gun girdiniz");

        }
    }
}

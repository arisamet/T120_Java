package day08_IfElseStatements;

import java.util.Scanner;

public class C05_VucutKitleEndeksi {
    public static void main(String[] args) {


        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip
// vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
// vucut kitle endeksi 30’dan buyukse obez,
// 25-30 arasi ise kilolu,
// 20-25 arasi ise normal,
// 20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kilonuzu kilo olarak giriniz: ");
        double kilo = scanner.nextDouble();
        System.out.println("Lutfen boyunuzu giriniz: ");
        double boy = scanner.nextDouble();


        double VKE = kilo * 10000 / (boy * boy);

        if (VKE >= 30) {
            System.out.println("Obez");

        } else if (VKE >= 25){
            System.out.println("kilolu");


        }else if (VKE>=20){
            System.out.println("normal");


        }else {
            System.out.println("zayif");
        }
    }
}
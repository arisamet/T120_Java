package practice_day05;

import java.util.Scanner;

public class EkokEbob {
    public static void main(String[] args) {


        // Kullanıcıdan 2 tamsayı alın ve EBOB (En Büyük Ortak Bölen)
        // ve EKOK(En Küçük Ortak Kat) değerlerini bulun

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen pozitif iki tamsayi giriniz: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        int flag = 0;
        System.out.println(" Girdiginiz sayilar sirasiyla: " + num1 + " " + num2);
        // Once EBOB hesaplamasi yapalim
        // ilk once kucuk sayiyi EBOB degiskenine atadik
        // 30 ve 40 için ebob'u ilk oalrak 30 atadaık.
        int limitEbob = 0;
        if (num1 < num2) {
            limitEbob = num1;
        } else {
            limitEbob = num2;
        }
        // Atanan limitEBOB degerini birer azaltarak EBOBU buluyoruz
        // 30 degerinden baslayip 1er azaltrak ikisini de bolen en buyuk sayiyiy ariyoruz

        for (int i = limitEbob; i > 2; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("Bu sayilarin EBOB degeri: " + i);
                flag++;
                break;
            }
        }

        // flag degerinin hic artmamasi ortak bolen bulamadigi anlamina gelir
        if (flag == 0) {
            System.out.println("Bu iki sayinin ortak boleni yoktur");


            //Girilen sayıların Ekok değerini bulalım
            flag = 0;
            //for loop yazarken 1'den başlayıp bir limit koyarak i değerini 1'er arttırarak ilerleyeceğiz.
            //System.out.println("Lütfen Ekok değeri olabilecek maksimum limiti giriniz");
            //int limit= scan.nextInt();
            for (int i = 1; i < (num1 * num2); i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    System.out.println("Girdiğiniz sayıların Ekok değeri: " + i);
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Girdiğiniz sayıların belirttiğiniz limit değerinden'den küçük bir Ekok değeri yoktur");
            }


        }
    }
}








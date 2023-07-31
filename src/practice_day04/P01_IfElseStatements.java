package practice_day04;

import java.util.Scanner;

public class P01_IfElseStatements {

    public static void main(String[] args) {

        //Soru: Kenar degerleri girilrn bir ucgenin dik ucgen olup olmadigini
        // kontrol edip donut veren kod dizisini yaziniz

        Scanner scan = new Scanner (System.in);
        System.out.println("Kontrol edilecek ucgenin kenarlarini giriniz : ");
        System.out.println(" Birinci kenarin uzunlugu : ");
        int a= scan.nextInt();
        System.out.println("Ikinci kenarin uzunlugu : ");
        int b= scan.nextInt();
        System.out.println("Ucuncu kenarin uzunlugu : ");
        int c= scan.nextInt();
        System.out.println("=================1.cozum ===============");
        if ((a*a)+(b*b)==(c*c)){
            System.out.println("Ucgen dik ucgendir ");
        } else if ((a*a)+(c*c)==(b*b)) {
            System.out.println(" Ucgen dik ucgendir");
        } else if ((b*b)+(c*c)==(a*a)) {
            System.out.println("Ucgen dik ucgendir");

        }else {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }

        System.out.println("===============2. cozum==================");

        if ((a*a)+(b*b)==(c*c)|| (a*a)+(c*c)==(b*b) || (b*b)+(c*c)==(a*a)){
            // or (VEYA) isareti ile yazilanlardan sadece birinin dogrulanmasi yeterli
            // && (VE) isareti ile yazilanlarin tamamainin dogru olmasi gerekir
            System.out.println(" Ucgen dik ucgendir ");
        }else {
            System.out.println("Girdiginiz degerlere sahip ucgen dik ucgen degildir");
        }


    }
}

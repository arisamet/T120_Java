package practice_day04;

import java.util.Scanner;

public class P06_forLoop {

    public static void main(String[] args) {

        //:Kullanicidan sifirdan farkli pozitif bir sayi alalim ve
        // 1den o sayiya kadar olan sayilardan 4 ile bolunenleri yazdiralim

        Scanner scan=  new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz ");
        int girilenSayi= scan.nextInt();
        if (girilenSayi<=0){
            System.out.println("Yanlis giris yaptiniz. Pozif bir tamsayi giriniz");
        }else{
            for (int i = 1; i <=girilenSayi ; i++) {
                if (i % 4==0){
                    System.out.print(i + "-");
                }

           }
       }




    }
}

package day18_WhileLoopDoWhileLoop;

import java.util.Scanner;

public class C02_GirilenSayilariToplama {

    public static void main(String[] args) {
        // Kullanicidan toplamak uzere sayilar alin
        // Girilen Sayilarin toplami 500u gecerse
        // Bu kadar sayi yeter girilen sayilarin toplami ..... oldu yazdirin
        // Girilen sayi adedi 1à veya daha fazla olursa
        // 10dan fazla sayi giremezsin , girilen sayilarin toplami .... oldu yazdirin
        // ve islemi bitirin

        Scanner scanner;
        int sayac = 0;
        int toplam = 0;
        int sayi;

        while (sayac < 10 && toplam < 500) {     //while loop un ici True oldukca calismaya devam edecek

            scanner = new Scanner(System.in);
            System.out.println(" Lutfen toplanmak uzere sayi giriniz: ");
            sayi = scanner.nextInt();

            toplam += sayi;
            sayac++;
        }

        //while loop bitti ise
        //sartlardan biri saglanmadi demektir.

      if (sayac>=10){
          System.out.println("10dan fazla sayi giremezsin, girilen sayilarin toplami " +toplam+" oldu");
      }
        if (toplam>500){
            System.out.println("Bu kadar sayi yeter girilen sayilarin toplami " + toplam + " oldu");
        }




    }
}

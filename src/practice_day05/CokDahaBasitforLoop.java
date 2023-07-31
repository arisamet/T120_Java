package practice_day05;

import java.util.Scanner;

public class CokDahaBasitforLoop {
    public static void main(String[] args) {

     //  Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
     //  dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
     //  baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic degeri giriniz: ");
        int baslangic = scan.nextInt();
        System.out.println("Lutfen bitis degeri giriniz: ");
        int bitis= scan.nextInt();

        int toplam = 0;
        if (baslangic>bitis){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        }else{
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;

            }
            System.out.println("Girilen degerler arasindaki sayilarin toplami = "+ toplam);
        }
    }
}

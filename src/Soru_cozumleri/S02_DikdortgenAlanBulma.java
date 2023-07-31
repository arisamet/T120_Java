package Soru_cozumleri;

import java.util.Scanner;

public class S02_DikdortgenAlanBulma {
    public static void main(String[] args) {
//Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
//* Dikdortgenin Alani : uzun kenar * kisa kenar
//* Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dikdortgenin kisa kenarini giriniz: ");
        double kisaKenar = scanner.nextDouble();
        System.out.println("Dikdortgenin uzun kenarini giriniz: ");
        double uzunKenar = scanner.nextDouble();
        if (kisaKenar == uzunKenar) {
            System.out.println("HATA! Ayni deger giremezsiniz");
        } else {
            double alan = (kisaKenar * uzunKenar);
            double cevre = 2 * (uzunKenar + kisaKenar);
            System.out.println("Dikdortgenin Alani: " + alan);
            System.out.println("Dikdortgenin cevresi " + cevre);


        }
    }
}
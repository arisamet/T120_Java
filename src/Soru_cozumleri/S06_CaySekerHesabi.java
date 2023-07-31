package Soru_cozumleri;

import java.util.Scanner;

public class S06_CaySekerHesabi {
    public static void main(String[] args) {

      // Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
      // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
      // 1 şeker = 1.5 gr
      // 1 kg = 1000 gram      olarak hesaplayın



        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunde kac bardak cay iciyorsunuz: ");
        int cayTuketimi= scanner.nextInt();
        System.out.println("Bir bardak caya kac seker atiyorsunuz: ");
        int sekerTuketimi= scanner.nextInt();
        sekerTuketimi= sekerTuketimi*1500;
        int toplam= (cayTuketimi*sekerTuketimi)*365*1500;
        System.out.println("Bir yilda toplam "+ sekerTuketimi+ " gr seker tuketiyorsunuz" );





    }
}

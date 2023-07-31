package day03_Scanner;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz: ");
        String girilenIsim= scanner.nextLine();


        System.out.println("Lutfen soyadinizi giriniz: ");
        String girilenSoyisim= scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz: ");
        int yasgirilenYas= scanner.nextInt();

        System.out.println("Isminiz: "+ girilenIsim);
        System.out.println("Soyisim: "+ girilenSoyisim);
        System.out.println("Yasiniz: "+ yasgirilenYas);
        System.out.println("Kaydiniz basariyla tamalanmistir...");

        System.out.println("Isminiz: "+ girilenIsim+
                "Soyisim: "+ girilenIsim +
                "Yasiniz: "+ yasgirilenYas ) ;






    }
}

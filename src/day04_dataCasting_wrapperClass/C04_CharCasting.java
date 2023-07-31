package day04_dataCasting_wrapperClass;

import java.util.Scanner;

public class C04_CharCasting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ascii tablosundan bir karakter giriniz: ");
        char girilenKrk= scanner.next().charAt(0);
        System.out.println("girilen karakter : "+ girilenKrk);

        System.out.println("girilen karakterden sonraki uc karakter"+ girilenKrk+1+ ","+ girilenKrk+2 );

    }
}

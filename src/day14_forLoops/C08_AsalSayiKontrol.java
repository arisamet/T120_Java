package day14_forLoops;

import java.util.Scanner;

public class C08_AsalSayiKontrol {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen asal sayi kontrolu icin pozitif bir tamsayi giriniz: ");
        int sayi = scanner.nextInt();

        boolean flag = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i == 0){
                System.out.println("Asal degil");
                flag= false;
                break;
            }

            }
if (flag){
    System.out.println("Girilen sayi asal sayi");
}
        }



    }




package Practice_day06;

import java.util.Scanner;

public class forLoop {

    public static void main(String[] args){

    // SORU 1: Carpim tablosunu ekrana yazdiran program yaziniz

    //for (int i = 1; i <= 10; i++) { // Bu kisim 1*1 2*1 3*1
    // for (int j = 1; j <= 10; j++) {
    //   System.out.println(i + "x" + j + "=" + (i * j) + "\t");


        /*
        Soru 2:
        Kullanıcıdan bir sayı girişi alın ve 1'den o sayıya kadar olan tek sayıları ekrana yazdırın.
         */

    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("Lutfen bir sayi giriniz: ");
    //   int n = scan.nextInt();
    //   for (int i = 1; i <n ; i++) {
    //       if (i%2==1)
    //           System.out.print(i+ " ");

    /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

 */


            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen Baslangic degeri giriniz: ");
            int baslangic = scanner.nextInt();
            System.out.println("Lutfen bitis degeri giriniz: ");
            int bitis= scanner.nextInt();
            int toplam= 0;

            if (bitis<baslangic){
                System.out.println("Uyari! Bitis degeri baslangic degerinden kucuk olamaz");
            }else{
                for (int i = baslangic; i <=bitis ; i++) {
                    toplam +=i;

                }
                System.out.print(toplam+ " ");
            }

}
}



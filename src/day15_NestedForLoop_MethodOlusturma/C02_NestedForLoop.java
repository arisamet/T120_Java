package day15_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C02_NestedForLoop {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Olusturulacak seklin satir sayisini giriniz: ");
        int satir = scanner.nextInt();

        
        
        System.out.println("Olusturulacak seklin sutun sayisini giriniz: ");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) {

            for (int j = 0; j <=sutun ; j++) {


                System.out.print("*  ");
            }
            System.out.println("");
        }

     //   Kullanicidan 2 rakam alin
     //   ilk rakan satir
     //   ikinci rakam sutun olmak uzere asagidaki sekli cizdirin
     //       *  *  *  *  *
     //       *  *  *  *  *
     //       *  *  *  *  *
     //       *  *  *  *  *
     //    */
     //   Scanner scanner = new Scanner(System.in);
     //   System.out.println("olusturulacak seklin satir sayisini giriniz");
     //   int satir = scanner.nextInt();
     //   System.out.println("olusturulacak seklin sutun sayisini girin");
     //   int sutun = scanner.nextInt();
     //   for (int i = 1; i <=satir ; i++) { // satirlari kontrol eder
     //       for (int j = 1; j <=sutun ; j++) { // sutunlari kontrol ediyor
     //           System.out.print("*  ");
     //       }
     //       System.out.println("");
//


        }
}

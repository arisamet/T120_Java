package day15_NestedForLoop_MethodOlusturma;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz: ");
        int satir= scanner.nextInt();

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("*  ");


            }
            System.out.println("");

            for (int j = 5; j <=0 ; j++) {
                System.out.print(j+ "  ");
            }
            System.out.println("");
        }


    }
}

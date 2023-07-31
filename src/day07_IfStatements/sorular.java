package day07_IfStatements;

import java.util.Scanner;

public class sorular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");


        int yas = scanner.nextInt();
        int kalanyil= 65-yas;



        if (yas >= 65) {
            System.out.println("Emekli olabilirsin");
        }
        else
            System.out.println("Emekli olmak icin "+ kalanyil + " yil calismalisin ");
        }
    }


package practice_day04;

import java.util.Scanner;

public class P04_SwitchStatements {

    public static void main(String[] args) {

        //Kullanicidan dogdugu ayin numarasini girmesini isteyin
        // Hangi ay dogdugunu yazdiran kod dizesini yazdirin

        System.out.println(" Lutfen dogum tarihinizin ay hanesindeki sayiyi yaziniz");
        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        switch (month){
            case 1:
                System.out.println("Ocak ayinda dogmussunuz");
                break;
            case 2:
                System.out.println("Subat ayinda dogmussunuz");
                break;
            case 3:
                System.out.println(" Mart ayinda dogmussunuz");
                break;
            case 4:
                System.out.println("Nisan ayinda dogmussunuz");
                break;
            case 5:
                System.out.println(" Mayis ayinda dogmussunuz");
                break;
            case 6:
                System.out.println("Haziran ayinda dogmussunuz");
                break;
            case 7:
                System.out.println("Temmuz ayinda dogmussunuz");
                break;
            case 8:
                System.out.println("Agustos ayinda dogmussunuz");
                break;
            case 9:
                System.out.println("Eylul ayinda dogmussunuz");
                break;
            case 10:
                System.out.println("Ekim ayinda dogmussunuz");
                break;
            case 11:
                System.out.println("Kasim ayinda dogmussunuz");
                break;
                case 12:
                System.out.println("Aralik ayinda dogmussunuz");
                    break;
            default:
                System.out.println(month+ " olarak girdiginiz sayida bir ay numarasi yoktur");


        }
    }
}

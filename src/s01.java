import java.util.Scanner;

public class s01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen uc basamakli sayi giriniz: ");
        int sayi=103;

        while (sayi>=100 && sayi<1000){
            scanner= new Scanner(System.in);
            sayi= scanner.nextInt();
            if (sayi >=1000||sayi <100){
                System.out.println("Sayi 3 basamakli degildir");
            }else{
                if (sayi%11==0){
                    System.out.println("SAyi 11 ile tam bolunebilir");
                }else {
                    System.out.println("Sayi 11 ile bolunemez");
                }
            }

sayi++;
        }


    }
}

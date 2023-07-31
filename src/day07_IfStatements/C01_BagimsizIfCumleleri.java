package day07_IfStatements;

public class C01_BagimsizIfCumleleri {

    public static void main(String[] args) {

        int a = -201;
        int b = 14;
       // // Bagimsiz If cumleleri kodun kalani ile ilgilenmez.
       // Sadece boolean sarta odaklanir;
       // sartin sonucu True ise If bodysi () -> calisir
       //  bolean sartin sonucu false ise if body si devreye girmez.



        if (a>0){
            System.out.println("a sayisi pozitif");

        }

        if (a+b>100){
            System.out.println("sayilarin toplami 100'den buyuk");

            if (b % 3 == 0){
                System.out.println("b 3 ile tam bolunebilen bir tamsayidir");
            }
            if (b<100){
                System.out.println("b 100 den kucuk bir tamsayidir");
            }
        }

    }
}

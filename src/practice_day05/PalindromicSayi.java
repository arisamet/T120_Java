package practice_day05;

public class PalindromicSayi {
    public static void main(String[] args) {


        // Palindromic sayi : Her iki tarafindan da okundugunda ayni degeri ifade eden sayidir
        // Orn: 121 4004
        // 3 basamakli sayilarin carpimiyla olusan en buyuk palindromic sayiyi bulan kodu yaziniz


        int flag =1;
        int maxbas1 = 1;
        int maxbas2 = 1;
        int maxbas3= 1;

        for (int i = 1000; i > 100 ; i--) {
            for (int j = 1000; j >i ; j--) {
               if  (checkpalindromic(i*j)){
                   flag++;
                   if (maxbas3<i*j){
                       maxbas3= i*j;
                       maxbas1= i;
                       maxbas2=j;
                   }
               }

            }

        }
        System.out.println(flag);
        System.out.println("Maks. Pal. sayi= "+ maxbas1+" * "+maxbas2+"= "+ maxbas3);
    }

    public static boolean checkpalindromic(int i){

   boolean result= false;
   int sayi = i;
   int digit1= sayi%10;
   sayi/=10;
   int digit2= sayi%10;
   sayi/= 10;
   int digit3= sayi%10;
   sayi/=10;
   int digit4= sayi%10;
   sayi/=10;
   int digit5= sayi%10;
   sayi/=10;
   int digit6= sayi%10;
   sayi/=10;
   int digit7= sayi%10;
   sayi/=10;

   if (i<=1000000){
       if (digit1==digit6 && digit2==digit5 && digit3==digit4){
           result=true;
       }else {
       }

   }
            return result;
    }
}

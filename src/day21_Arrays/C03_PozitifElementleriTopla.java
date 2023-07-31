package day21_Arrays;

public class C03_PozitifElementleriTopla {

    public static void main(String[] args) {

        //Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz.

        int[] arr = {-4, 5, 2, 0, -3, 5};// Beklenen output : 3 pozitif elementlerin toplami 10


        System.out.println(pozitifElementleriTopla(arr));//10

    }

    public static int pozitifElementleriTopla(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                toplam += arr[i];
            }

        }

        return toplam;


        //     //Soru 2- Verilen bir array’deki
        //     //        pozitif tamsayilari toplayip sonucu bize donduren bir method yaziniz.
        //     int[] arr ={-4,5,2,0,-3, 5}; // beklenen output : pozitif elementlerin toplami 12
        //     System.out.println(pozitifElementleriTopla(arr));
        // }
        // public static int pozitifElementleriTopla(int[] arr){
        //     int toplam=0;
        //     for (int i = 0; i < arr.length ; i++) {
        //         if (arr[i] > 0){
        //             toplam += arr[i];
        //         }
        //     }
        //     return toplam;
    }

}

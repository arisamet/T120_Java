package day23_MultiDimensionalArrays;

public class C01_TumElmentleriToplama {
    public static void main(String[] args) {



        int[] arrTek = {3, 7, 1, 9};
        int toplam = 0;
        for (int i = 0; i < arrTek.length; i++) {

            // arrTek[i] index degistikce bize arraydeki tum elementleri sirasiyla getirir
            toplam += arrTek[i];
        }

        System.out.println("ArrTek'in elementleri toplami : " + toplam);

        int[][] sayilar = {{1,2,5},{7,4}, {9}, {3,0,1}};
        //arr[i] inner arrayleri getirir
        // arr[i][j] bize int elementleri verir
        // Yani kat sayisi kadar Index'e yani forloopa ihtiyacimiz var

       toplam = 0;

        for (int i = 0; i <sayilar.length ; i++) { // disardaki forloop auter arrayi kontrol eder

            for (int j = 0; j < sayilar [i].length ; j++) { // icerdeki forloop inner arrayleri kontrol eder

                // sayilar [i][j]  sirasiyla herbir int elementi getirir

                toplam += sayilar[i][j];
             }
        }

        System.out.println("Sayilar arrayinin elementleri toplami: " + toplam);

     }
}
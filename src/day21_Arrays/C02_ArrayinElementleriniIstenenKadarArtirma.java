package day21_Arrays;

import java.util.Arrays;

public class C02_ArrayinElementleriniIstenenKadarArtirma {

    public static int[] main(String[] args) {

        int[] arr = {3, 5, 2, 7, 5};
        int artis = 4;

        //  Verilen Array'in tüm elementlerini
        // artis miktari kadar artirin

        for (int i = 0; i < arr.length; i++) { // i array'deki index'leri gezer

            arr[i] += artis;

        }

        System.out.println( Arrays.toString(arr));

        return arr;
    }


    }


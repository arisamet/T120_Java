package day22_ArraysveMultidimensionelArrays;

import java.util.Arrays;

public class C05_varolanArrayeYeniDegerAtama {
    public static void main(String[] args) {

        // Var olan bir arraye length olarak belirlenenden
        // daha fazla element ATANAMAZ
        // ANCAK varolan bir array'i deger olarak ATAYABILIRIZ.


        int [] arr = {3,4,5,6,8,1};
        System.out.println(arr.length); //6

        // 7. elementi bu arraye atayabilir miyiz
      //   arr[6] = 13; // .ArrayIndexOutOfBoundsException

        arr = new int[8];
        System.out.println(Arrays.toString(arr));

        String [] harfler = { "a", "n","y"};
        String [] yeniHarfler= {"k","l","m","n"};

        harfler= yeniHarfler;

        System.out.println(Arrays.toString(harfler)); // [k, l, m, n]

        System.out.println(Arrays.toString(yeniHarfler));


        // Eger varolan bir arraye yeni deger atamasi icin
        // liste yazmak istiyorsak asagidaki gibi atama yapabiliriz

        harfler= new String[]{"x"};
        System.out.println(Arrays.toString(harfler)); // [x]
    }
}

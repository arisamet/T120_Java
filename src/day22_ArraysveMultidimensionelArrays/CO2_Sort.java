package day22_ArraysveMultidimensionelArrays;

import java.util.Arrays;

public class CO2_Sort {
    public static void main(String[] args) {
        String []harfler = { "L", "a", "P","d", "T","t"};
        System.out.println(Arrays.toString(harfler)); // [L, a, P, d, T, t]

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler)); //[L, P, T, a, d, t]

        // Arrays.sort () arraydeki elementleri
        // Natural ordera gore siralar

        // Arraylerde ve bundan sonra gorecegimiz Arraylistlerde
        // method kullanildiginda arrayList kalici olacak degisir


        String[] isimler= {"Ayse", "Yusuf", "Bugra", "Burak","Abdullah","Nergiz"," Neslihan", "Abdullah"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));
        int    [] sayilar = {4, 78, 4, 2, 98, 3, 7, 1};
        Arrays.sort(sayilar, 3,6);
        System.out.println(Arrays.toString(sayilar)); // [4, 78, 4, 2, 3, 98, 7, 1]
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));  //1, 2, 3, 4, 4, 7, 78, 98]
    }
}

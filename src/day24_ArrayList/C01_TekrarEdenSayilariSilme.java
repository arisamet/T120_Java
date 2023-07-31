package day24_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_TekrarEdenSayilariSilme {
    public static void main(String[] args) {

        // Verilen bir int arrayde tekrar eden elementleri silin
        // Arrayi unique degerlerden olusan haline donusturun

        int [] arr= {2,4,5,3,2,5,1,5,3,7};


        // Array'in en buyuk problemi uzunlugunun degismemesidir
        // Bunun icin Java, array altyapisini kullanan ama uzunlugu esnek olan
        // ArrayList class'ini olusturmustur


        List<Integer> tekrarsizList = new ArrayList<>();
        System.out.println(tekrarsizList); // []

        // Benzersiz elementlerden olusan bir list icin
        // for loop ile arraydeki tum elmentleri ele alip
        // ele aldigimiz element listede yoksa listeye ekleyebiliriz


        for (int i = 0; i < arr.length ; i++) {
           if( ! tekrarsizList.contains(arr[i]) ){
               tekrarsizList.add(arr[i]);

           }
        }
        System.out.println(tekrarsizList); // [2, 4, 5, 3, 1, 7]

       // Arrayi unique degerlerden olusan haline donusturun
        System.out.println(Arrays.toString(arr));

        arr = new int[tekrarsizList.size()];
        System.out.println(Arrays.toString(arr));  //[0, 0, 0, 0, 0, 0]

        // Bir loop ile listedeki elementleri arraye atayabiliriz

        for (int i = 0; i < arr.length; i++) {
            arr[i]= tekrarsizList.get(i);


        }
        System.out.println(Arrays.toString(arr)); // [2, 4, 5, 3, 1, 7]
    }
}

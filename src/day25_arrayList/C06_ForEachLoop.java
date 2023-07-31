package day25_arrayList;

public class C06_ForEachLoop {
    public static void main(String[] args) {


        //arrayin tum elementlerini toplayin
        //arrayin tum elementlerini yazdirin
        // array'in elementlerinden cift sayi olanlari yazdirin
        // array'in elementlerinden en buyuk olani bulun


        // NOT; array'in tum elemntlerini gozden gecirmemiz gereken sotularde
        // for loop kullaniriz'
        // for loop'un en onemli ozelligi index sayesinde
        // tum elementleri 0.index'den sonuncu indexe kadar sirali olarak getirmesidir
        // Ama bu sorularda elementi sirayla getirmenin  hic bir onemi yok
        // index'in yani sirali getirmenin onemli olmadigi durumlarda
        // for loop yerine for eachloop kullaniriz.

        // array'in tum elementlerini yazdirin

            int[] arr = {20, 30, 5, 45};
            // array'in tup elementlerini toplayin
            // array'in tum elementlerini yazdirin
            // array'in elementlerinden cift sayi olanlari yazdirin
            // array'in elementlerinden en buyuk olani bulun
        /*
            array'in tum elementlerini gozden gecirmemiz gereken sorularda
            for loop kullaniriz
            for loop'un en onemli ozelligi index sayesinde
            tum elementleri 0.index'den sonuncu index'e kadar sirali olarak getirmesidir
            ama bu sorularda elementi sirasiyla getirmesinin hic bir onemi yok
            indexin yani sirali getirmenin onemli olmadigi durumlarda
            for loop yerine for-each loop kullaniriz
         */
            // array'in tum elementlerini yazdirin
            for (int each : arr
            ) {
                System.out.print(each + " ");
            }
        }
    }


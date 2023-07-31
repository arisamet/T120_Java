package day_26_forEachLoop_Constructor;

public class C01_EnBuyukElementBulma {
    public static void main(String[] args) {

        //Arrayin elementlerinden en buyuk elementi bulun

        int [] arr = {3,6,9,1,3,7,12,34,23,87,32,43};

        int enBuyukElement= arr[0];

        for (int each: arr){ // Arraydeki her bir integeri bana getir demek

            if (each>enBuyukElement){
                enBuyukElement= each;
            }
        }
        System.out.println("Arraydaki en buyuk element: "+ enBuyukElement);
    }
}

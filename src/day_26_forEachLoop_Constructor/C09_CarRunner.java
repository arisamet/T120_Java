package day_26_forEachLoop_Constructor;

public class C09_CarRunner {
    public static void main(String[] args) {

        C08_Car car1 = new C08_Car();

        System.out.println(car1.marka);//   "Marka belirtilmemis"
        System.out.println(car1.model); //  "Model belirtilmemis"

        System.out.println(car1);
        car1.marka= "Toyota";
        car1.model= "Corolla";
        car1.yil= 2011;
        car1.fiyat= 7000;
        car1.renk= "Kirmizi";
        System.out.println(car1);
//Araba bilgileri===>{marka:'Toyota', model:'Corolla', yil:2011, fiyat:7000, renk:'Kirmizi'}

        C08_Car car2= new C08_Car();
        System.out.println(car2);

        car2.marka= "Honda";
        car2.renk= "mavi";
        car2.fiyat= 8000;
        System.out.println(car2);

        //Araba bilgileri===>{marka:'Honda', model:'Model Belirtilmemis', yil:1900, fiyat:8000, renk:'mavi'}

        C08_Car car3;

    }

}

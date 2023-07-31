package day17_methodOlusturma_MethodOverlooding;

public class C04_MethodOverlooding {

    //  Biz bir method call yaptigimizda Java oncelikle method ismini kontrol eder
    // Sonra argument olarak verilen degerler ile parametre olarak yazilan variablelarin data turlerini karsilastirir.
    // uyumlu ise methodu calistirir
    //argumentler ile parametreler uyumlu degilse CTE verir.

    // Javada ayni data turune ve parametre sayisina sahip
    // birden fazla method olusturamazsiniz;
    // Farkli data turlerinde parametreler varsa dizilis degistirildiginde
    // java farkli bir method olarak kabul eder


    public static void main(String[] args) {

        toplama(4, 6); // IKI int toplami : 10
        toplama(5.3, 6);//double ve int toplami 11.3
        toplama(4.3, 2.4);//double ile double in toplami: 6.699999999999999
        toplama(5, 2.4);//int ile double'in toplami : 7.4
        toplama(5, 3.4f);//int ile double'in toplami : 8.400000095367432

        toplama(2.3f, 5f); //double ile double in toplami: 7.299999952316284
    }

    public static void toplama(int sayi1, int sayi2) {

        System.out.println("Iki int'in toplami : " + (sayi1 + sayi2));
    }

    public static void toplama(int a, double b) {
        System.out.println("int ile double'in toplami : " + (a + b));

    }

    public static void toplama(double b, int a) {
        System.out.println("double ve int toplami " + (a + b));

    }

    public static void toplama(double sayi1, double sayi2) {
        System.out.println("double ile double in toplami: " + (sayi1 + sayi2));

    }

    //method ismi + parametrelerin data turlerine method signature denir.
    //Java ayni classte signature'i ayni olan 2 method'a izin vermez.

    //Bir classda ismi ayni fakat signature'i farkli birden fazla method olusturulabilir
    //Birden fazla method olusturulmasina METHOD OVERLOODING denir.
    // Bu bize ayni isimle birden fazla islem yapabilme yetisi kazandirir.





}




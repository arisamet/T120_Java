package day15_NestedForLoop_MethodOlusturma;

public class C06_KendiSubstringimiz {
    public static void main(String[] args) {

        String str = "Java Candir";
        int baslangic = 3;
        int bitis = 7;

        if (baslangic>bitis){
            System.out.println("Baslangic degeri bitis degerinden buyuk olamaz");
        } else if (baslangic<0 || bitis<0|| baslangic>=str.length()|| bitis>=str.length()) {
            System.out.println("Indexler hatali");
        }else {
            for (int i = baslangic; i < bitis ; i++) {
                System.out.print(str.charAt(i));

            }
        }

        System.out.println("");
        System.out.println(str.substring(baslangic, bitis));


        str.substring(4 );
    }
}

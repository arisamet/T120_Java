package day04_dataCasting_wrapperClass;

public class C05_WrapperClasses {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.charAt(3));

        int sayi2= 5;

        Integer sayi3= sayi2;
        int sayi4= sayi3;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Short sayi5= (short)sayi3;
        System.out.println(Short.MIN_VALUE);

        String str1= "22";
        String str2 = "33";

        System.out.println(str1+str2);

        System.out.println(Integer.parseInt(str1)+ Integer.parseInt(str2));

        char ch1= 'a';
        System.out.println(Character.isDigit(ch1));
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isWhitespace(ch1));


    }
}

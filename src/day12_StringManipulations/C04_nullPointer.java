package day12_StringManipulations;

public class C04_nullPointer {

    public static void main(String[] args) {

        String str1;


       // System.out.println(str1);
       // str1.concat("candir");

        str1 = "Java";
        System.out.println(str1);

        System.out.println(str1.concat(" candir"));

       String str2 = null;
       // null bir deger degil pointerdir yani isaretleyicidir.
       // str2nin degeri null veua str2ye null deger atanmis ifadeleri yanlistir.
       // str2 null olarak isaretlenmistir. Deger atamamistik.

        System.out.println(str2);
        System.out.println(str2+ " candir"); // null candir

        //System.out.println(str2.concat("candir"));

        str2= "tava";
        System.out.println(str2);
        System.out.println(str2.concat(" candir"));

        String str3= null;
        String str4 = "";
        System.out.println(str4.isBlank());
        System.out.println(str4.isEmpty());



        //System.out.println(str3.isBlank());

        // System.out.println(str3.isEmpty());
    }
}

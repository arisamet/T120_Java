package day05_matematikselIslemler_increment;

public class C04_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 20;
        int b= 10;

        System.out.println  (  b= 2*a );

        System.out.println(a = b-5);


        a = 10;

        b= a++;


        System.out.println("a: "+ a+ "b: "+ b);

        a=10;
        b=++a;

        System.out.println("a: "+ a+ "b: "+ b);

        a= 20;
        System.out.println(a++);
        System.out.println(a);

        a= 20;


        System.out.println(a--);
        System.out.println(a);




    }
}

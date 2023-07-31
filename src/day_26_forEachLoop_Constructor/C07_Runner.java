package day_26_forEachLoop_Constructor;

public class C07_Runner {
    public static void main(String[] args) {

        C04 obj;// niyet gibi birsey
                // Deklerasyon vardir ama ete kemige burunmus bir obje yoktur

        new  C04();
        // Objeyi olusturduk ama sonraki satirlarda kullanamayiz
        // Cunku bir objeye atamadik

        System.out.println(new C04().sayi);//10


        C04 obj2= new C04();// Bu obje olusturmadir.
    }
}

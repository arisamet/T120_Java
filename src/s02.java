import java.util.Arrays;

public class s02 {
    public static void main(String[] args) {
        int [] arr= { 13,20, 50,43};

        System.out.println(Arrays.toString(arr));
        arr= elemanlariBirKaydirma(arr);
        System.out.println(Arrays.toString(arr)); //[43, 13, 20, 50]
    }

    public static int[] elemanlariBirKaydirma(int[] arr){
        int gecici= arr[arr.length-1];
        for (int i = arr.length-2; i >=0 ; i--) {
            arr[i+1]= arr[i];

        }
        arr[0]=gecici;
        return arr;
    }
}

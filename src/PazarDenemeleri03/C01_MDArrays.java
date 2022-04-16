package PazarDenemeleri03;

import java.util.Arrays;

public class C01_MDArrays {
    public static void main(String[] args) {
        int arr[][]={{3,1,7},{6,10,2}};
        System.out.println(arr[0][2]);
        System.out.println(arr[1][1]);
        System.out.println(arr[0]);//arr[0] bir array oldugu icin direk yazdırılamaz. Referans dondurur.
        System.out.println(Arrays.toString(arr[0]));//[3, 1, 7]
        System.out.println(Arrays.toString(arr));//Dıs Array icinde 2 array oldugu icin referans dondurur.
        //MDArray'de tum elementleri bir array olarak yazdırmak istersek
        System.out.println(Arrays.deepToString(arr));

    }
}

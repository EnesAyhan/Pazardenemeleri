package Arrays01;

import java.util.Arrays;

public class C02 {
    public static void main(String[] args) {

        //verilen 3 elemalanlı bir array'in tum elemanlarini bir sola tasıyacak bir kod create ediiniz

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        int arrnew[]=new int[5];

        for (int i = 0; i < arr.length-1 ; i++) {
            if (i==0){
                arrnew[arrnew.length-1]=arr[i];
                arrnew[i]=arr[i+1];
            }else arrnew[i]=arr[i+1];

        }
        System.out.println(Arrays.toString(arrnew));
        System.out.println(Arrays.toString(arr));

    }
}

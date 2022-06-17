package Arrays01;

import java.util.Arrays;

public class C01_BaseDenemeler {
    public static void main(String[] args) {

        Integer arr1[] = new Integer[5];
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));//[null, null, null, null, null] >>Integer defaul degeri null'dır


        int arr2[] = new int[5];
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0, 0]  >> int default degeri 0'dır
        arr2[0] = 1;
        arr2[1] = 2;
        System.out.println(Arrays.toString(arr2));

        int arr3[] = {1, 2, 3};
        System.out.println(Arrays.toString(arr3));

        String arr4[] = {"Ali", "Veli", "Hacı"};
        System.out.println(Arrays.toString(arr4));

        System.out.println(arr4[2]);
        arr4[0] = "Can";
        System.out.println(arr4[0]);//0. index artık Can oldu

        System.out.println(arr4.length);// arr4 uzunlugu >> 3

        




    }
}

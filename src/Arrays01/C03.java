package Arrays01;


import java.lang.reflect.Array;
import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {
        String arr = "Coding is greate.";
        String harfler[]=arr.split("");
        System.out.println(Arrays.toString(harfler));
        terstenYazdirma(harfler);


    }

    public static void terstenYazdirma(String[] harfler) {

        String[] tersArr = new String[harfler.length];
        for (int i = 0; i < harfler.length ; i++) {
            tersArr[i] = harfler[harfler.length-1  - i];

        }
        System.out.println(Arrays.toString(tersArr));


    }
}




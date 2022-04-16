package MethodCreation;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
         /*
           TASK  :
           Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method create ediniz.
           Test Data:
           input: "aabbcccccddddaaa"
           output: abcd
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= scan.nextLine();

        birKereYazdiranMethod(cumle);

    }

    private static void birKereYazdiranMethod(String cumle) {
        String sonuc="";
        for (int i = 0; i <cumle.length() ; i++) {
            if (!sonuc.contains(cumle.substring(i, i + 1))){
                sonuc+=cumle.substring(i, i + 1);
            }

        }
        System.out.println(sonuc);


    }
}

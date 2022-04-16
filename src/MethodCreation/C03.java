package MethodCreation;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.

         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir kelime giriniz");
        String kelime= scan.next().toLowerCase();
        kontrol(kelime);
        System.out.println(kontrol(kelime));

    }

    private static boolean kontrol(String kelime) {
        boolean kelimeSonucu = false;
        if (kelime.contains("xyz")) {
            kelimeSonucu = true;
        }
        return kelimeSonucu;
    }
}

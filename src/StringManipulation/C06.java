package StringManipulation;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {
        /* TASK :
         * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
         * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
         *
         * ornek
         * input = Ali
         * output = lilili
         *
         * input = el
         * output = el
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String isim= scan.next();
        if (isim.length()>=3){
            System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));
        }else System.out.println(isim);
    }
}

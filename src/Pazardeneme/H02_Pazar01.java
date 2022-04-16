package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar01 {
    public static void main(String[] args) {
        //Nested if kullanarak soruyu cozen kodu yazınız.
        //kullanıcıdan bir sifre girmesini isteyin
        //Eger ilk harf buyuk harf ise "A" olup olmadıgını konrol edin.
        //ilk harf A ise gecerli sifre değilse Gecersiz Sifre yazdirin
        //Eger ilk harf kucuk harf ise "z" olup olamadigini kontrol edin.
        //ilk harf z ise gecerli sifre değilse gecersiz sifre yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Sifrenizi giriniz");
        char sifre= scan.next().charAt(0);

        if (sifre>='A'&&'Z'>=sifre)
        {if (sifre=='A'){
            System.out.println("Gecerli Sifre");
        }else {
            System.out.println("gecersiz sifre");}
        }

        else if(sifre>='a'&&'z'>=sifre)

        {if (sifre=='z'){
                System.out.println("Gecerli Sirfe");
            }else {
                System.out.println("gecersiz sifre");
            }
        }






    }
}

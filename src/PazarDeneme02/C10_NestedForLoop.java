package PazarDeneme02;

import java.util.Scanner;

public class C10_NestedForLoop {
    public static void main(String[] args) {
        //Kullanicidan bir rakam alin v
        // bu rakam icin carpim tablosunu ekrana yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir rakam giriniz");
        int sayi= scan.nextInt();


        for (int i = 1; i <=10 ; i++) {
            System.out.print("("+sayi+""+"*"+""+i+")="+(sayi*i)+" ");

        }


    }
}

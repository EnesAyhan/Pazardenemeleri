package PazarDeneme02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C03_forLoop {
    public static void main(String[] args) {
        //Kullsnicidan 100'den kucuk bir sayi isteyin.
        // 1'den baslayarak girilen sayiya kadar 3'un kati olan sayılari yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("100'den kucuk bir tamsayi giriniz");
        int sayi1=scan.nextInt();
        for (int i = 0; i < sayi1; i++) {
            if (i%3==0){
                System.out.print(i+",");
            }


        }

    }
}

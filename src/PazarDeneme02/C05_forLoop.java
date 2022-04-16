package PazarDeneme02;

import java.util.Scanner;

public class C05_forLoop {
    public static void main(String[] args) {
        //kullanicidan 100'den kucuk bir tamsayi isteyin
        //1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 100'den kucuk bir tamsayi giriniz");
        int sayi1= scan.nextInt();

        for (int i = 0; i <=sayi1 ; i++) {
            if (i%3==0||i%5==0)
            {
                System.out.print(i+",");
            }

        }



    }
}

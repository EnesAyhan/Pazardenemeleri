package PazarDeneme02;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan bir sayi alin ve
        // bu sayiyi tam bolen sayilari ve toplam kac tane olduklarini ekranda yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int bolen=1;
        int sayac=0;
        while (sayi>=bolen){
            if (sayi%bolen==0){
                System.out.print(bolen+" ");
                sayac++;
            }
            bolen++;

        }
        System.out.println("");
        System.out.println(sayi+" sayisini bolen "+sayac+" sayi vardir");








    }
}

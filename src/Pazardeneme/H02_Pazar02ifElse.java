package Pazardeneme;

import java.util.Scanner;

public class H02_Pazar02ifElse {
    public static void main(String[] args) {
        //Kullanicidan 4 basamakli bir sayi girmesini isteyiniz.
        //Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin
        //son rakami 0 ise ekrana "5'e bolunen cift sayi
        //sonra 0 değil ise "5'e bolunen tek sayi" yazidirin
        //girdigi password 5'e bolunmuyorsa ekrana "Tekrar Deneyin" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 4 basamakli bir sayi giriniz");
        int sayi=scan.nextInt();

        if (sayi%5==0){
            if (sayi%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }
        else{
            System.out.println("Tekrar Deneyin");
        }





    }
}

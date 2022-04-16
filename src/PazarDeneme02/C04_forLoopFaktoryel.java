package PazarDeneme02;

import java.util.Scanner;

public class C04_forLoopFaktoryel {
    public static void main(String[] args) {
        // Soru 11 ) Interview Question Kullanicidan 10’dan kucuk bir  tamsayi isteyin
        // ve girilen sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 10'dan kucuk bir tamsayi giriniz");
        int num1= scan.nextInt();
        int faktoryel=1;
        String faktoryelacikyazim="";
        for (int i = num1; i >=1 ; i--) {
            faktoryel *= i;
            if (i == num1) {
                faktoryelacikyazim = faktoryelacikyazim + i;
            }else
                faktoryelacikyazim=faktoryelacikyazim+"*"+i;;


        }
        System.out.println(num1 + "! =" + faktoryelacikyazim+"="+ faktoryel);



    }
}



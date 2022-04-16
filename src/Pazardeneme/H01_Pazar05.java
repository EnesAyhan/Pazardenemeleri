package Pazardeneme;

import java.util.Scanner;

public class H01_Pazar05 {
    public static void main(String[] args) {

        //Soru= kullanıcıdan dikdöertgen kenar uzunluklarını isteyin ve dikdörtgenin kare olup olmadıgını yazdırım

        Scanner scan=new Scanner(System.in);
        System.out.println("dikdörtgenin  kenar uzunluklarını girin");
        int a= scan.nextInt();

        int b= scan.nextInt();
        if (a==b){
            System.out.println("şekil : karedir" );
        } else {
            System.out.println("şekil: Dİkdörtgendir");
        }





    }
}

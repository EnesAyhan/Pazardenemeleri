package PazarDeneme02;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("lutfen bir harf daha giriniz");
        char sonharf=scan.next().toUpperCase().charAt(0);
         while (ilkHarf<=sonharf){
             System.out.print(ilkHarf+",");
             ilkHarf++;
         }






    }
}

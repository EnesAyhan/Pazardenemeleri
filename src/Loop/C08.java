package Loop;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {
  /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim = scan.next();
        String tersten = "";
        for (int i = isim.length()-1; i >=0; i--) {
            tersten += isim.charAt(i);
        }
        if (isim.equalsIgnoreCase(tersten)) {
            System.out.println("girdiginiz isim palindromdur");
        } else System.out.println("girdiginiz isim palindrom degildir");

    }


}


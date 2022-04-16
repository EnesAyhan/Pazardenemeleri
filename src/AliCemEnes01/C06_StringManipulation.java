package AliCemEnes01;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {
         /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        System.out.println("lutfen bir e-mail adresi giriniz");
        Scanner scan=new Scanner(System.in);
        String mail= scan.next();
        if (mail.contains("@hotmail.com")){
            mail.replace("@hotmail.com","@gmail.com");
            System.out.println(mail.replace("@hotmail.com","@gmail.com"));
        }


    }
}

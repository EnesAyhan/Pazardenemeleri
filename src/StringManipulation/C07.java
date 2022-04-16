package StringManipulation;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {
        /*  TASK :
				StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
	    */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String isim= scan.next();
        if (isim.length()%2==0){
            System.out.println(isim.substring(0,isim.length()/2));
        }else System.out.println(isim);
    }
}

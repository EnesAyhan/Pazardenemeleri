package AliCemEnes01;

import javax.swing.*;

public class C07_StringManipulation {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
        String isim="Ali";
        String soyisim="Kan";
        String kartNo="1234567891234567";
        if (kartNo.length()==16){
            System.out.println("İsim: "+isim.substring(0,1)+isim.substring(1).replaceAll("\\w","*")+"\n"+
                    "Soyisim: "+soyisim.substring(0,1)+isim.substring(1).replaceAll("\\w","*")+
                    "\n"+"Kart No: "+"***********"+kartNo.substring(12)
            );

        }else System.out.println( "Geçersiz kredi kartı numarası");
    }
}

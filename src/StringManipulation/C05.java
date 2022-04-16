package StringManipulation;

public class C05 {
    public static void main(String[] args) {
        /*TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
                String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.*/

        String  str1= "%13.99";
        String str2= "%10.55";

        Double str1Sayi=Double.parseDouble(str1.replaceAll("\\D",""));
        Double str2Sayi=Double.parseDouble(str2.replaceAll("\\D",""));


        System.out.println("Girdigini sayilarin toplami :%"+(str1Sayi+str2Sayi)/100);


    }
}

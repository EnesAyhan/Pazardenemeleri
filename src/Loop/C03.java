package Loop;

public class C03 {
    public static void main(String[] args) {
 /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */

        String input = "java calismalari gayet guzel ilerliyor";
        int sayac = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.toLowerCase().charAt(i) == 'c') {
                break;
            } else if (input.toLowerCase().charAt(i) == 'a') {
                sayac++;


            }
        }
        System.out.println(sayac);
    }
}

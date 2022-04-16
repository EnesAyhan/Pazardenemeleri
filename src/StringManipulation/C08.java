package StringManipulation;

public class C08 {
    public static void main(String[] args) {
/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char a=pickName.charAt(pickName.indexOf("A"));
        char l=pickName.charAt(pickName.indexOf("L"));
        char i=pickName.charAt(pickName.indexOf("I"));
        System.out.println(""+a+l+i);
    }
}

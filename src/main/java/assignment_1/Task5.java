package assignment_1;

public class Task5 {
    //Encrypt word when A=E
    public static String EncryptWord(String inp){
        String ans = "";
        for(int i = 0; i<inp.length(); i++){
            char chr = inp.charAt(i);
            int charAscii = (int) chr + 5;
            chr = (char) charAscii;
            ans = ans + chr;
        }
        return ans;
    }
    public static void main(String[] args){
        String inp = "Apple";
        String encryptedWord = EncryptWord(inp);
        System.out.println(encryptedWord);


    }
}

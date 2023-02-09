package assignment_1;


public class Task4 {
    //Count Vowels and consonants from a word
    public static void printVowelConsonantCount(String inp){
        inp = inp.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;

        for(int i =0; i<inp.length(); i++){
            if(inp.charAt(i) == 'a' || inp.charAt(i) == 'e' || inp.charAt(i) == 'i' || inp.charAt(i) == 'o' || inp.charAt(i) == 'u')
                vowelCount +=1;
            else
                consonantCount += 1;
        }

        System.out.println("Vowel = "+vowelCount);
        System.out.println("Consonant = "+consonantCount);
    }

    public static void main(String[] args){
        String inp = "Dhaka";
        printVowelConsonantCount(inp);
    }
}

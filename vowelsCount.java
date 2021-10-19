import java.util.Scanner;

public class vowelsCount {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
    Scanner userinput = new Scanner(System.in);
    String word;
    System.out.println("Enter a word: ");
    word = userinput.nextLine();
    System.out.println("There are " + countVowels(word) + " total vowel(s)" + " and " + uniqueVowel(word) +" unique vowel(s)");
    userinput.close();
    }
    
    /** 
     * @param ch
     * @return boolean
     */
    public static boolean isVowel(char ch) {

        if (ch == 'a' || ch == 'A' || ch == 'e' || ch =='E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            return true;  
        }

        else {
            return false;
        }
    }

    
    /** 
     * @param s
     * @return int
     */
    public static int uniqueVowel(String s) {
        int Amark = 0;
        int Emark = 0;
        int Imark = 0;
        int Omark = 0;
        int Umark = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                Amark = 1;
            }
            else if (s.charAt(i) == 'e' ||s.charAt(i) == 'E') {
                Emark = 1;
            }
            else if (s.charAt(i) == 'i' || s.charAt(i) == 'I') {
                Imark = 1;
            }
            else if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {
                Omark = 1;
            }
            else if (s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                Umark = 1;
            }
            
        }
        return Amark + Emark + Imark + Omark + Umark;
    }

    
    /** 
     * @param s
     * @return int
     */
    public static int countVowels(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count++;
            }
        }

        return count; 
    }
}

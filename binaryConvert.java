import java.util.Scanner;
import java.util.ArrayList;
public class binaryConvert {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        ArrayList<Integer> arrli = new ArrayList<Integer>();
        

        System.out.print("Enter a number: ");
        int number = num.nextInt();
        System.out.println(convert(number,arrli));
        num.close();



    }


    
    /** 
     * @param n
     * @param arrli
     * @return String
     */
    public static String convert(int n, ArrayList<Integer> arrli) {
        int input = n;
        if (n < 0) {
            return "Enter a postive number";
        }

        else if (n == 0) {
            return "0 is 0 in binary";
        }
        while (n != 0) {
            int r = n % 2;
            int dividend = n / 2; 
            arrli.add(r);
            n = dividend;
        }

        for (int i = arrli.size() - 1; i >= 0; i --) {
            System.out.print(arrli.get(i));
        }


        return " is the binary equivalent of " + input;
    }

}

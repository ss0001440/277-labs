import java.util.Arrays;
import java.util.Random;
public class randomArray {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int NUMBER = 20;
        int [] values;
        values =  generateRandom(NUMBER);
    
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);
        System.out.println("Sorted Array ");
        System.out.println(Arrays.toString(values));
    }

    
    /** 
     * @param n
     * @return int[]
     */
    public static int[] generateRandom(int n) {
        int[] list = new int[n];
        Random rand = new Random();
        for (int i = 0; i < list.length; i++) {
            list [i] = rand.nextInt(100);

        }
        return list;
    }

}

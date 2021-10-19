import java.util.Arrays;
public class reverseArray {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        int [] a = {2,3,4,1,6,7};
        int [] b = reverse(a);
        System.out.println(Arrays.toString(b));

    }

/** 
 * @param a
 * @return int[]
 */
public static int[] reverse(int[] a){
    
    int[] r = Arrays.copyOf(a,a.length);
    for (int i = a.length - 1, j = 0; i >= 0; i--,j++) {
    r[j] = a[i]; 
}
    return r;
}
}
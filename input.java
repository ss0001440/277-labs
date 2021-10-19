import java.util.ArrayList;
public class merge {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<Integer> B = new ArrayList<Integer>(); 
    
    int MAX = 10;
    
    for (int i = 0; i < 7; i++) {
        A.add((int) (Math.random() * MAX));
        if (i % 2 == 0) {
            B.add((int) (Math.random() * MAX));
        }
    }
    ArrayList<Integer> C = new ArrayList<Integer>();
    C = mergeArray(A, B);
    System.out.println(A.toString() + B.toString());
    System.out.println(C.toString());

}


/** 
 * @param a
 * @param b
 * @return ArrayList<Integer>
 */
static ArrayList<Integer> mergeArray(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> C = new ArrayList<Integer>(); 
        int i = 0;
        int j = 0;  
        while (i < a.size() && j < b.size()) {
            C.add(a.get(i));
            C.add(b.get(j));
            i++;
            j++; 
        }
        return C;
    }
}
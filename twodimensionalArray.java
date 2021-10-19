public class twodimensionalArray {
    
    /** 
     * @param args[]
     */
    public static void main(String args[]) {
        int [][] a = {{4,5,6}};
        int [][] b = {{1,2,3}, {4,6}}; 
        int [][] c = {{1,2,3}, {4,6}}; 
        if (compareArray(a,b)) {
            System.out.print("The two dimenional arrays are equal");
        }
        else {
            System.out.print("The two dimensional arrays are not equal");
        }

    }
    
    /** 
     * @param a[][]
     * @param b[][]
     * @return boolean
     */
    public static boolean compareArray(int a[][], int b[][]) {
        if (a.length != b.length) {
            return false;
        }
        for(int i = 0; i< a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        
        
        return true;
    }

    }


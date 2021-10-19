import java.util.Scanner;

public class midterm {
    public static void main(String[] args) {
        int F = 1;
        int C = 0; 
        
        if( F < 32 || F> 212) {
            C = (F-32) * 5/9; 
    }




    }
    public static int mean(int[] arr){
        int avg = 0;
        for(int i =0; i <arr.length; i++) {
        avg = arr[i] + avg;
        }
        avg = avg / arr.length;
        return avg; 
    }
}

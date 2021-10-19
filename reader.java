import java.io.*;
import java.util.Scanner;
public class reader {
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String output = in.nextLine();
        in.close();
        try {
            FileReader fr = new FileReader(input);
            Scanner inFile = new Scanner(fr);
            PrintWriter outFile = new PrintWriter(output);        
            int count = 1; 
            while(inFile.hasNext()) {
                outFile.write("/* " + count + " */ " + inFile.nextLine() + "\n");
                count++;
            }
            inFile.close();
            outFile.close();

        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

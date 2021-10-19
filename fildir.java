import java.io.File; 
import java.util.ArrayList;

public class fildir {
    public static void main(String[] args) {
        File [] paths;
        File [] files;
        File [] folders;
        File file;
        ArrayList<File> drives = new ArrayList<File>(); 
        ArrayList<File[]> subtest = new ArrayList<File[]>(); 



        paths = File.listRoots(); 
        System.out.println(paths[0].toString());
        }


    }
    

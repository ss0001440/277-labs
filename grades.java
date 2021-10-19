
/**
 * 
 */
public class grades {
    double numericValue; 
    String grade;
    public grades(String g){
        grade = g; 

    } 
    
    /** 
     * 
     * @return double
     */
    double getNumericValue(){
        if (grade.equals("A+")){
            numericValue = 4.3; 
        }
        else if (grade.equals("A")) {
            numericValue = 4.00;
        }
        else if (grade.equals("A-")) {
            numericValue = 3.7;
        }
        else if (grade.equals("B+")) {
            numericValue = 3.3;
        }
        else if (grade.equals("B")) {
            numericValue = 3.0;
        }
        else if (grade.equals("B-")) {
            numericValue = 2.7;
        }
        else if (grade.equals("C+")) {
            numericValue = 2.3;
        }
        else if (grade.equals("C")) {
            numericValue = 2.0;
        }
        else if (grade.equals("C-")) {
            numericValue = 1.7;
        }
        else if (grade.equals("D+")) {
            numericValue = 1.3;
        }
        else if (grade.equals("D")) {
            numericValue = 1.0;
        }
        else if (grade.equals("D-")) {
            numericValue = 0.7;
        }
        else if (grade.equals("F")) {
            numericValue = 0.0;
        }

        return numericValue; 
    }
}
    


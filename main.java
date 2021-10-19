
public class main {
    public static void main(String[] args) {
        Student stu1 = new Student("Sopheak Chim", 12, "025528189");
        Class class1 = new Class("Ecnomics", 4.0);
        Class class2 = new Class("Calculus", 4.3); 
        Class class3 = new Class("Biologyv", 4.3);
        Class class4 = new Class("Literature", 3.0);
        Class[] arrayClasses = {class1,class2,class3,class4};
        StudentReportCard student1 = new StudentReportCard(stu1, arrayClasses);
        System.out.println(student1.toString());


        
    }
}

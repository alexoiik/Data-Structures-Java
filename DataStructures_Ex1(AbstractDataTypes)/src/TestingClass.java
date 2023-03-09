/**
 * this is the main class. So lunch the project.
 * @alexoiik
 * Alexandros Oikonomou
 * Αλέξανδρος Οικονόμου
 */

public class TestingClass 
{
    public static void main(String[] args) 
    {
        //Αντικείμενα τύπου Student για τους Φοιτητές
        Student S1=new Student(2019001,"Giorgos",0,7);
        Student S2=new Student(2019002,"Nikos",1,8);
        Student S3=new Student(2019003,"Giannhs",1,6);
        Student S4=new Student(2019004,"Iasonas",1,5);
        Student S5=new Student(2019005,"Thodoris",0,7);
        Student S6=new Student(2019006,"Alexandros",0,9);
        Student S7=new Student(2019007,"Giannhs",1,6);
        Student S8=new Student(2019008,"Konstantinos",0,8);
        Student S9=new Student(2019009,"Stelios",0,9);
        //Εμφάνιση των στοιχείων κάθε Φοιτητή
        System.out.println("Στοιχεία Φοιτητή 1:");
        System.out.println(S1);
        System.out.println("\nΣτοιχεία Φοιτητή 2:");
        System.out.println(S2);
        System.out.println("\nΣτοιχεία Φοιτητή 3:");
        System.out.println(S3);
        System.out.println("\nΣτοιχεία Φοιτητή 4:");  
        System.out.println(S4);
        System.out.println("\nΣτοιχεία Φοιτητή 5:");      
        System.out.println(S5);
        System.out.println("\nΣτοιχεία Φοιτητή 6:");
        System.out.println(S6);
        System.out.println("\nΣτοιχεία Φοιτητή 7:");
        System.out.println(S7);
        System.out.println("\nΣτοιχεία Φοιτητή 8:");       
        System.out.println(S8);
        System.out.println("\nΣτοιχεία Φοιτητή 9:");      
        System.out.println(S9);       
        
        //Αντικείμενα τύπου Lab για τα Εργαστήρια
        Lab T1=new Lab("Domes1",4);
        Lab T2=new Lab("Domes2");
        Lab T3=new Lab("Domes3");
        
        //Εισαγωγή Φοιτητών στα Εργαστήρια Τ1,Τ2,Τ3
        T1.insert(S1); 
        T1.insert(S2);
        T1.insert(S3);
        T2.insert(S4);
        T2.insert(S5);
        T2.insert(S6);
        T3.insert(S7);
        T3.insert(S8);
        T3.insert(S9);
        
        System.out.println("\n");
        System.out.println("Αναζήτηση Στοιχείων του Φοιτητή με ΑΜ:2019006:");
        System.out.println(T2.search(2019006));
        System.out.println("\nΑναζήτηση Στοιχείων του Φοιτητή με ΑΜ:2019009:");
        System.out.println(T3.search(2019009));
        
        System.out.println("\n");    
        //Διαγραφή Φοιτητή S1,S5
        T1.delete(S1); 
        T2.delete(S5);
        System.out.println("Παρουσιολόγιο του τμήματος T3:");
        T3.presentation();
        System.out.println("\nΠόσοι Πέτυχαν-Απέτυχαν + o Μέσος όρος του τμήματος T3:");
        System.out.println("Πέτυχαν ---> "+T3.succeded());  
        System.out.println("Απέτυχαν ---> "+T3.failed());
        System.out.println("Μέσος Όρος ---> "+T3.averageGrade());
        
        System.out.println("\n");
        //Αντικείμενα τύπου LaboratoryCourse για Εργαστηριακό Μάθημα
        LaboratoryCourse Co=new LaboratoryCourse("DataStructures");
        
        //Εισαγωγή Εργαστηριακών τμημάτων στο εργαστηριακό μάθημα
        Co.insert(T1);
        Co.insert(T2);
        Co.insert(T3);
        
        //Εκτύπωση όλων των μεθόδων της LaboratoryInterface
        Co.printNumberOfStudents();
        System.out.println("\n");
        Co.printAverageCourseGrades();
        System.out.println("\n");
        Co.printSuccesStatus();
        System.out.println("\n");
        Co.printSuccesStatistics();  
    }  
}

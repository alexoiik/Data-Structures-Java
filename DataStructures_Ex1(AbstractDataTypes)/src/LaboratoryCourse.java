/*
∆ηµιουργήστε την LaboratoryCourse class η οποία και περιγράφει ένα εργαστηριακό µάθηµα. 
Η κλάση αυτή περιέχει όλα τα εργαστηριακά τµήµατα που πραγµατοποιούνται πχ Τ1,Τ2,Τ3,.. 
τα οποία φυσικά είναι αντικείµενα της Lab class και περιέχουν τους φοιτητές που είναι 
εγγεγραµµένοι στο αντίστοιχο εργαστήριο.
Η LaboratoryCourse class πρέπει:
• να εκτυπώνει το συνολικό πλήθος των φοιτητών που παρακολουθούν το εργαστηριακό
µάθηµα
• να εκτυπώνει το πλήθος τον φοιτητών που πέτυχαν-απέτυχαν στο µάθηµα ανά
εργαστήριο και συνολικά για το εργαστηριακό µαθηµα
• να εκτυπώνει το µέσο όρο του βαθµού των φοιτητών ανά εργαστήριο και το συνολικό
µέσο όρο για το µάθηµα
• να εκτυπώνει τα ποσοστά επιτυχίας και αποτυχίας ανά εργαστήριο και συνολικά για το
µάθηµα
Υ̟όδειξη: Η LaboratoryCourse class θα ̟εριέχει ένα ̟ίνακα στον ο̟οίο και θα α̟οθηκεύονται
αντικείµενα της Lab class
*/
public class LaboratoryCourse implements LaboratoryCourseInterface 
{
    private String CourseName;
    private int capacity;
    private int size=0;
    private Lab[] CourseArray;
    
    //Constructors
    public LaboratoryCourse(String Name)
    {
        this(Name,5);
    }
    public LaboratoryCourse(String CourseName,int capacity)
    {
        this.CourseName=CourseName;
        this.capacity=capacity;
        CourseArray=new Lab[capacity];
    }
    
    public boolean insert(Lab L)
    {
        if(size>=capacity)
        {
            System.out.println("Laboratory Course "+CourseName+" is Full");
            return false;
        }
        else
        {
            CourseArray[size++]=L;
            return true;
        }
    }
    
    public int numberOfStudents()
    {
        int number=0;
        for(int i=0;i<size;i++)
            number=number+CourseArray[i].getSize();
        return number;
    }
    
    @Override
    public void printNumberOfStudents()
    {
        System.out.println("Total Number of Students in Laboratory Course:");
        System.out.println(CourseName+": "+ numberOfStudents());
    }
    
    private int[] succesStatus()
    {
        int pin[]=new int[2*size+2];
        int succeeded=0;
        int failed=0;
        for(int i=0;i<size;i++)
        {
            pin[i]=CourseArray[i].succeded();
            succeeded=succeeded+CourseArray[i].failed();
        }
        for(int i=0;i<size;i++)
        {
            pin[i+size]=CourseArray[i].failed();
            failed=failed+CourseArray[i].failed();
        }
        pin[2*size]=succeeded;
        pin[2*size+1]=failed;
        return pin;
    }
    
    @Override
    public void printSuccesStatus()
    {
        int pin[]=succesStatus();
        for(int i=0;i<size;i++)
        {
            System.out.println("In Lab "+CourseArray[i].getName()+" ");
            System.out.println(pin[i]+" students succeeded and ");
            System.out.println(pin[i+size]+" students failed");
        }
        System.out.println("In the course "+CourseName+" ");
        System.out.println(pin[2*size]+" students succeeded and");
        System.out.println(pin[2*size+1]+" students failed");
    }
    
    @Override
    public void printAverageCourseGrades()
    {
        double total=0.0;
        for(int i=0;i<size;i++)
            total=total+CourseArray[i].averageGrade();
        System.out.println("Total Average Grade of students in Laboratory Course ");
        System.out.println(CourseName+": "+total/size);
    }
    
    @Override
    public void printSuccesStatistics()
    {
        int pin[]=succesStatus();
        for(int i=0;i<size;i++)
        {
            System.out.println("In Lab "+CourseArray[i].getName()+" ");
            System.out.println(" Percentage of students success: "+
                    100*(float)pin[i]/(CourseArray[i].getSize()));
            System.out.println(" Percentage of students failure: "+
                    100*(float)pin[i+size]/(CourseArray[i].getSize()));
        }
        System.out.println("In the course "+CourseName+" ");
        System.out.println(" Total percentage of students success: "+
                100*(float)pin[2*size]/numberOfStudents());
        System.out.println(" Total percentage  of students failure: "+
                100*(float)pin[2*size+1]/numberOfStudents());
    }  
}

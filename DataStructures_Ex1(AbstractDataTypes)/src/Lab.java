/*
Στη συνέχεια δηµιουργήστε την Lab class η οποία περιγράφει αφαιρετικά ένα Τµήµα κάποιου
εργαστηριακού µαθήµατος. Η κλάση αυτή πρέπει να υλοποιεί τις παρακάτω µεθόδους:
• Εισαγωγή φοιτητή στο εργαστηριακό τµήµα
• ∆ιαγραφή φοιτητή από το τµήµα
• Αναζήτηση φοιτητή µε βάση το αριθµό µητρώου
• Εκτύπωση παρουσιολόγιου για το τµήµα ( α.µ. φοιτητή - επώνυµο και όνοµα φοιτητή–
αριθµός παρουσιών – βαθµός)
• Να βρίσκει και να επιστρέφει το πλήθος τον φοιτητών του εργαστηριακού τµήµατος
που πέτυχαν στο µάθηµα
• Να βρίσκει και να επιστρέφει το πλήθος τον φοιτητών του εργαστηριακού τµήµατος
που απέτυχαν στο µάθηµα
• Να βρίσκει και να επιστρέφει το µέσο όρο βαθµολογίας των φοιτητών του
εργαστηριακού τµήµατος
*/
public class Lab implements LabInterface
{
    private String LabName; //Όνομα τμήματος Εργαστηρίου
    private int capacity;//Αριθμός για τον πίνακα τύπου Student
    private int size=0;//Μέγεθος
    private Student[] LabArray;//Πίνακας αντικειμένων τύπου Student
    
    //Constructors
    public Lab(String Name)
    {
        this(Name,20);
    }
    public Lab(String LabName,int capacity)
    {
        this.LabName=LabName;
        this.capacity=capacity;
        LabArray=new Student[capacity];
    }
    
    //Getters-Setters
    public String getName()
    {
        return LabName;
    }
    public int getCapacity()
    {
        return capacity;
    }
    public int getSize()
    {
        return size;
    }
    
    public void setName(String LabName)
    {
        this.LabName=LabName;
    }
    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }
    public void setSize(int size)
    {
        this.size=size;
    }
    
    
    //Εισαφωγή Φοιτητών στο εργαστηριακό τμήμα
    @Override
    public boolean insert(Student S)
    {
        if(size>=capacity)
        {
            System.out.println("Lab "+LabName+" is Full");
            return false;
        }
        else
        {
            LabArray[size++]=S;
            return true;
        }
    }
    
    //Διαγραφή φοιτητή απτό τμήμα
    @Override
    public boolean delete(Student S)
    {
        for (int i=0;i<size;i++)
            if(LabArray[i]==S)
            {
                LabArray[i]=LabArray[--size];
                return true;
            }
        return false;
    }
    
    //Αναζήτηση φοιτητή με βάση τον αριθμό μητρώου(AM)
    @Override
    public Student search(int AM)
    {
        for(int i=0;i<size;i++)
            if(LabArray[i].getAM()==AM) return LabArray[i];
        return null;
    }
    
    //Εκτύπωση παρουσιολογίου
    @Override
    public void presentation()
    {
        for(int i=0;i<size;i++)
            System.out.println(LabArray[i].getAM()+" -- "+LabArray[i].getOnoma()
            +" -- "+LabArray[i].getApousies()+" -- "+LabArray[i].getVathmos());
    }
    
    //Εύρεση και Επιστροφή του πλήθους των φοιτητών που πέτυχαν στο μάθημα.
    @Override
    public int succeded()
    {
        int count=0;
        for(int i=0;i<size;i++)
            if((LabArray[i].getVathmos()>=5) && (LabArray[i].getApousies()<=2))
                count++;
        return count;
    }
    
    //Εύρεση και επιστροφή του πλήθους των φοιτητών που απέτυχαν στο μάθημα.
    @Override
    public int failed()
    {
        return(size-succeded());
    }
    
    //Εύρεση και επιστροφή του μέσου όρου της βαθμολογίας των φοιτητών του εργαστηριακού τμήματος.
    @Override
    public double averageGrade()
    {
        double total=0.0;
        for(int i=0;i<size;i++)
            total=total+LabArray[i].getVathmos();
        return total/size;
    } 
}

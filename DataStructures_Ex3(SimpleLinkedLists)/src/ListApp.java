public class ListApp //Main Class
{
    public static void main(String args[])
    {
        //Δημιουργία Αντικειμένων - Δημιουργία Λιστών LL και LL2.
        LinkedList LL=new LinkedList();
        LinkedList LL2=new LinkedList();
        
        //Εισαγωγή στοιχείων στην 1η (LL) λίστα από το τέλος.
        LL.insertLast("Alex");
        LL.insertLast("Kwstas");
        LL.insertLast("Giannhs");
        LL.insertLast("Stelios");
        LL.insertLast("Kosmas");
        
        //Εισαγωγή στοιχείων στην 2η (LL2) λίστα τύπου Student από το τέλος.
        LL2.insertLast(new Student(181001,"Nikos",0,6));
        LL2.insertLast(new Student(181015,"Anna",0,7));
        LL2.insertLast(new Student(181032,"Kostas",1,8));
        LL2.insertLast(new Student(181040,"Mixalis",1,5));
        LL2.insertLast(new Student(181111,"Giorgos",1,4));
        
        //Υλοποίηση Μεθόδων για την 1η (LL) λίστα.
        try {
            System.out.println("LIST SIZE: "+LL.size());
            
            System.out.println("\nLIST MAX: "+LL.maxOfList());
            
            System.out.println("\nPRINT LIST: "); LL.printList();
            
            String s="Alex";
            String s2="Giorgos";
            System.out.println("\nFOUND "+s+": "+LL.exists(s));
            System.out.println("FOUND "+s2+": "+LL.exists(s2));
        } 
        catch(ListEmptyException Error) {
            System.out.println("IS EMPTY!!");
        }
        
        //Ταξινομήσεις sort() και BubbleSort().
        try {
            System.out.println("\nUNSORTED LIST: "); LL.printList();
            LL=LL.sort();
            System.out.println("SORTED SORT: "); LL.printList();
            //LL=LL.BubbleSort();
            //System.out.println("BUBBLE SORT: "); LL.printList();
        } 
        catch(ListEmptyException Error) {
            System.out.println("IS EMPTY!!");
        }
        
        //Βρίσκει και Επιστρέφει:
        //(α) το σπουδαστή που πέτυχε τη µεγαλύτερη βαθµολογία (max).
        //(β) το σπουδαστή µε τη µικρότερη βαθµολογία (min). 
        // Object pin[] = (Object[]) LL2.MinMaxOfList();
        // System.out.println(pin);
    }
}

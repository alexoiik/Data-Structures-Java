/*
Άσκηση 2.2
∆ηµιουργήστε µια στοίβα από φοιτητές - χρησιµοποιήστε την Student class
και από την προηγούμενη άσκηση και εκτελέστε τις βασικές λειτουργίες της στοίβας. 
*/
public class LinkedStackApp
{
    public static void main(String args[])
    {
        LinkedStack Lst=new LinkedStack();
        //Προσθήκη στοιχείων στην Στοίβα(Stack)
        Lst.push(new Student(181001, "Nikos",0,6));
        Lst.push(new Student(181015, "Anna",0,7));
        Lst.push(new Student(181032, "Kostas",1,8));
        
        //Εμφάνιση του μεγέθους της στοίβας.
        System.out.println("The size of stack is: "+Lst.size());
        
        //Έλεγχος αν η στοίβα είναι άδεια ή όχι.
        System.out.println("\nChecking if stack is Empty(True) or not Empty(False): "+Lst.isEmpty());
        
        //Έλεγχος αν η στοίβα είναι γεμάτη ή όχι.
        System.out.println("\nChecking if stack is Full(True) or not Full(false): "+Lst.isFull());
        
        //Επιστροφή του τελευταίου στοιχείου της κορυφής της στοίβας
        System.out.println("\nReturning the top item of stack: ");
        System.out.println(Lst.top());
        
        //Αφαίρεση τελευταίου στοιχείου της στοίβας.
        System.out.println("\nRemoving all items from Stack:");
        int size=Lst.size();
        for(int i=0;i<size;i++)
        {
            Student S=(Student)Lst.pop(); //downcasting!
            System.out.println("Deleted items:");
            System.out.println("Student: "+S.getOnoma()+", AM: "+S.getAM());
            //Lst.push(S);   //--> ξανά προσθήκη όλων των στοιχείων στην Στοίβα [ Lst.size()=3 ]
        }
        //Lst.pop(); //--> αφαίρεση του τελευταίου μόνο στοιχείου της Στοίβας.
        
        System.out.println("\nThe size of stack is "+Lst.size());
        System.out.println("and the stack is also Empty(True) or not Empty(False): "+Lst.isEmpty());
    }
}

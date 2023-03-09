/*
Άσκηση 2.2
∆ηµιουργήστε µια στοίβα από φοιτητές - χρησιµοποιήστε την Student class
και από την προηγούμενη άσκηση και εκτελέστε τις βασικές λειτουργίες της στοίβας. 
*/
public class StackApp
{
    public static void main(String args[])
    {
        ArrayStack st=new ArrayStack(10);
        //Προσθήκη στοιχείων στην Στοίβα(Stack)
        st.push(new Student(181001, "Nikos",0,6));
        st.push(new Student(181015, "Anna",0,7));
        st.push(new Student(181032, "Kostas",1,8));
        
        //Εμφάνιση του μεγέθους της στοίβας.
        System.out.println("The size of stack is: "+st.size());
        
        //Έλεγχος αν η στοίβα είναι άδεια ή όχι.
        System.out.println("\nChecking if stack is Empty(True) or not Empty(False): "+st.isEmpty());
        
        //Έλεγχος αν η στοίβα είναι γεμάτη ή όχι.
        System.out.println("\nChecking if stack is Full(True) or not Full(false): "+st.isFull());
        
        //Επιστροφή του τελευταίου στοιχείου της κορυφής της στοίβας
        System.out.println("\nReturning the top item of stack: ");
        System.out.println(st.top());
        
        //Αφαίρεση τελευταίου στοιχείου της στοίβας.
        System.out.println("\nRemoving all items of Stack:");
        int size=st.size();
        for(int i=0;i<size;i++)
        {
            Student S=(Student)st.pop(); //downcasting!
            System.out.println("Deleted items:");
            System.out.println("Student: "+S.getOnoma()+", AM: "+S.getAM());
            //st.push(S);   //--> Ξανά προσθήκη όλων των στοιχείων στην Στοίβα. [ st.size()=3 ]
        }
        //st.pop(); //--> αφαίρεση του τελευταίου μόνο στοιχείου της Στοίβας.
        
        System.out.println("\nThe size of stack is: "+st.size());
        System.out.println("and the stack is also Empty(True) or not Empty(False): "+st.isEmpty());
    }
}

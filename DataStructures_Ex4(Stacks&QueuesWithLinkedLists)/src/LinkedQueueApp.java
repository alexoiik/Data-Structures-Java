/*
Άσκηση 2.6
∆ηµιουργήστε µια ουρά από φοιτητές -χρησιµοποιήστε την Student class 
από την προηγούµενηάσκηση και εκτελέστε τις βασικές λειτουργίες της ουράς. 
 */
public class LinkedQueueApp 
{
    public static void main(String args[])
    {
        LinkedQueue Lqueue=new LinkedQueue();
        //Προσθήκη στοιχείων στην Ουρά(Queue)
        Lqueue.enqueue(new Student(181001,"Nikos",0,6));
        Lqueue.enqueue(new Student(181015,"Anna",0,7));
        Lqueue.enqueue(new Student(181032,"Kostas",1,8));
        
        //Επιστροφή του μεγέθους της Ουράς(Queue).
        System.out.println("The size of Queue is: "+Lqueue.size());
        
        //Έλεγχος αν η Ουρά είναι κενή ή όχι.
        System.out.println("\nChecking if Queue is Empty(True) or not Empty(False): "+Lqueue.isEmpty());
        
        //Επιστροφή του πρώτου στοιχείου της Ουράς(Queue).
        System.out.println("\nReturning the first item of Queue: ");
        System.out.println(Lqueue.front());
        
        //Εξαγωγή και επιστροφή του πρώτου στοιχείου της Ουράς.
        System.out.println("\nRemoving all items from Queue:");
        int size=Lqueue.size();
        for(int i=0;i<size;i++)
        {
            Student S=(Student)Lqueue.dequeue(); //downcasting!
            System.out.println("Deleted items:");
            System.out.println("Student "+i+": "+S.getOnoma()+", AM: "+S.getAM());
            //Lqueue.enqueue(S);   //--> Ξανά προσθήκη όλων των στοιχείων στην Ουρά [ Lqueue.size()=3 ]
        }
        //Lqueue.dequeue(); //--> αφαίρεση του τελευταίου μόνο στοιχείου της Ουράς.
        
        System.out.println("\nThe size of Queue is "+Lqueue.size());
        System.out.println("and the Queue is also Empty(True) or not Empty(false): "+Lqueue.isEmpty());
    }
}

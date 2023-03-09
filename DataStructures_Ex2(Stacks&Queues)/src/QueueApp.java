/*
Άσκηση 2.6
∆ηµιουργήστε µια ουρά από φοιτητές -χρησιµοποιήστε την Student class 
από την προηγούµενηάσκηση και εκτελέστε τις βασικές λειτουργίες της ουράς. 
 */
public class QueueApp 
{
    public static void main(String args[])
    {
        ArrayQueue queue=new ArrayQueue(10);
        //Προσθήκη στοιχείων στην Ουρά(Queue)
        queue.enqueue(new Student(181001,"Nikos",0,6));
        queue.enqueue(new Student(181015,"Anna",0,7));
        queue.enqueue(new Student(181032,"Kostas",1,8));
        
        //Επιστροφή του μεγέθους της Ουράς(Queue).
        System.out.println("The size of Queue is: "+queue.size());
        
        //Έλεγχος αν η Ουρά είναι κενή ή όχι.
        System.out.println("\nChecking if Queue is Empty(True) or not Empty(False): "+queue.isEmpty());
        
        //Επιστροφή του πρώτου στοιχείου της Ουράς(Queue).
        System.out.println("\nReturning the first item of Queue: ");
        System.out.println(queue.front());
        
        //Εξαγωγή και επιστροφή του πρώτου στοιχείου της Ουράς.
        System.out.println("\nRemoving all items of Queue:");
        int size=queue.size();
        for(int i=0;i<size;i++)
        {
            Student S=(Student)queue.dequeue(); //downcasting!
            System.out.println("Deleted items:");
            System.out.println("Student "+i+": "+S.getOnoma()+", AM: "+S.getAM());
            //queue.enqueue(S);   //--> Ξανά προσθήκη όλων των στοιχείων στην Ουρά. [ queue.size()=3 ]
        }
        //queue.dequeue(); //--> αφαίρεση του πρώτου μόνο στοιχείου της Ουράς.
        
        System.out.println("\nThe size of Queue is "+queue.size());
        System.out.println("and the Queue is also Empty(True) or not Empty(false): "+queue.isEmpty());
    }
}

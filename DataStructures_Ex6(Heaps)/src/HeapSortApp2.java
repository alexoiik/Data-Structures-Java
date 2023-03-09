//Main class για την ταξινόμηση των δεδομένων ενός Σωρού(Heap) σε πίνακα.
//Με χρήση μίας Μεθόδου εντός της Heap class: public Object[] HeapSort()
public class HeapSortApp2 
{
    public static void main(String args[])
    {
        //Αρχικοποιημένος Πίνακας.
        Student matrix1[] = {
        new Student(17040,"Kostas"),
        new Student(17065,"Nikos"),
        new Student(17025,"Anastasia"),
        new Student(17050,"Vasiliki"),
        new Student(17020,"Maria"),
        new Student(17010,"Vasilis"),
        new Student(17015,"Dimitra"),
        new Student(17055,"Petros"),
        new Student(17045,"Sofia"),
        new Student(17005,"Alekos") 
        };
        
        Heap myHeap = new Heap(); //Με χρήση ArrayList βάζω:  Heap<Student> myHeap = new Heap<>();
        
        try {
            for(int i=0;i<matrix1.length;i++)
                myHeap.insert(matrix1[i]);

            /*Επιστρέφει και διαγράφει το 4ο μεγαλύτερο σε τιμή στοιχείο του Σωρού:*/
            //Object matrix3 = myHeap.removeFourth();
            //System.out.println(matrix3);
             
            /*Επιστρέφει ΚΑΙ ΔΕΝ διαγράφει το 2ο μεγαλύτερο σε τιμή στοιχείο του Σωρού*/
            Object matrix3 = myHeap.findSecMax();
            System.out.println(matrix3);
           
            /*ΧΩΡΙΣ ΔΙΑΓΡΑΦΗ: ΦΘΙΝΟΥΣΑ ΤΑΞΙΝΟΜΗΣΗ των στοιχείων του Σωρού με πίνακα (με βάση τον AM).*/
            //System.out.println("\n*****HEAP SORT*****");
            //myHeap.printSorted();
            //System.out.println("*****END OF HEAP-SORT*****\n");
            
            
            /*ΜΕ ΔΙΑΓΡΑΦΗ: ΑΥΞΟΥΣΑ ΤΑΞΙΝΟΜΗΣΗ και επιστροφή των στοιχείων του Σωρού με πίνακα (με βάση τον AM).*/
            //1ος Τρόπος:
            System.out.println("\n*****HEAP SORT*****");
            Object[] matrix2 = myHeap.HeapSort();
            for(int i=0;i<matrix2.length;i++)
                System.out.println(matrix2[i]);
            System.out.println("*****END OF HEAP-SORT*****\n"); 
               
            //2ος Τρόπος:
         /* System.out.println("\n*****HEAP SORT*****");
            if(HeapSortApp.heapSort(matrix1))
            {
                for(int i=0;i<matrix1.length;i++)
                    System.out.println(matrix1[i]);
                System.out.println("*****END OF HEAP-SORT*****\n");
            } */

            //Ένας τρόπος για φθίνουσα σείρα:
         /* int size=myHeap.size();
            System.out.println("\n*****HEAP SORT*****");
            for(int i=0;i<size;i++)
            {
                Student S = (Student)myHeap.remove();
                System.out.println(S);
            }
            System.out.println("*****END OF HEAP-SORT*****\n"); */
        } 
        catch(HeapFullException Error) {
            System.out.println(Error);
        }
        catch(HeapEmptyException Error) {
            System.out.println(Error);
        }
        catch(Exception Error) {
            System.out.println(Error);
        }
    }
}

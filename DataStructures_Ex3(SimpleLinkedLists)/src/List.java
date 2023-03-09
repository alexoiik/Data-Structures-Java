/*
Η Συνδεδεμένη Λίστα (LinkedList) είναι μία δυναμική δομή δεδομένων. Περιλαμβάνει κόμβους
και ο αριθμός αυτών των κόμβων της μεταβάλλεται κατα την διάρκεια εκτέλεσης του προγράμματος
καθώς κόμβοι μπορούν να εισάγονται ή και να διαγράφονται.
*/
public interface List
{
    public boolean isEmpty();
    //Tests if the List is Empty(TRUE) or not(FALSE).
    
    public int size();
    //Returns the number of the elements of the list.
    
    public void insertFirst(Object newItem);
    //Inserts a new Node(κόμβο) in the beginning.
    
    public void insertLast(Object newItem);
    //Inserts a new Node(κόμβο) in the end.
    
    public Object removeFirst() throws ListEmptyException;
    //Removes and returns the first Node(κόμβο).
    
    public Object removeLast() throws ListEmptyException;
    //Removes and Returns the last Node(κόμβο).
    
    public void printList() throws ListEmptyException;
    //Printing the List
    
    public Object maxOfList() throws ListEmptyException;
    //Returning the Max Item of the list.
    
    public boolean exists(Object newItem) throws ListEmptyException;
    //Returns TRUE if newItem exists as a Node.
    
    public Object MinMaxOfList() throws ListEmptyException;
    //Βρίσκει και Επιστρέφει:
    //(α) το σπουδαστή που πέτυχε τη µεγαλύτερη βαθµολογία (max). 
    //(β) το σπουδαστή µε τη µικρότερη βαθµολογία (min).
}


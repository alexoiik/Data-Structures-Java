/*
Δημιουργία Ουράς(Queue), στην οποία μπορούν να προστεθούν στοιχεία μόνο
στην μία άκρη της (απο πίσω) και να αφαιρεθούν μόνο από την άλλη άκρη (απο μπροστά)
*/
public interface Queue 
{
    public int size();
    //Returns the size of the Queue.
    
    public boolean isEmpty();
    //Returns TRUE if the Queue is empty, else it returns FALSE.
    
    public Object front() throws QueueEmptyException;
    //Returns the First(1st) item of the Queue.
    
    public void enqueue(Object item) throws QueueFullException;
    //Adds a new item into the Queue (στο πίσω μέρος).
    
    public Object dequeue() throws QueueEmptyException;
    //Removes and Returns the First(1st) item of the Queue.
}

/*
Υλοποίηση Ουράς (Queue) με την χρήση της απλά
Συνδεδεμένης Λίστας (LinkedList). Με την τεχνική τής σύνθεσης.
 */
public class LinkedQueue implements Queue
{
    private LinkedList Q;
    
    public LinkedQueue() 
    {
        Q=new LinkedList();
    }
    
    @Override
    public int size() 
    {
        return Q.size();
    }
    
    @Override
    public boolean isEmpty() 
    {
        return Q.isEmpty();
    }
    
    @Override
    public Object front() throws QueueEmptyException
    {
        Object temp;
        if (Q.isEmpty()) 
            throw new QueueEmptyException("Queue is Empty!!");
        temp = Q.removeFirst();
        Q.insertFirst(temp);
        return temp;
    }
    
    @Override
    public void enqueue(Object item) throws QueueFullException
    {
        Q.insertLast(item);
    }
    
    @Override
    public Object dequeue( ) throws QueueEmptyException
    {
        try {
            return Q.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new QueueEmptyException("Queue is Empty!!");
        }
    }
}

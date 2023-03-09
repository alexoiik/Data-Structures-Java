/*
Δημιουργία Στοίβας(Stack), στην οποία μπορούν να προστεθούν 
και να αφαιρεθούν στοιχεία μόνο από την μία άκρη της (δηλαδή από την κορυφή).
*/
public interface Stack 
{
    public int size( );
    //Returns the size of the Stack.
    
    public boolean isEmpty( );
    //Returns TRUE if the Stack is empty, else it returns FALSE.
    
    public boolean isFull( );
    //Returns TRUE if the Stack is full.
    
    public Object top( ) throws StackEmptyException;
    //Returns the Top(last) item of the Stack.
    
    public void push(Object item) throws StackFullException;
    //Adds a new item into the Stack (στο πίσω μέρος).
    
    public Object pop( ) throws StackEmptyException;
    //Removes and Returns the Top(last) item of the Stack.
}

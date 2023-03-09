/*
Υλοποίηση στοίβας (Stack) µε την χρήση της απλά 
Συνδεδεµένης Λίστας (LinkedList). Με την τεχνική της σύνθεσης.
*/
public class LinkedStack implements Stack
{
    private LinkedList S;
    
    public LinkedStack()
    {
        S=new LinkedList();
    }
    
    @Override
    public int size() 
    {
        return S.size();
    }
    
    @Override
    public boolean isFull()
    {
        return false;
    }
    @Override
    public boolean isEmpty()
    {
        return S.isEmpty();
    }
    
    @Override
    public Object top() throws StackEmptyException
    {
        if (S.isEmpty()) 
            throw new StackEmptyException("Stack is Empty!!");
        Object temp = S.removeFirst();
        S.insertFirst(temp);
        return temp;
    }
    
    @Override
    public void push(Object item) throws StackFullException 
    {
        S.insertFirst(item);
    }

    @Override
    public Object pop() throws StackEmptyException 
    {
        try {
            return S.removeFirst();
        }
        catch (ListEmptyException str) {
            throw new StackEmptyException("Stack is Empty!!");
        }
    }
}

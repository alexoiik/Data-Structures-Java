public class ArrayStack implements Stack
{
    public static final int CAPACITY = 100;
    private int capacity;
    private Object[ ] S;
    private int top = -1;
    
    //Constructors
    public ArrayStack() 
    {
        this(CAPACITY);
    }
    
    public ArrayStack(int capacity) 
    {
        this.capacity = capacity;
        S = new Object[capacity];
    }
    
    //Methods
    @Override
    public int size()
    {
        return (top+1);
    }
    
    @Override
    public boolean isEmpty()
    {
        return(top<0);
    }
    
    @Override
    public boolean isFull()
    {
        return(top>=capacity || top>=CAPACITY);
    }
    
    @Override
    public Object top( ) throws StackEmptyException
    {
        if (isEmpty( ))
            throw new StackEmptyException("Stack is Empty!!");
        return S[top];
    }
    
    @Override
    public void push(Object item) throws StackFullException
    {
        if (size( ) == (capacity-1))
            throw new StackFullException("Stack Overflow!!");
        S[++top] = item;
    }
    
    @Override
    public Object pop( ) throws StackEmptyException 
    {
        Object element;
        if (isEmpty())
            throw new StackEmptyException("Stack is Empty!!");
        element = S[top];
        S[top--] = null; //For garbage collector!!!
        return element;
    }
}

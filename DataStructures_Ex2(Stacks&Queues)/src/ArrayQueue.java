public class ArrayQueue implements Queue
{
    public static final int CAPACITY=1000;
    private int capacity;
    private Object[] Q;
    private int first=0;
    private int last=0;
    
    //Constructors
    public ArrayQueue()
    { this(CAPACITY); }
    
    public ArrayQueue(int capacity)
    {
        this.capacity=capacity;
        Q=new Object[capacity];
    }
    
    @Override
    public int size()
    {
        return (last-first);
    }
    
    @Override
    public boolean isEmpty()
    {
        return(first==last);
    }
    
    @Override
    public Object front() throws QueueEmptyException
    {
        if(isEmpty())
            throw new QueueEmptyException("Queue is Empty!!");
        return Q[first];
    }
    
    @Override
    public void enqueue(Object item) throws QueueFullException
    {
        if(last==capacity)
            throw new QueueFullException("Queue Overflow!!");
        Q[last++]=item;
    }
    
    @Override
    public Object dequeue() throws QueueEmptyException
    {
        Object item;
        if(isEmpty())
                throw new QueueEmptyException("Queue is Empty!!");
        item=Q[first];
        Q[first++]=null; //For garbage collector!!
        return item;
    }
}

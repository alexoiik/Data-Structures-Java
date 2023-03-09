public class Heap implements HeapInterface
{
    private Object[ ] btree;
    private int index;
    private int capacity;
    
    public Heap() 
    {
        this(20);
    }
    
    public Heap(int cap) 
    {
        capacity = cap;
        btree = new Object[capacity+1];
        index = 0;
    } 
    
    @Override
    public int size() 
    {
        return index;
    }
    
    @Override
    public boolean isEmpty () 
    {
        return index==0;
    }
    
    @Override
    public boolean isFull() 
    {
        return index==capacity;
    }
    
    @Override
    public void insert (Object item) throws HeapFullException 
    {
        if (isFull()) 
            throw new HeapFullException("Heap is Full!");
        int father, son;
        son = ++index;
        btree[son] = item; //αρχικά το item στο τέλος της heap.
        father = son/2;
        while(son>1 && ((Comparable)btree[son]).compareTo((Comparable)btree[father])>0) 
        {
            Object b = btree[father];
            btree[father] = btree[son];
            btree[son] = b;
            son = father;
            father = son/2;
        }
    }
    
    @Override
    public Object remove( ) throws HeapEmptyException 
    {
        if (isEmpty( )) 
            throw new HeapEmptyException("No items in Heap");
        int father, son;
        Object lastItem = btree[index];
        btree[index] = btree[1];
        Object removeItem = btree[1];
        index--;
        father = 1;
        if ( (index > 2) && ((Comparable)btree[2]).compareTo((Comparable)btree[3])>0 )
            son = 2;
        else 
            son = 3;
        while(son <= index && ((Comparable)btree[son]).compareTo((Comparable)lastItem)>0 ) 
        {
            btree[father] = btree[son];
            father = son;
            son = father * 2;
            if (son+1 <= index && ((Comparable)btree[son+1]).compareTo((Comparable)btree[son])>0) 
                son = son +1;
        }
        btree[father] = lastItem;
        return removeItem;
    }
    

    /*ΜΕ ΔΙΑΓΡΑΦΗ: ΑΥΞΟΥΣΑ ΤΑΞΙΝΟΜΗΣΗ και επιστροφή των στοιχείων του Σωρού με πίνακα (με βάση τον AM).*/
    @Override
    public Object[] HeapSort()
    {
        int size=size();
        Object[] array = new Object[size];
              //αύξουσα
        for(int i=size-1;i>=0;i--) //για φθίνουσα βάζω ==> for(int i=0;i<size;i++)
            array[i]=remove();
        return array;
    }
    
    /*ΧΩΡΙΣ ΔΙΑΓΡΑΦΗ: ΦΘΙΝΟΥΣΑ ΤΑΞΙΝΟΜΗΣΗ των στοιχείων του Σωρού με πίνακα (με βάση τον AM).*/
    public void printSorted()
    {
        int size=size();
        Object[] matrix = new Object[size];
              //φθίνουσα
        for(int i=0;i<size;i++) //φθίνουσα
            matrix[i]=remove();
        for(int i=0;i<size;i++) //φθίνουσα
            insert(matrix[i]);
        for(int i=0;i<matrix.length;i++)
            System.out.println(matrix[i]);
    }
    
    //Επιστρέφει ΚΑΙ διαγράφει το 4ο μεγαλύτερο σε τιμή στοιχείο του Σωρού.
    public Object removeFourth()
    {
        int size=size();
        Object[] matrix = new Object[size];
              //φθίνουσα
        for(int i=0;i<size;i++) //φθίνουσα 
            matrix[i]=remove();
        return matrix[3];
    }
    
    /*Επιστρέφει ΚΑΙ ΔΕΝ διαγράφει το 2ο μεγαλύτερο σε τιμή στοιχείο του Σωρού*/
    public Object findSecMax()
    {
        int size=size();
        Object[] matrix = new Object[size];
              //φθίνουσα
        for(int i=0;i<size;i++) //φθίνουσα 
            matrix[i]=remove();
        for(int i=0;i<size;i++) //φθίνουσα 
            insert(matrix[i]);
       return matrix[1];
    }
}

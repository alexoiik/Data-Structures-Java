//with ArrayList instead of Object.
import java.util.ArrayList;

public class AL_Heap implements HeapInterface
{
    private ArrayList btree;
    private int index;
    
    public AL_Heap() 
    {
        btree = new ArrayList();
        btree.add(null);
        index=0;
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
        return false;
    }
    
    @Override
    public void insert (Object item) throws HeapFullException 
    {
        if (isFull()) 
            throw new HeapFullException("Heap is Full!");
        int father, son;
        son = ++index;
        btree.set(son,item);  //αρχικά το item στο τέλος της heap.
        father = son/2;
        while(son>1 && ((Comparable)btree.get(son)).compareTo((Comparable)btree.get(father))>0) 
        {
            Object b = btree.get(father);
            btree.set(father,btree.get(son));
            btree.set(son,b);
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
        Object lastItem = btree.get(index);
        btree.set(index,btree.get(1));
        Object removeItem = btree.get(1);
        index--;
        father = 1;
        if ( (index > 2) && ((Comparable)btree.get(2)).compareTo((Comparable)btree.get(3))>0 )
            son = 2;
        else 
            son = 3;
        while(son <= index && ((Comparable)btree.get(son)).compareTo((Comparable)lastItem)>0 ) 
        {
            btree.set(father,btree.get(son));
            father = son;
            son = father * 2;
            if (son+1 <= index && ((Comparable)btree.get(son+1)).compareTo((Comparable)btree.get(son))>0) 
                son = son +1;
        }
        btree.set(father,lastItem);
        return removeItem;
    }
    
    /* Με βάση την υλοποίηση του σωρού γράψτε µία µέθοδο, η οποία δοθέντος ενός πίνακα µε 
    δεδοµένα σε τυχαία σειρά να τον ταξινοµεί σε αύξουσα σειρά. */ 
    @Override
    public Object[] HeapSort()
    {
        int size=size();
        Object[] array = new Object[size];
        for(int i=size-1;i> 0;i--) //για φθίνουσα βάζω: for(int i=0;i<size;i++)
            array[i]=remove();
        return array;
    }
}

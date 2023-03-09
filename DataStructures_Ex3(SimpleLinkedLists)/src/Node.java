public class Node //Δημιουργία κλάσης για ΚΟΜΒΟ(NODE)
{
    private Object item;
    private Node next;

    //Constructors
    public Node()
    { 
        this(null,null); 
    }
    public Node(Object data,Node next)
    {
        this.item=data;
        this.next=next;
    }
    
    //Getters-Setters
    public Object getItem()
    {
        return item;
    }
    public Node getNext()
    {
        return next;
    }
    public void setItem(Object data)
    {
        this.item=data;
    }
    public void setNext(Node next)
    {
        this.next=next;
    }
    
    @Override
    public String toString()
    {
        return item.toString();
    }
  }

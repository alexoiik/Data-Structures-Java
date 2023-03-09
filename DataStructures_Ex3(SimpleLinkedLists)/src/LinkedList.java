public class LinkedList implements List //Συνδεδεμένη Λίστα
{
        private Node firstNode;
        private Node lastNode;
        
        //Constructor
        public LinkedList()
        {
            firstNode=lastNode=null;
        }
        //Getters-Setters
        public Node getFirstNode()
        {
            return firstNode;
        }
        public Node getLastNode()
        {
            return lastNode;
        }
        public void setFirstNode(Node firstNode)
        {
            this.firstNode=firstNode;
        }
        public void setLastNode(Node lastNode)
        {
            this.lastNode=lastNode;
        }
        
        //Methods
        @Override
        public boolean isEmpty()
        {
            return (firstNode==null);
        }
        
        @Override
        public int size()
        {
            int size=0;
            Node position=firstNode;
            while(position!=null)
            {
                position=position.getNext();
                size++;
            }
            return size;
        }
        
        @Override
        public void insertFirst(Object newItem)
        {
            if(isEmpty())
                firstNode=lastNode=new Node(newItem,null);
            else
                firstNode=new Node(newItem,firstNode);
        }
        
        @Override
        public void insertLast(Object newItem)
        {
            if(isEmpty())
                firstNode=lastNode=new Node(newItem,null);
            else
            {
                Node temp=new Node(newItem,null);
                lastNode.setNext(temp);
                lastNode=temp;
            }
        }
        
        @Override
        public Object removeFirst() throws ListEmptyException
        {
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            Object removeItem=firstNode.getItem();
            if(firstNode==lastNode)
                firstNode=lastNode=null;
            else
                firstNode=firstNode.getNext();
            return removeItem;   
        }
        
        @Override
        public Object removeLast() throws ListEmptyException
        {
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            Object removeItem=lastNode.getItem();
            if(firstNode==lastNode)
                firstNode=lastNode=null;
            else
            {
                Node position;
                for(position=firstNode; position.getNext()!=lastNode; position=position.getNext())
                    lastNode=position;
                position.setNext(null);
            }
            return removeItem;
        }
        
        @Override
        public void printList() throws ListEmptyException
        {
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            for(Node position=firstNode; position!=null; position=position.getNext())
                System.out.println(position.getItem());
        }
        
        @Override
        public Object maxOfList() throws ListEmptyException
        {
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            Object max=firstNode.getItem();
            Node position=firstNode.getNext();
            while(position!=null)
            {
                Comparable CoMax=(Comparable)max;
                Comparable CoItem=(Comparable)position.getItem();
                if(CoMax.compareTo(CoItem)<0)
                    max=position.getItem();
                position=position.getNext();
            }
            return max;
        }
        
        @Override
        public boolean exists(Object newItem) throws ListEmptyException
        {
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            Node position=firstNode;
            while(position!=null)
            {
                if(position.getItem().equals(newItem))
                    return true;
                position=position.getNext();
            }
            return false;
        }
        
        //Sort() LinkedList
        public LinkedList sort()
        {
            Node trace,current,min;
            trace=getFirstNode();
            while(trace!=null)
            {
                current=trace;
                min=trace;
                while(current!=null)
                {
                    if(((String)(current.getItem())).compareTo((String)(min.getItem()))<0) //για φθίνουσα '>'
                        min=current;
                    current=current.getNext();
                }
                String temp=(String)trace.getItem();
                trace.setItem(min.getItem());
                min.setItem(temp);
                trace=trace.getNext();
            } //EndWhile trace
            return this; 
        }
        
        //BubbleSort() LinkedList
        public LinkedList BubbleSort()
        {
            Node current=getFirstNode();
            while(current!=null)
            {
                Node second=current.getNext();
                while(second!=null)
                {
                    if(((String)(current.getItem())).compareTo((String)(second.getItem()))>0) //για φθίνουσα '<'
                    {
                        String temp=(String) current.getItem();
                        current.setItem(second.getItem());
                        second.setItem(temp);
                    }
                    second=second.getNext();
                }
                current=current.getNext();
            } //EndWhile current. 
            return this;
        }
        
        @Override
        public Object MinMaxOfList() throws ListEmptyException
        {
            Object [] MinMax=new Student[2];
            if(isEmpty())
                throw new ListEmptyException("List is Empty");
            Object min=firstNode.getItem();
            Node position=firstNode.getNext();
            while(position!=null) 
            {
                if(((Student)min).getVathmos()>((Student)(position.getItem())).getVathmos())
                    min=position.getItem();
                position=position.getNext();
            }
            MinMax[0]=min;
            Object max=firstNode.getItem();
            position=firstNode.getNext();
            while(position!=null)
            {
                if(((Student)max).getVathmos()<((Student)(position.getItem())).getVathmos()) 
                    max=position.getItem(); 
                position=position.getNext();
            }
            MinMax[1]=max;
            return MinMax;
        }
}
//Κλάση Δυαδικού Δέντρου Αναζήτησης με χρήση Generics.
public class G_BSTree <E>
{
    private G_TreeNode root;
    
    public G_BSTree()
    {
        root=null;
    }
    
    //Ελέγχει αν το Δέντρο είναι άδειο ή οχι.
    public boolean isEmpty()
    {
        return (root==null);
    }

    //Μέθοδος Εισαγωγής μίας τιμής στο Δέντρο.
    public void insertElement(E data)
    {
        if(isEmpty()) 
            root=new G_TreeNode(data);
        else
            insertNode(data,root);
    }
    
    //Μέθοδος Εισαγωγής ενός Κόμβου στο Δέντρο.
    public void insertNode(E data,G_TreeNode node)
    {
        if(((Comparable)data).compareTo(node.getNodeData())<0)
        {
            if(node.getLeftNode()==null)
                node.setLeftNode(new G_TreeNode(data));
            else
                insertNode(data,node.getLeftNode());
        }
        else
        {
            if(node.getRightNode()==null)
                node.setRightNode(new G_TreeNode(data));
            else
                insertNode(data,node.getRightNode());
        }
    }
    
    //**Μέθοδος που Τοποθετεί τα στοιχεία του Δέντρου ταξινομημένα σε έναν Πίνακα**
    public Object[] inOrderSort()
    {
        Object[] array = new Object[countNodes()];
        inOrderSort(root,array,0);
        return array;
    }
    private int inOrderSort(G_TreeNode node,Object[] pin,int i)
    {
        if(node==null)
            return i;
        i = inOrderSort(node.getLeftNode(),pin,i);
        pin[i] = node.getNodeData();
        i++;;
        i = inOrderSort(node.getRightNode(),pin,i);
        return i;
    }
    
    
    //Ενθεματική Διέλευση (Inorder Traversal) από τους κόμβους του Δέντρου.
    public void inOrderTraversal()
    {
        System.out.println("*****INORDER TRAVERSAL*****");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(G_TreeNode node)
    {
        if(node==null) return;
        inOrder(node.getLeftNode());
        System.out.println(node.getNodeData()+" ");
        inOrder(node.getRightNode());
    }
    
    //Προθεματική Διέλευση (Preorder Traversal) από τους κόμβους του Δέντρου.
    public void preOrderTraversal()
    {
        System.out.println("*****PREORDER TRAVERSAL*****");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(G_TreeNode node)
    {
        if(node==null) return;
        System.out.println(node.getNodeData()+" ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }
    
    //Επιθεματική/Μεταθετική Διέλευση (Postorder Traversal) από τους κόμβους του Δέντρου.
    public void postOrderTraversal()
    {
        System.out.println("*****POSTORDER TRAVERSAL*****");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(G_TreeNode node)
    {
        if(node==null) return;
        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.println(node.getNodeData()+" ");
    }
    
    //Μέθοδος Μέτρησης των Κόμβων του Δέντρου.
    public int countNodes()
    {
        return countNodes(root);
    }
    private int countNodes(G_TreeNode node)
    {
        if(node==null) return 0;
        else return
                countNodes(node.getLeftNode())+countNodes(node.getRightNode())+1;
    }
    
    //Μέθοδος Μέτρησης των Φύλλων του Δέντρου.
    public int countLeafs()
    {
        return countLeafs(root);
    }
    private int countLeafs(G_TreeNode node)
    {
        if(node==null) return 0;
        else
        {
            int count=0;
            count += countLeafs(node.getLeftNode());
            count += countLeafs(node.getRightNode());
            if((node.getLeftNode()==null) && (node.getRightNode()==null))
                count++;
            return count;
        }
    }
    
     //Μέθοδος που  Βρίσκει και επιστρέφει το ύψος του δυαδικού δέντρου.
    public int treeHeight()
    {
        return treeHeight(root);
    }
    private int treeHeight(G_TreeNode node)
    {
        if(node==null)
            return -1;
        return 1 + Math.max (treeHeight(node.getLeftNode()) , treeHeight(node.getRightNode()));
    }
    
    //Μέθοδος που Βρίσκει και εφόσον υπάρχει επιστρέφει το ύψος του κόµβου του 
    //δυαδικού δέντρου µε περιεχόµενο τον ακέραιο αριθµό data. Εάν δέν υπάρχει επιστρέφει -1.
    public int treeHeight(E data)
    {
        if(search(data)) return treeHeight(root,data);
        return -1;
    }
    private int treeHeight(G_TreeNode node,E data)
    {
        if(((Comparable)data).compareTo(node.getNodeData())==0) return 0;
        if(((Comparable)data).compareTo(node.getNodeData())<0)
            return treeHeight(node.getLeftNode(),data)+1;
        return treeHeight(node.getRightNode(),data)+1;
    }   
    
    //Μέθοδος που Βρίσκει εάν στο δυαδικό δέντρο υπάρχει o κόµβος(data). Επιστρέφει true ή false ανάλογα.
    public boolean search(E data)
    {
        return search(root,data);
    }
    private boolean search(G_TreeNode node,E data)
    {
        if(node==null) return false;
        if(((Comparable)data).compareTo(node.getNodeData())==0) return true;
        if(search(node.getLeftNode(),data)) return true;
        return search(node.getRightNode(),data);
    }   
}

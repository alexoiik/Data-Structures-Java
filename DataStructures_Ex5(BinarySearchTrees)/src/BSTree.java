//Κλάση Δυαδικού Δέντρου Αναζήτησης
public class BSTree 
{
    private TreeNode root;
    
    public BSTree()
    {
        root=null;
    }
    
    //Ελέγχει αν το Δέντρο είναι άδειο ή οχι.
    public boolean isEmpty()
    {
        return (root==null);
    }

    //Μέθοδος Εισαγωγής μίας τιμής στο Δέντρο.
    public void insertElement(int data)
    {
        if(isEmpty()) 
            root=new TreeNode(data);
        else
            insertNode(data,root);
    }
    
    //Μέθοδος Εισαγωγής ενός Κόμβου στο Δέντρο.
    public void insertNode(int data,TreeNode node)
    {
        if(data<node.getNodeData())
        {
            if(node.getLeftNode()==null)
                node.setLeftNode(new TreeNode(data));
            else
                insertNode(data,node.getLeftNode());
        }
        else
        {
            if(node.getRightNode()==null)
                node.setRightNode(new TreeNode(data));
            else
                insertNode(data,node.getRightNode());
        }
    }
    
    //Ενθεματική Διέλευση (Inorder Traversal) από τους κόμβους του Δυαδικού Δέντρου.
    public void inOrderTraversal()
    {
        System.out.println("*****INORDER TRAVERSAL*****");
        inOrder(root);
        System.out.println();
    }
    private void inOrder(TreeNode node)
    {
        if(node==null) return;
        inOrder(node.getLeftNode());
        System.out.println(node.getNodeData()+" ");
        inOrder(node.getRightNode());
    }
    
    //Προθεματική Διέλευση (Preorder Traversal) από τους κόμβους του Δυαδικού Δέντρου.
    public void preOrderTraversal()
    {
        System.out.println("*****PREORDER TRAVERSAL*****");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(TreeNode node)
    {
        if(node==null) return;
        System.out.println(node.getNodeData()+" ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }
    
    //Επιθεματική/Μεταθετική Διέλευση (Postorder Traversal) από τους κόμβους του Δυαδικού Δέντρου.
    public void postOrderTraversal()
    {
        System.out.println("*****POSTORDER TRAVERSAL*****");
        postOrder(root);
        System.out.println();
    }
    private void postOrder(TreeNode node)
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
    private int countNodes(TreeNode node)
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
    private int countLeafs(TreeNode node)
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
    private int treeHeight(TreeNode node)
    {
        if(node==null) return -1;
        return 1 + Math.max (treeHeight(node.getLeftNode()) , treeHeight(node.getRightNode()));
    }
    
    //Μέθοδος που Βρίσκει, και εφόσον υπάρχει, επιστρέφει το ύψος του κόµβου του 
    //δυαδικού δέντρου µε περιεχόµενο τον ακέραιο αριθµό data. Εάν δέν υπάρχει επιστρέφει -1.
    public int treeHeight(int data)
    {
        if(search(data)) return treeHeight(root,data);
        return -1;
    }
    private int treeHeight(TreeNode node,int data)
    {
        if(node.getNodeData()==data) return 0;
        if(data<node.getNodeData()) return treeHeight(node.getLeftNode(),data)+1;
        return treeHeight(node.getRightNode(),data)+1;
    }
    
    //Μέθοδος που Βρίσκει εάν στο δυαδικό δέντρο υπάρχει o κόµβος(data). Επιστρέφει true ή false ανάλογα.
    public boolean search(int data)
    {
        return search(root,data);
    }
    private boolean search(TreeNode node,int data)
    {
        if(node==null) return false;
        if(node.getNodeData()==data) return true;
        if(search(node.getLeftNode(),data)) return true;
        return search(node.getRightNode(),data);
    }
}

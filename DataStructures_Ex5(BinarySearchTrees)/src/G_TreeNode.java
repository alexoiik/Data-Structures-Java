public class G_TreeNode <E>
{
    private G_TreeNode leftNode;
    private G_TreeNode rightNode;
    private E item;
    
    public G_TreeNode(E item) 
    {
        this.item = item;
        leftNode = rightNode = null;
    }

    //Getters-Setters
    public E getNodeData()
    {
        return item;
    }
    public G_TreeNode getLeftNode()
    {
        return leftNode;
    }
    public G_TreeNode getRightNode()
    {
        return rightNode;
    }
    
    public void setNodeData(E item)
    {
        this.item=item;
    }
    public void setLeftNode(G_TreeNode leftNode)
    {
        this.leftNode=leftNode;
    }
    public void setRightNode(G_TreeNode rightNode)
    {
        this.rightNode=rightNode;
    }
    
    public boolean isLeaf()
    {
        return ((leftNode==null) && (rightNode==null));
    }
}


public class TreeNode 
{
    private TreeNode leftNode;
    private TreeNode rightNode;
    private int item; //για integers
    
    public TreeNode(int item) 
    {
        this.item = item;
        leftNode = rightNode = null;
    }

    //Getters-Setters
    public int getNodeData()
    {
        return item;
    }
    public TreeNode getLeftNode()
    {
        return leftNode;
    }
    public TreeNode getRightNode()
    {
        return rightNode;
    }
    
    public void setNodeData(int item)
    {
        this.item=item;
    }
    public void setLeftNode(TreeNode leftNode)
    {
        this.leftNode=leftNode;
    }
    public void setRightNode(TreeNode rightNode)
    {
        this.rightNode=rightNode;
    }
    
    public boolean isLeaf()
    {
        return ((leftNode==null) && (rightNode==null));
    }
}

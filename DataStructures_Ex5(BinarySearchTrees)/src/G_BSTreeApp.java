public class G_BSTreeApp 
{
    public static void main(String args[ ])
    {
        //Αρχικοποιημένοι Πίνακες.
        Student matrix1[] = {
        new Student(17040,"Kostas"),
        new Student(17065,"Nikos"),
        new Student(17025,"Anastasia"),
        new Student(17050,"Vasiliki"),
        new Student(17020,"Maria"),
        new Student(17010,"Vasilis"),
        new Student(17015,"Dimitra"),
        new Student(17055,"Petros"),
        new Student(17045,"Sofia"),
        new Student(17005,"Alekos") 
        };
        String matrix2[] ={"Kostas","Nikos","Yannhs","Anna","Ioulia","Stelios",
            "Andreas","Dimitris","Panos","Eleni","Katerina"};
        
        //Αντικείμενα Δέντρου (GBSTree) με Generics.
        G_BSTree Gtree = new G_BSTree<Student> ();
        G_BSTree Gtree2 = new G_BSTree<String> ();
        
        //Εισαγωγή των Στοιχείων του Πίνακα matrix1[] στο Δέντρο(GBSTree).
        for (int i=0;i<matrix1.length; i++) 
            Gtree.insertElement(matrix1[i]);
        
        //Μέθοδοι Διέλευσης. 
        //Gtree.inOrderTraversal();
        //Gtree.preOrderTraversal();
        //Gtree.postOrderTraversal();
        //Μέθοδοι Μέτρησης Κόμβων/Φύλλων.
        System.out.println("Αριθμός Κόμβων(Nodes) Δέντρου: "+Gtree.countNodes());
        System.out.println("Αριθμός Φύλλων(Leafs) Δέντρου: "+Gtree.countLeafs());
        System.out.println("Ύψος(Heigth) Δέντρου: "+Gtree.treeHeight());
        System.out.println("\n*****UNORDERED TREE*****");
        for(int i=0;i<matrix1.length;i++) 
            System.out.println(matrix1[i]);
        Object pin[] = Gtree.inOrderSort();
        System.out.println("\n*****ORDERED TREE*****");
        for(int i=0;i<matrix1.length;i++)
            System.out.println(pin[i]);
        
        System.out.println("\n--------------------------------------------------");
        
        //Εισαγωγή των Στοιχείων του Πίνακα matrix2[] στο Δέντρο(GBSTree)
        for(int i=0;i<matrix2.length;i++)
            Gtree2.insertElement(matrix2[i]);
        //Μέθοδοι Διέλευσης. 
        //Gtree2.inOrderTraversal();
        //Gtree2.preOrderTraversal();
        //Gtree2.postOrderTraversal();
        //Μέθοδοι Μέτρησης Κόμβων/Φύλλων.
        System.out.println("Αριθμός Κόμβων(Nodes) Δέντρου: "+Gtree2.countNodes());
        System.out.println("Αριθμός Φύλλων(Leafs) Δέντρου: "+Gtree2.countLeafs());
        System.out.println("Ύψος(Heigth) Δέντρου: "+Gtree2.treeHeight());
        System.out.println("\n*****UNORDERED TREE*****");
        for(int i=0;i<matrix1.length;i++) 
            System.out.println(matrix2[i]);
        Object pin2[] = Gtree2.inOrderSort();
        System.out.println("\n*****ORDERED TREE*****");
        for(int i=0;i<matrix1.length;i++)
            System.out.println(pin2[i]);
    }
}

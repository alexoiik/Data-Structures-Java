import java.util.Scanner;

public class BSTreeApp 
{
    public static void main(String args[ ])
    {
        Scanner scan = new Scanner(System.in);
        //Αρχικοποιημένος Πίνακας.
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        
        //Αντικείμενο Δέντρου (BSTree).
        BSTree tree = new BSTree();
        //Εισαγωγή των Στοιχείων του Πίνακα matrix[] στο Δέντρο(BSTree).
        for (int i=0; i<matrix.length; i++) 
            tree.insertElement(matrix[i]);
        
        //Μέθοδοι Διέλευσης. 
        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        
        //Μέθοδοι Μέτρησης Κόμβων/Φύλλων/Ύψους του Δυαδικού Δέντρου.
        System.out.println("Αριθμός Κόμβων(Nodes) Δέντρου: "+tree.countNodes());
        System.out.println("Αριθμός Φύλλων(Leafs) Δέντρου: "+tree.countLeafs());
        System.out.println("Ύψος(Heigth) Δέντρου: "+tree.treeHeight());
        
        //Μέθοδοι εισαγωγής ενός Κόμβου απτό πληκτρολόγιο.
        //-> ΥΠΑΡΧΕΙ???
        System.out.println("\nΠΛηκτρολόγισε τον Κόμβο του Δέντρου που αναζητάς - εάν υπάρχει(true):");
        int node=scan.nextInt();
        System.out.println("Ο Κόμβος ("+node+") από το Δέντρο είναι: "+tree.search(node));
        //-> ΥΨΟΣ ΤΟΥ???
        System.out.println("ΠΛηκτρολόγισε τον Κόμβο του Δέντρου στο οποίο αναζητάς το Ύψος του:");
        int node2=scan.nextInt();
        System.out.println("To ύψος του Κόμβου ("+node2+") από το Δέντρο είναι: "+tree.treeHeight(node2));
    } 
}

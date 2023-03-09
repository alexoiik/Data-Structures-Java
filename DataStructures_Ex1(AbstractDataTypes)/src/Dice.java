/*
Γράψτε ένα πρόγραμμα προσομοίωσης της ρίψεως 2 ζαριών. Η ρίψη κάθε ζαριού πρέπει 
να προσομοιώνεται με χρήση της μεθόδου Math.random και το άθροισμα των αποτελεσμάτων
των 2 ζαριών να αποθηκεύεται σε ένα πίνακα αποτελεσμάτων. Η «διάρκεια» της προσομοίωσης
είναι 30000 ρίψεις. Με την ολοκλήρωση της προσομοίωσης να εκτυπώνεται ο πίνακας αποτελεσμάτων.
Παράδειγμα εκτέλεσης
Result 2 : 819 times
Result 3 : 1705 times
Result 4 : 2570 times
Result 5 : 3298 times
Result 6 : 4186 times
Result 7 : 4997 times
Result 8 : 4168 times
Result 9 : 3300 times
Result 10 : 2425 times
Result 11 : 1703 times
Result 12 : 830 times
Υποδείξεις: 
- Η πιο απλή αντιμετώπιση του προβλήματος είναι να κατασκευάσουμε μια μέθοδο εξαγωγής ενός 
αποτελέσματος ρίψεως ζαριού.
- Ένας πιο κομψός τρόπος επίλυσης του προβλήματος είναι να δημιουργήσουμε μια die class η οποία και
περιγράφει ένα ζάρι και περιέχει την μέθοδο εξαγωγής αποτελέσματος.
- Προφανώς ένα ζάρι μπορεί να φέρει ως αποτέλεσμα ένα φυσικό αριθμό στο διάστημα [1,6] με τυχαίο
τρόπο. Από την κλάση αυτή παράγουμε 2 αντικέιμενα-ζάρια. Τα ζάρια αυτά τα χρησιμοποιούμε τόσες φορές 
όσες και η διάρκεια της προσομοίωσης (30000 φορές) και κάθε φορά αθροίζουμε το αποτέλεσμα της ρίψης και 
ενημερώνουμε ένα μονοδιάστατο πίνακα αποτελεσμάτων. Στο τέλος εκτυπώνουμε τον πίνακα αποτελεσμάτων και 
παίρνουμε στην έξοδο ένα αποτέλεσμα παρόμοιο με αυτό του παραδείγματος εκτέλεσης.
 */

public class Dice 
{
    private String name;
    private int diceResult;
    
    //Constructor
    public Dice(String name)
    {
        this.name=name;
        diceResult=1;
    }
    
    public void rollDice()
    {
        diceResult = (int) (Math.round( (Math.random()*5) ))+1;
    }
    
    //Getters-Setters
    public int getResult()
    {
        return diceResult;
    }
    public String getName()
    {
        return name;
    }
    public void setResult(int diceResult)
    {
        this.diceResult=diceResult;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    
    @Override
    public String toString()
    {
        return (name+" Result = "+diceResult);
    }
}

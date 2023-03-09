/*
Άσκηση 2.3
Να γραφεί πρόγραµµα Java για τον έλεγχο της σωστής χρήσης των παρενθέσεων ( και ) 
σε µία αριθµητική παράσταση χρησιµοποιώντας τη δοµή δεδοµένων στοίβα. Το πρόγραµµα να
επιστρέφει µήνυµα εάν η αριθµητική παράσταση είναι σωστή ή εάν έχει λάθος, να αναφέρει το
σηµείο που βρήκε το λάθος. 
Παραδείγµατα
(1+3)*3*(2+2) ----> Result: No error
 1+3)*3*(2+2) ----> Result: error at position 4 !! 
 */
public class BracketsCheckApp 
{
    public static void main(String args[])
    {
        String sentence = "(x+y))*((a+(b+c)-z))";
        System.out.println(simpleBracketsCheck(sentence));
    }
    
    //Method for mistakes
    public static boolean simpleBracketsCheck(String expression)
    {
        ArrayStack CheckStack=new ArrayStack(10);
        char charToCheck;
        
        for(int i=0;i<expression.length();i++)
        {
            charToCheck=expression.charAt(i);
            if(charToCheck=='(') CheckStack.push('(');
            if(charToCheck==')')
            {
                if(CheckStack.isEmpty())
                {
                    System.out.println("Error at position: "+(i));
                    return false;
                }
                else CheckStack.pop();
            }
        }
        if(CheckStack.isEmpty())
        {
            System.out.println("No Error");
            return true;
        }
        else
        {
            System.out.println("Error at position: "+expression.length());
            return false;
        }    
    }
}

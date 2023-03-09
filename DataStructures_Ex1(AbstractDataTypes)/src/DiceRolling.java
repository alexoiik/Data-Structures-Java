/**
 * this is the main class. So lunch the project.
 * @alexoiik
 * Alexandros Oikonomou
 * Αλέξανδρος Οικονόμου
 */

//MAIN CLASS
public class DiceRolling 
{
    static final int SIMULATION_DURATION=30000;
    
    private static void printArray(int matrix[])
    {
        System.out.println("Result \t Number of throws");
        for(int i=0;i<matrix.length;i++)
                System.out.println(""+(1)+" \t = "+matrix[i]);
    }
    
    //MAIN METHOD
    public static void main(String args[])
    {
        System.out.println("************ ROLLING DICE ************");
        
        //creating a white & a black dice
        Dice dice1=new Dice("WHITE DICE");
        Dice dice2=new Dice("BLACK DICE");
        
        int resultsArray[]=new int[13];
        
        for(int i=0;i<SIMULATION_DURATION;i++)
        {
            //Roll the dice
            dice1.rollDice();
            dice2.rollDice();
            
            //Inform the Results
            resultsArray[dice1.getResult()+dice2.getResult()]++;
            
            //Print the Results
            printArray(resultsArray);
            System.out.println("************ END OF SIMULATION ************");
        } 
    }
}

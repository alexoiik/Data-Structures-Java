/*
Άσκηση 2.7
Να γραφεί πρόγραµµα Java για την εξυπηρέτηση αυτοκινήτων σε διόδια µε την χρήση ουράς, 
η οποία θα υλοποιείται µε ̟ίνακα. Πιο συγκεκριµένα θα εµφανίζεται το παρακάτω µενού:
ΜΕΝΟΥ
1. Άφιξη αυτοκινήτου
2. Αναχώρηση αυτοκινήτου
3. Κατάσταση ουράς
4. Έξοδος
Επιλογή 1: Θα πληκτρολογούνται τα στοιχεία του αυτοκινήτου ̟πχ. ο αριθµός αυτοκινήτου 
και θα τοπ̟οθετείται στο τέλος της ουράς.
Επιλογή 2: Το αυτοκίνητο που βρίσκεται πρώτο στην ουρά θα διαγράφεται µαζί µε ένα
ανάλογο µήνυµα επιβεβαίωσης.
Επιλογή 3: Θα εµφανίζονται µε τη σειρά οι αριθµοί των αυτοκινήτων που παραµένουν στην
ουρά για να εξυπηρετηθούν.
Επιλογή 4: Το πρόγραµµα θα τερµατίζεται. 
 */
import java.io.IOException;
import java.util.Scanner;

public class CarLinkedQueueManagement 
{  
    public static void main(String args[]) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        //Αντικείμενο τύπου LinkedQueue (Ουρά με Συνδεδεμένη Λίστα)
        LinkedQueue carLinkedQueue=new LinkedQueue();
        String licence,brand,color,owner;
        int choice; 
        Car aCar;   
        //Menu
        do     
        {
            System.out.println("************************");
            System.out.println(" CAR MANAGEMENT PROGRAMM:");
            System.out.println("************************\n");  
            System.out.println("***** MAIN MENU *****");
            System.out.println("1. CAR ARRIVAL");
            System.out.println("2. CAR DEPARTURE");
            System.out.println("3. CARS WAITING");
            System.out.println("4. END PROGRAMM");
            
            System.out.println("CHOOSE FROM 1-4: ");
            choice=scan.nextInt();
            switch (choice) 
            {
                case 1: 
                    System.out.println("***** Give the Elements of your Car *****");
                    System.out.println("Input Licence: ");
                    licence=scan.nextLine();
                    System.out.println("Input Brand: ");
                    brand=scan.nextLine();
                    System.out.println("Input Color: ");                    
                    color=scan.nextLine();
                    System.out.println("Input Owner: ");
                    owner=scan.nextLine();
                    aCar=new Car(licence,brand,color,owner);
                    try {
                        carLinkedQueue.enqueue(aCar);
                        System.out.println("System: CAR ARRIVAL - OK");
                    }
                    catch(QueueFullException ex) {
                        System.out.println(ex);
                    }   
                    break;
                case 2:
                    try {
                        aCar=(Car)carLinkedQueue.dequeue();
                        System.out.println("System: CAR DEPARTURE - OK");
                    }
                    catch(QueueEmptyException ex) {
                        System.out.println(ex);
                    }   
                    break;
                case 3:
                    if(!carLinkedQueue.isEmpty())
                    {
                        int size=carLinkedQueue.size();
                        for(int i=0;i<size;i++)
                        {
                            System.out.println(carLinkedQueue.front());
                        }
                    } 
                    else
                        System.out.println("There are no cars waiting!!");
                break;
                default:
                    System.out.println("************ THE END ************");
                    break;
            }
        } while(choice!=0);
     }
}

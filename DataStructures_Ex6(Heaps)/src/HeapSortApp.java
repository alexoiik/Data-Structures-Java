//Main class για την ταξινόμηση των δεδομένων ενός Σωρού(Heap) σε πίνακα.
//Με χρήση μίας Μεθόδου εντός της Main class: public static boolean heapSort(Object[] array)
public class HeapSortApp 
{
    public static boolean heapSort(Object[] array)
    {
        Heap TransferHeap = new Heap(20); //Με χρήση ArrayList βάζω:  AL_Heap<Integer> myHeap = new AL_Heap<>();
        
        try {
            for(int i=0;i<array.length;i++)
                TransferHeap.insert(array[i]);
            int size=TransferHeap.size();
            for(int i=size-1;i>=0;i--)
                array[i]=TransferHeap.remove();
            return true;
        } 
        catch(HeapFullException Error) {
            System.out.println("Array is Full / Unable To Sort");
            return false;
        }
    }
    
    public static void main(String args[])
    {
        String matrix2[] ={"Kostas","Nikos","Yannhs","Anna","Ioulia","Stelios",
            "Andreas","Dimitris","Panos","Eleni","Katerina"};
        
        System.out.println("#### UNORDERED ARRAY ####");
        for(int i=0;i<matrix2.length;i++)
            System.out.println(matrix2[i]);
        
        if(heapSort(matrix2))
        {
            System.out.println("\n#### SORTED ARRAY ####");
            for(int i=0;i<matrix2.length;i++)
                System.out.println(matrix2[i]);
        }
    }
}

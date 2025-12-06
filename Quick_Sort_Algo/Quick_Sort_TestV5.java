/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV5
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        int length = list.length;
        
        quickSplit(list, length);
    }
    
    public static void quickSplit(int[] list, int length)
    {
        if (list.length < 2) {
            return;
        }
        
        int middle = length / 2;
        // adds the amount for a list
        int bigCount = 0;
        int smallCount = 0;
         
        // calculate the length for each of the new arrays
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > middle)
            {
                bigCount++;
            }
            else if (list[i] < middle)
            {
                smallCount++;
            }
            else if(list[i] == middle)
            {
                System.out.println(list[i]+" is Equal");
            }
        }
        
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        
        int bigger = 0;
        int smaller = 0;
        
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > length)
            {
                System.out.println(list[i]+" is Bigger");
                big[bigger] = list[i];
                bigger++;
            }
            else if (list[i] < length)
            {
                System.out.println(list[i]+" is Smaller");
                small[smaller] = list[i];
                smaller++;
            }
        }
        
        quickSplit(big, length);
        quickSplit(small, length);
        
        
        quickSort(list, big, small);
    }
    
    public static void quickSort(int[] list, int[] big, int[] small)
    {
        /*
        // More arrays
        int [] sortedSmall = {smallCount};
        int [] sortedBig = {bigCount};
        
        int [] finalList = {sortedSmall.length + 1 + sortedBig.length};
        */
    }
}
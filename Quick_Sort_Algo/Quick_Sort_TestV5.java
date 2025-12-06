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
        //int length = list.length;
        
        quickSplit(list);
    }
    
    public static void quickSplit(int[] list)
    {
        if (list.length < 2) {
            return;
        }
        
        int middle = list[list.length/2];
        // adds the amount for a list
        int bigCount = 0;
        int smallCount = 0;
        int equalCount = 0;
        
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
                equalCount++;
            }
        }
        
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        int[] equal = new int [equalCount];
        
        int bigger = 0;
        int smaller = 0;
        int equalIndex = 0;
        
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > middle)
            {
                System.out.println(list[i]+" is Bigger");
                big[bigger] = list[i];
                bigger++;
            }
            else if (list[i] < middle)
            {
                System.out.println(list[i]+" is Smaller");
                small[smaller] = list[i];
                smaller++;
            }
            else if(list[i] == middle) 
            {
                System.out.println(list[i]+" is Equal");
                equal[equalIndex] = list[i];
                equalIndex++;
            }
        }
        
        quickSplit(big);
        quickSplit(small);
        
        
        //quickSort(list, big, small);
    }
    
    public static void quickSort(int[] list, int[] big, int[] small)
    {
        /*
        // More arrays
        int [] sortedSmall = {smallCount};
        int [] sortedBig = {bigCount};
        
        int [] finalList = {sortedSmall.length + equal(prob need fixing) + sortedBig.length};
        */
    }
}
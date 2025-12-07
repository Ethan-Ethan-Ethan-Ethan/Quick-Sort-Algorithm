/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort
{
    public static void main(String[] args) 
    {
        // Create a list to be sorted
        int[] list = {4,9,6,7,5,8,3,1,2};
        // Peform the Quick Sort task
        quickSplit(list);
        
        // Print out all of the elements within the newly sorted list
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static void quickSplit(int[] list)
    {
        // Return only when the length of the list is 0 or 1 (already sorted)
        if (list.length < 2) {
            return;
        }
        
        // Calculate the middle value of the list (Pivot)
        int middle = list[list.length/2];
        // Used to count each element for the new arrays (smaller, equal, bigger)
        int bigCount = 0;
        int smallCount = 0;
        int equalCount = 0;
        
        // Calculate the length for each of the new arrays
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
                equalCount++;
            }
        }
        
        // Create new arrays that will be used to categorized each element (smaller, equal, larger)
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        int[] equal = new int [equalCount];
        
        // Used to track the index to fill the new arrays
        int bigger = 0;
        int smaller = 0;
        int equalIndex = 0;
        
       // Sort each value into it's correct group (smaller, equal, bigger)
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > middle)
            {
                big[bigger] = list[i];
                bigger++;
            }
            else if (list[i] < middle)
            {
                small[smaller] = list[i];
                smaller++;
            }
            else if(list[i] == middle) 
            {
                equal[equalIndex] = list[i];
                equalIndex++;
            }
        }
        
        // Used to sort left and right
        quickSplit(small);
        quickSplit(big);
        
        // Used to store all the three array's elements back into the original list
       int index = 0;
       
       // Put the new sorted array into the original list
       for(int i = 0; i < small.length; i++) 
       {
           list[index] = small[i];
           index++;
        }
        for(int i = 0; i < equal.length; i++) 
       {
           list[index] = equal[i];
           index++;
        }
        for(int i = 0; i < big.length; i++) 
       {
           list[index] = big[i];
           index++;
        }
    }
}
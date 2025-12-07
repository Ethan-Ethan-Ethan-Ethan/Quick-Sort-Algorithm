/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV6
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        
        quickSplit(list);
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
        System.out.println("\n");
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
        
        quickSplit(small);
        quickSplit(big);

       int index = 0;
       
       // copy sorted array into new array
       for(int i = 0; i < small.length; i++) 
       {
           list[index] = small[i];
           System.out.println("Array S " + list[index]);
           index++;
        }
        for(int i = 0; i < equal.length; i++) 
       {
           list[index] = equal[i];
           System.out.println("Array M " + list[index]);
           index++;
        }
        for(int i = 0; i < big.length; i++) 
       {
           list[index] = big[i];
           System.out.println("Array B " + list[index]);
           index++;
        }
    }
}
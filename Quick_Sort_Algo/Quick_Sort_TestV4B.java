/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV4B
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,3,1,2};
        int length = list.length;
        
        quickSplit(list, length);
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i]);        
        }
    }
    
    public static void quickSplit(int[] array, int length)
    {
        if (array.length <= 1) 
        {
            return;
        }
           
        int middle = array[array.length/2];
        
        // adds the amount for a list
        int bigCount = 0;
        int smallCount = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > middle)
            {
                bigCount++;
            }
            else if (array[i] < middle)
            {
                smallCount++;
            }
            else if(array[i] == middle)
            {
                //System.out.println(array[i]+" is Equal");
            }
        }
        
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        
        int bigger = 0;
        int smaller = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > middle)
            {
                //System.out.println(array[i]+" is Bigger");
                big[bigger] = array[i];
                bigger++;
            }
            else if (array[i] < middle)
            {
                //System.out.println(array[i]+" is Smaller");
                small[smaller] = array[i];
                smaller++;
            }
            else if(array[i] == middle) 
            {
                //System.out.println(array[i]+" is Equal");
            }
        }
        
        System.out.println("Running 1");
        quickSplit(big, middle - 1);
        System.out.println("Running 2");
        quickSplit(small, length - middle);
        
        //for(int i = 0; i < small.length; i++)
        //{
            //System.out.print(small[i]);
        //}
        
        System.out.println("Sorting");
        quickSort(array, big, small);
    }
    
    public static void quickSort(int[] array, int[] big, int[] small)
    {
        int smallLength = small.length;
        int bigLength = big.length;
        
        int index = 0;
        int s_index = 0;
        int b_index = 0;
        while (index < smallLength && s_index < bigLength) 
        {
            if (small[index] <= big[index]) 
            {
                array[b_index] = small[index];
                b_index++;
                index++;
            }
            else 
            {
                array[b_index] = big[s_index];
                b_index++;
                s_index++;
            }
        } 
    }
}
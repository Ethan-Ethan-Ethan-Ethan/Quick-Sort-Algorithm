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
        int[] list = {4,9,6,7,5,8,3,1,2};
        int length = list.length;
        
        quickSplit(list, length);
        
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i]);        
        }
    }
    
    public static void quickSplit(int[] list, int length)
    {
        if (length < 2) {
            return;
        }
           
        int middle = list[list.length/2];
        
        // adds the amount for a list
        int bigCount = 0;
        int smallCount = 0;
        
        for(int i = 0; i < length; i++)
        {
            if(list[i] > middle)
            {
                bigCount++;
            }
            else if(list[i] == length){}
            else 
            {
                smallCount++;
            }
        }
        
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        
        int bigger = 0;
        int smaller = 0;
        
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
            }
        }
        
        quickSplit(big, middle);
        quickSplit(small, length - middle);
        
        quickSort(list, big, small);
    }
    
    public static void quickSort(int[] list, int[] big, int[] small)
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
                list[b_index] = small[index];
                b_index++;
                index++;
            }
            else 
            {
                list[b_index] = big[s_index];
                b_index++;
                s_index++;
            }
        }
    }
}
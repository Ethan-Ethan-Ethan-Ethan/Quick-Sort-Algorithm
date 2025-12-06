/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV4
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
        
        int[] big = new int[middle];
        int[] small = new int[length - middle];
        
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
        
    }
}
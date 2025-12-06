/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV3
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        
        quickSearch(list);
    }
    
    public static int quickSearch(int[] list)
    {
        /*
        // Recursion (Not working)
        if (list.length <= 1) 
        {
            return list;
        }
       */
      
       int number = list[list.length/2];
        // adds the amount for a list
        int bigCount = 0;
        int smallCount = 0;
         
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > number)
            {
                bigCount++;
            }
            else if (list[i] < number)
            {
                smallCount++;
            }
            else if(list[i] == number)
            {
                System.out.println(list[i]+" is Equal");
            }
        }
        
        // arrays
        int[] big = new int[bigCount];
        int[] small = new int[smallCount];
        
        int bigger = 0;
        int smaller = 0;
        
        for(int i = 0; i < list.length; i++)
        {
            if(list[i] > number)
            {
                System.out.println(list[i]+" is Bigger");
                big[bigger] = list[i];
                bigger++;
            }
            else if (list[i] < number)
            {
                System.out.println(list[i]+" is Smaller");
                small[smaller] = list[i];
                smaller++;
            }
        }
        
        System.out.println(" ");
        for(int i = 0; i < small.length; i++)
        {
            System.out.print(small[i]);
        }
        System.out.println(" ");
        for(int i = 0; i < big.length; i++)
        {
            System.out.print(big[i]);
        }
        System.out.println(" ");
        
        // More arrays
        int [] sortedSmall = {smallCount};
        int [] sortedBig = {bigCount};
        
        int [] finalList = {sortedSmall.length + 1 + sortedBig.length};
        
        return number;
    }
}
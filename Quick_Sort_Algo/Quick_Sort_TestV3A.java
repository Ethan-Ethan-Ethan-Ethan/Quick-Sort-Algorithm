/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_TestV3A
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        
        //int [] finalList = {};
        
        quickSearch(list);
    }
    
    public static int quickSearch(int[] list)
    {
        if (list.length <= 1) 
        {
            return list;
        }
        
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
                
                // System.out.println(big[i]);
                // System.out.println("Index " + i);
                
                bigger++;
            }
            else if (list[i] < number)
            {
                System.out.println(list[i]+" is Smaller");
                small[smaller] = list[i];
                
                // System.out.println(small[i]);
                // System.out.println("Index " + i);
                
                smaller++;
            }
        }
        
        
        System.out.println(" ");
        for(int i = 0; i < small.length; i++)
        {
            System.out.print(small[i]); // prints 400000312 
            // (Numbers are located based off of original index, meaning 0 is just a filler)
        }
        System.out.println(" ");
        for(int i = 0; i < big.length; i++)
        {
            System.out.print(big[i]); // prints 096708000 
            // (Numbers are located based off of original index, meaning 0 is just a filler)
        }
        System.out.println(" ");
        
        return number;
    }
}
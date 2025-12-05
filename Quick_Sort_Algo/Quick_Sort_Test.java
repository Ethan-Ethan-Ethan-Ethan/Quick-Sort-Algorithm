/**
 * Write a description of class Quick_Sort_Test here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort_Test
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        int number = 0;
        
        quickSearch(list, number);
    }
    
    public static int quickSearch(int[] list, int number)
    {
        int[] small = new int[9];
        int[] big = new int[9];
        
        number = list[list.length/2];
        
        int bigCount = list.length - 1;
        int smallCount = 0;
         
        for(int i = 0; i < list.length; i++)
        {
            //System.out.print(list[i]);
            if(list[i] > number)
            {
                System.out.println(list[i]+" is Bigger");
                big[bigCount] = list[i];
                
                // System.out.println(big[i]);
                // System.out.println("Index " + i);
                
                bigCount--;
            }
            else if(list[i] == number)
            {
                System.out.println(list[i]+" is Equal");
            }
            else if (list[i] < number)
            {
                System.out.println(list[i]+" is Smaller");
                small[smallCount] = list[i];
                
                // System.out.println(small[i]);
                // System.out.println("Index " + i);
                
                smallCount++;
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

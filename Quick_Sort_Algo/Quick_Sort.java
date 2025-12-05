/**
 * Write a description of class Quick_Sort here.
 *
 * @ Aidan, Liam, and Lorne.
 * @ Dec 2 - #, 2025.
 */
public class Quick_Sort
{
    public static void main(String[] args) 
    {
        int[] list = {4,9,6,7,5,8,3,1,2};
        int number = 0;
        
        quickSearch(list, number);
    }
    
    public static int quickSearch(int[] list, int number)
    {
        int[] small = {0,0,0,0,0,0,0,0,0};
        int[] big = {0,0,0,0,0,0,0,0,0};
        
        number = list[list.length/2];
         
        for(int i = 0; i < list.length; i++)
        {
            //System.out.print(list[i]);
            if(list[i] > number)
            {
                System.out.println(list[i]+" is Bigger");
                big[i] = list[i];
                System.out.println(big[i]);
            }
            else if(list[i] == number)
            {
                System.out.println(list[i]+" is Equal");
            }
            else
            {
                System.out.println(list[i]+" is Smaller");
                small[i] = list[i];
                System.out.println(small[i]);
            }
        }
        
        for(int i = 0; i < small.length; i++)
        {
            System.out.print(small[i]);
        }
        
        System.out.println(" ");
        
        return number;
    }
}
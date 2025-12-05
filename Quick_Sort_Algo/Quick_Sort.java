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
        
        /*
        System.out.println(list);
        number = list.length - 1;
        for(int i = 1; i < list.length; i++)
        {
            if(number <= (list.length - i))
            {
                System.out.println(list);
            }
        }
        return number;
        */
        
        number = list[list.length/2];
         
        for(int i = 0; i < list.length; i++)
        {
            //System.out.print(list[i]);
            if(list[i] > number)
            {
                System.out.println(list[i]+" is Bigger");
                list[i] = small[i];
                //System.out.println("s" + small[i] + "q" + list[i]);
            }
            else if(list[i] == number)
            {
                System.out.println(list[i]+" is Equal");
                
            }
            else
            {
                System.out.println(list[i]+" is Smaller");
                list[i] = big[i];
            }
        }
        
        return number;
    }
}
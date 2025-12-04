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
        
       //int index = list.length/2;
       number = list[list.length/2];
       System.out.println(number);
       
       return number;
    }
}
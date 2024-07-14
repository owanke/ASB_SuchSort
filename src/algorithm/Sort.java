package algorithm; 
import java.util.*;
public class Sort
{
     
    public static void bubbleSort(int[] list)
    {
        
    }
    public static void bubbleSort(int[] list, int leftIdx, int rightIdx)
    {
        
    } 
    
    public static void bubbleUp(int[] list, int leftIdx, int i)
    {
        swap(list, max(list, leftIdx,i),i);
    }
    
    private static int max(int[] list, int leftIdx, int i)
    {
        int maxNum=0;
        int maxPos=0;
        int l=0;
        for (l=leftIdx; l<=i; l++) 
        {
            if (list[l] > maxNum)
            {
                maxNum = list[l];
                maxPos = l;
            }
             
        }
        return maxPos; // todo
    }
    
    public static void quickSort(int[] list)
    {
        
    }
    public static void quickSort(int[] list, int leftIdx, int rightIdx)
    {
        
    } 
    
    public static int divide(int[] list, int leftIdx, int rightIdx)
    {
        return 0; // todo
    }
    
    public static void swap(int[] list, int i, int j)
    {
        if (i>list.length-1 || j>list.length-1 || i<0 || j<0)
        {
            throw new IllegalArgumentException("arguments our of range");
        }
        
       
        int temp = list[j];
        list[j] = list[i];
        list[i]= temp;
    }
    
    public static String toString(int[] list, int start, int end)
    {
        String returnString = new String();

        if (start>end || end>list.length-1 || start<0 || end<0)
        {
            throw new IllegalArgumentException("arguments our of range");
        }
        
        for (int i=start; i<= end;i++)
        {
            returnString =  returnString + list[i] + ";";
        }
         
        return returnString;
    }
    
    public static String toString(int[] list)
    {
        String returnString = new String();
        returnString = toString(list, 0, list.length);
        return returnString;
    }
}
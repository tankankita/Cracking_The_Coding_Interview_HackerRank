import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {




    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

    int numberOfSwaps=0;
     int x=0;

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n - 1; j++)
        {
             if (a[j] > a[j + 1])
            {
                 x=swap(a,j, j + 1,x);
                numberOfSwaps++;
            }
        }

        if (numberOfSwaps == 0)
            break;

    }
        System.out.println("Array is sorted in "+ x+  " swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[a.length-1]);
    }

    public static int swap(int[] a, int a1,int a2,int y)
    {
        y++;
        int temp = a[a1];
        a[a1] = a[a2];
        a[a2] = temp;
        return y;
    }
}



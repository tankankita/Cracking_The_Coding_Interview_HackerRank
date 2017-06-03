import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{

    public static String deletechar(String a,int index)
        {
        String result = a.substring(0, index) + a.substring(index+1);
        return result;
    }


    public static int numberNeeded(String first, String second)
    {
        int count=0;
        int val=0;
        String a="";
        String b="";

        if (first.length() > second.length())
            {
             a=first;
             b=second;
        }
        else
            {
            a=second;
            b=first;
        }


        for(int i=0; i<b.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(b.charAt(i) == a.charAt(j))
                {

                    count+=2;
                    a=deletechar(a,j);
                    break;
                }

            }

        }

        val = (first.length() + second.length()) - count;
      return val ;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}



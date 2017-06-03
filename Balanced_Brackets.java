import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static String deletelastbracket(String temp)
    {
        return temp.substring(0,temp.length()-1);
    }

    public static boolean isBalanced(String expression)
    {
      String temp="";
        int i=0;
        int t=0;
        for(i=0;i<expression.length();i++)
        {
            if(expression.charAt(i)=='{' || expression.charAt(i)=='[' || expression.charAt(i)=='(' )
            {
                temp+= expression.charAt(i);
                t++;

            }
            else if ((expression.charAt(i)==']') || expression.charAt(i)=='}' || expression.charAt(i)==')')
            {

                if(t==0)
                    {
                    return false;
                }
                    if( (expression.charAt(i)==']') && (temp.charAt(temp.length()-1)=='[') )
                    {
                       t--;
                       temp=deletelastbracket(temp);
                    }
                    else if( (expression.charAt(i)==')') && (temp.charAt(temp.length()-1)=='(') )
                    {

                       t--;
                                      temp=deletelastbracket(temp);
                    }
                    else if( (expression.charAt(i)=='}') && (temp.charAt(temp.length()-1)=='{') )
                    {

                        t--;
                       temp=deletelastbracket(temp);
                    }
            }
        }

        if(temp.length() ==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}




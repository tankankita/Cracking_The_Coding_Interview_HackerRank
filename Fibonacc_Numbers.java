import java.util.*;

public class Solution {


    public static int fibonacci(int n)
    {
        if (n==0)
            return 0;
        else if (n==1)
            return 1;

        int a =0;
        int b=1;
        int c=0;
        int i=2;
        for (i=2;i<n+1;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }

        return c;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}




public class Solution {


    static int i=0;
        static int j=0;
    static int counter=0;

    public static void addinString(String[] a,String contactname,int index)
        {
        a[i]=contactname;
        i++;
    }

     public static void findcontact(String[] a,String checkname)
        {
         String check="";
            for(j=0;j<i;j++)
                {
                 check=a[j];
                    if(check.startsWith(checkname))
                        {
                         counter++;
                    }
            }

        System.out.println(counter);
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] contactlist=new String[n];
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add"))
                {
              addinString(contactlist,contact,n);
            }
            else if(op.equals("find"))
                {
                findcontact(contactlist,contact);
                counter=0;
            }

        }
    }
}

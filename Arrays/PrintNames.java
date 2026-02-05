
package Arrays;
import java.util.*;


public class PrintNames
{
    public static void main(String args[])
    {
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] names= new String[n];


        System.out.println("Enter the names");
        for(int i=0;i<n;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("The names are : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(names[i]);
        }
    }
}
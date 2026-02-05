package Arrays;
import java.util.*;

public class Order {
    public static void main(String args[])
    {
        System.out.println("Enter size of array");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter values in array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                flag=true;
                break;
            }
        }
        if(flag==true)
            System.out.println("The array is not in ascending order");
        else
            System.out.println("The array is in ascending order");
    }
}

package Arrays;
import java.util.*;

public class MaxMin {
    public static void main(String args[]){
        System.out.println("Enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter the numbers in array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The minimum number is "+ arr[0]);
        System.out.println("The maximum number is "+ arr[n-1]);
    }
}

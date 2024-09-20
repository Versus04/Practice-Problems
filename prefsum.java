/**
 * prefsum
 */
import java.util.*;
public class prefsum {
    static int Equ_sum(int[] arr , int n )
    {

        int sum = 0;
        for(int x : arr)
        {
            sum+=x;
        }
        int prefix_sum = 0;
        int eq = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
        {
            prefix_sum += arr[i]; 
            
            if (prefix_sum == sum){
                eq = Math.max(eq, prefix_sum); }
            sum -= arr[i];
        }
        
        return eq;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i  = 0 ; i < n ; i++)
        {
            arr[i]=  sc.nextInt();
        }
        System.err.println(Equ_sum(arr,n));
    }
}
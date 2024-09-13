import java.util.*;
public class Rotation {
   static int[] block_swap(int[] arr , int n , int k ){
    if(k==0)return arr;
        int res[] = new int[n];
    for(int i = 0; i<n ; i++){
    //left rotation
        res[i] = arr[(i+k)%n];
    //for right rotation
        //res[i] = arr[(n-k+i)%n];
    
    }
    return res;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[] = new int[n];
        int k  = sc.nextInt();
        for(int i = 0 ; i <n ;i++){
            arr[i] = sc.nextInt();
        }
        arr = block_swap(arr , n , k);
        for(int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

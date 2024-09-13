import java.util.*;
public class maxproductsubarrar {
   static int maximumsubarray(int[] arr , int n ){
        int[] answer = new int[n];
        int p = 1  , s=1;
        int sub_prod= 0 ;
        for(int i = 0  ; i< n ; i++ ){
            if(p==0){
                p=1;
            }
            if(s==0){
                s=1;

            }
            p=p*arr[i];
            s=s*arr[n-i-1];
            sub_prod = Math.max(p,s);
        }
        return sub_prod;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumsubarray(arr,n));

    }
}

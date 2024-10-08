import java.util.*;
public class simplesieve {

    static void sieve(int n){
        int count = 0;
        boolean[] sieve = new boolean[n+1];
        sieve[0]=sieve[1]=false;
        for(int i = 2; i< n ;i++){
            sieve[i]=true;
        }

        for(int i = 2; i<Math.sqrt(n) ;i++){
            if(sieve[i]){
                for(int j = i*i;j<n; j+=i){
                    sieve[j]=false;
                }
            }
        }
        for(int i = 2; i< n ;i++){
            if (sieve[i]) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println("The number of prime numbers are "+count);

        
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.close();
        sieve(n);
        
        
    
    }
}
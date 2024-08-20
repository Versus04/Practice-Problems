import java.util.*;
public class simplesieve {

    static void sieve(int n){
        boolean[] sieve = new boolean[n+1];
        sieve[0]=sieve[1]=false;
        for(int i = 2 ; i<sieve.length;i++){sieve[i]=true;}
        for(int i = 2 ; i<sieve.length; i++){
            if (sieve[i]) {
                for(int j = i*i ; j<=sieve.length ;j+=i){
                    sieve[j] = false ; 

                }
            }
        }
    for(int i = 2; i<sieve.length;i++){
        if(sieve[i])System.out.println(i);
        ;}

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sieve(n);
        
    
    }
}
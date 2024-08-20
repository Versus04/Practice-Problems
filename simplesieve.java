import java.util.*;
public class simplesieve {

    static void sievecount(int n , int k){
        int count = 0;
        boolean[] sieve = new boolean[n+1];
        sieve[0]=sieve[1]=false;
        for(int i = 2 ; i<sieve.length;i++){sieve[i]=true;}
        for(int i = 2 ; i<sieve.length; i++){
            if (sieve[i]) {
                for(int j = i*i ; j<sieve.length ;j+=i){
                    sieve[j] = false ; 

                }
            }
        }
            for(int i =2 ;i<sieve.length ; i++){
                if(sieve[i]){
                    count++;
                    if(count==k){System.out.println(i); break;}
                }

            }

            for(int i =2 ; i<sieve.length ; i++){
                for(int j = i+1 ; j<sieve.length;j++){
                        if(sieve[i] && sieve[j] && (j-i==2)){System.out.println( "(" +i +"," + j + ")");}
                }
            }
       

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sievecount(n  , 10);
        
    
    }
}
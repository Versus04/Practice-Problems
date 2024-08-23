import java.util.ArrayList;

public class segmentedsieve {
    static int n =100000;
    static boolean[] sieve = new boolean[n+1];

    static void sieve(){

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
       
        
            
       

    }
    static ArrayList<Integer> generatePrime(int high){
        ArrayList<Integer> ll = new ArrayList<>();
        
        for(int i =2 ;i<Math.sqrt(high) ;i++){
            if(sieve[i])
            {
                ll.add(i);
            }
        }
            
    return ll;
    }
   public static void main(String[] args) {
        int high = 130;
        int low = 110 ;
        sieve();
        ArrayList<Integer> lll = generatePrime(high);
        boolean[] dummy = new boolean[high-low+1];
        for(int i = 0; i<dummy.length; i++){
            dummy[i]=true;
        }
        for(int i: lll){
            int first = (low/i)*i;
            if(first<low){first+=i;}
            for(int j = Math.max(first, i*i) ; j<high;j+=i){
                    dummy[j-low]=false;

            }
        }
   for(int i = low ; i<high ;i++){
    if(dummy[i-low]){System.out.println(i);}
   }
    }
}

/**
 * eulers
 */
public class eulers {

    static int gcd(int a , int b ){
        if(a==0)return b ;
        return gcd(b%a, a);
    }

    static void eulerphi(int n ){
        for(int i = 1 ; i< n  ;i++){
            if(gcd(i, n)==1)System.out.println(i);
        }
    }
    public static void main(String[] args) {
        eulerphi(10);
    }
}
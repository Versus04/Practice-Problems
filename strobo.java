import java.util.HashMap;
import java.util.Scanner;

public class strobo {
    static boolean strobonum(String s ){
            HashMap<Character , Character> h = new HashMap<>();
            h.put('0', '0');
            h.put('1', '1');
            h.put('8', '8');
            h.put('9', '6');
            h.put('6', '9');

            int n = s.length();

            for(int i= 0, j=n-1 ; i<n  ;i++ , j--){ 

                char left = s.charAt(i);
                char right = s.charAt(j);
                char m = h.getOrDefault(left,'-');
                if(m=='-')return false;
                if(m!=right)return false;

            }
            return true;


        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if(strobonum(s)){System.out.println( s +" is a strobo grammatic number");}
        else { System.out.println(s + " is not a strobo grammatic number");}
    }
    
}



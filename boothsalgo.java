import java.util.*;
public class boothsalgo {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);    
        int m1 = sc.nextInt();

        int m2 = sc.nextInt();
        
        int n = Integer.toBinaryString(m1).length();
        int p = 0;
        sc.close();
        for(int i = 0 ; i<n;i++)
        {
            int unit = (m1&0b1);
            if (unit==1) {
                p=p+m2;
            }
        m1 = m1>>1;
        m2=m2<<1;
        

        }
        System.out.println(p);
    }
    
}

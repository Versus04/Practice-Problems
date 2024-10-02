import java.util.Scanner;
import java.util.TreeMap;

public class sortpalindrome {
    static String lexit(TreeMap<Character , Integer> le_pa)
{
    int count =0;
    for(Map.Entry<Character , Integer> e : le_pa )
    {
        
    }
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        TreeMap<Character , Integer>le = new TreeMap<>();
        char[] c =s.toCharArray();
        for(char ele :c)
        {
            le.put(ele , le.getOrDefault(ele,0)+1);
        }
    }   
}

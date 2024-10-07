import java.util.*;
public class Weighted_Substring
{ 
    static int weighted_substring(String s,String t,int k , int n){
        HashSet<String> S= new HashSet<String>();
        for(int i =0;i<n;i++){
            int sum=0;
            String str="";
            for(int j=i;j<n;j++){
                int pos=s.charAt(j)-'a';
                sum=sum+ t.charAt(pos)-'0';
                str+=s.charAt(j);
                if(sum<=k){
                    S.add(str);
                }
                else{
                    break;
                }
            
        }}
        return S.size();
        
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		String t= sc.next();
		int k= sc.nextInt();
		int n=s.length();
		System.out.print(weighted_substring(s,t,k,n));
		
	}
}
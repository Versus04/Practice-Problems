public class binary {
    public static String toBinary(int number) {
        StringBuilder binary = new StringBuilder();
        
        if (number == 0) {
            return "0";
        }
        
        while (number > 0) {
            int remainder = number % 2;
            binary.append(remainder);
            number = number / 2;
        }
        
        return binary.reverse().toString();
    }
    static boolean palindrome(int N){

        String s =Integer.toBinaryString(N);
        int i = 0 , j = s.length()-1;
        while (i<j) {
            if (s.charAt(i)!=s.charAt(j)) {
                return false ;
                
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(palindrome(2));
    }
    
}

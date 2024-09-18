import java.util.Scanner;
import java.util.Stack;

public class leader {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        for(int i = n-2 ; i >= 0 ; i--)
        {
            if(arr[i] > st.peek())
            {
                st.push(arr[i]);
            }
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop() + " ");
        }
    sc.close();
    }
}
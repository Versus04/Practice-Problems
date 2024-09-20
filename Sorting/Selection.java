package Sorting;

import java.util.Scanner;

public class Selection {
    static int[] SelectionSort(int[] arr , int n)
    {
        for(int i = 0 ; i < n ;i++)
        {
            int min = i;
            for(int j = i+1 ; j < n; j++) // Corrected increment variable from i to j
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;  
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = sc.nextInt();
        }
        arr = SelectionSort(arr ,n);
        for(int i : arr)
        {
            System.out.println(i);
        }
        sc.close(); // Close the scanner to avoid resource leak
    }
}

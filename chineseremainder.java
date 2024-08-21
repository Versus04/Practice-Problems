public class chineseremainder {

   

    static int findmin(int[] nums , int[] rem , int k){
        int x =1;
        while (true) {
            int j ;
            for( j = 0 ;j<k ;j++){
                if(x%nums[j]!=rem[j]){break;}
            }
            if(j==k)break;
            x++;
        }return x ; 
        
    }

    
    public static void main(String[] args) {
        int[] nums = {2,3,5};
        int[] rem = {5,2,1};
        System.out.println(findmin(nums,rem, nums.length));
    }
    
}

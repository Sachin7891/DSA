public class maxSubArray {
     static int maxSubArray(int[] nums) {
        //brutesforce opproch O(n^2) complexty
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<nums.length; i++){
        //     int currSum = 0;
        //     for(int j = i ; j<nums.length ; j++){
        //         currSum += nums[j];
        //         max = Math.max(currSum , max);
        //     }
        // } 
        // return max;
        




        // optimized technic  in O(n) complexity with cuddels opproch


        // int currSum = 0;
        // int maxSum = nums[0];

        // for (int num : nums) {
        //     currSum = Math.max(num , currSum + num);
        //     maxSum = Math.max(maxSum, currSum);
        // }
        // return maxSum;


//other opproch

        int sum=0;
        int largest=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            largest=Math.max(largest, sum);
        if(sum<0){
            sum=0;
        }
        }
        return largest;

    }
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

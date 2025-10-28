class Solution {
    public double findMaxAverage(int[] nums, int k) {
       if(nums == null || nums.length == 0){
        return 0d;
       }
        int ksum = 0;
        for(int i = 0; i < k ; i++){
            ksum += nums[i];
        }
        int maxsum = ksum;
        for(int i=k ; i < nums.length ; i++){
            ksum += nums[i] - nums[i-k];
            maxsum = Math.max(ksum , maxsum);
        }
       return maxsum/(double) k;
    }
}
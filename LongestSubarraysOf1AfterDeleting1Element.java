class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int left = 0;
        int k = 1;
        for(int right=0 ; right<nums.length ; right++){
            if(nums[right] == 0){
                if(k==0){
                    while(left<right && nums[left]!=0){
                        left++;
                    }
                    left++;
                }
                else{
                    k=0;
                }
            }
            res=Math.max(res,right-left+1);
        }
        return res-1;
    }
}
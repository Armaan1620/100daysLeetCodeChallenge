class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] right = new int[len];
        int prod=1;
        for(int i=len-1; i >=0 ; i--){
            prod = prod*nums[i];
            right[i] = prod;
        }
        int left = 1;
        int[] ans = new int[len];
        for(int i = 0 ; i < len-1 ; i++){
            int value = right[i+1]*left;
            ans[i] = value;
            left = left * nums[i];
        }
        ans[len-1] = left;
        return ans;
    }
}
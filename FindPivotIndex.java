class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i:nums){
            total+=i;
        }
        int l = 0;
        for(int r=0 ; r<nums.length ; r++){
            if(l == total-l-nums[r]) return r;
            l+=nums[r];
        }
        return -1;
    }
}
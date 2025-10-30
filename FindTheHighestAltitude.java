class Solution {
    public int largestAltitude(int[] gain) {
        int[] sum = new int[gain.length+1];
        sum[0] = 0;
        int max = 0;
        for(int i=0 ; i<gain.length ; i++){
            sum[i+1] = gain[i] + sum[i];
            if(sum[i+1] > max) max = sum[i+1];
        }
        return max;
    }
}
class Solution {
    public void moveZeroes(int[] arr) {
        int p=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[p]=arr[i];
                p++;
            }
        }

        while(p<arr.length)
        {
            arr[p]=0;
            p++;
        }
    }
}
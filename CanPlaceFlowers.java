class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int x = 0;
        int i = 0;
        while(i < flowerbed.length){
            if(flowerbed[i] == 0){
                if(i == flowerbed.length-1 || flowerbed[i+1] == 0){
                    x++;
                    i+=2;
                }
                else{
                    i+=3;
                }
            }
            else{
                i+=2;
            }
        }
        return (x>=n);
    }
}
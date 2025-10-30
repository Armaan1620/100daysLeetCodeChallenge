class Solution {
    public boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        char[] arr = s.toCharArray();
        int count = 0, max = 0;

        for(int i = 0;i < k;i++){
            if(isVowel(arr[i])){
                count++;
            }
        }
        max = count;
        for(int i = 1;i <= arr.length - k;i++){
            if(isVowel(arr[i - 1])){
                count--;
            }
            if(isVowel(arr[i + k - 1])){
                count++;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
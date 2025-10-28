class Solution {
    public int compress(char[] chars) {
        int pointer = -1;
        int count = 1;
        for(int i = 0 ; i < chars.length ; i++){
            if( i==chars.length-1 || chars[i] != chars[i+1]){
                chars[++pointer] = chars[i];
                if(count > 1){
                    for(char ch : Integer.toString(count).toCharArray()){
                    chars[++pointer] = ch;
                    }
                }
                 count = 1;
            }
           
            else{
            count++;
        }
        }
        return ++pointer;
    }
}
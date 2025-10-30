class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        if(word1.equals(word2)) return true;

        //has same number of occurences
        int[] occurenceMap1 = new int[26];
        int[] occurenceMap2 = new int[26];
        for(char ch: word1.toCharArray()) {
            occurenceMap1[ch-'a'] += 1;
        }
        
        for(char ch: word2.toCharArray()) {
            occurenceMap2[ch-'a'] += 1;
        }

        for(int i = 0; i < 26; i++) {
            if((occurenceMap1[i] == 0 && occurenceMap2[i] > 0) || (occurenceMap2[i] == 0 && occurenceMap1[i] > 0)) return false;
        }

        Arrays.sort(occurenceMap1);
        Arrays.sort(occurenceMap2);

        return Arrays.equals(occurenceMap1, occurenceMap2);
    }
}
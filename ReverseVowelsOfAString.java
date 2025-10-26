class Solution {
    private final boolean[] vowel = new boolean[128];

    public Solution() {
        char[] vowels = "aeiouAEIOU".toCharArray();
        for (int c : vowels)
            vowel[c] = true;
    }

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] str = s.toCharArray();

        while (left < right) {
            if (!vowel[str[left]])
                left++;
            else if (!vowel[str[right]])
                right--;
            else {
                char tmp = str[left];
                str[left] = str[right];
                str[right] = tmp;
                left++;
                right--;
            }
        }

        return new String(str);
    }
}
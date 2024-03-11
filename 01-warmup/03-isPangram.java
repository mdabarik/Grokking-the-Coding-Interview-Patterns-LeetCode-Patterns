class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] freqMap = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            int index = ch - 'a';
            freqMap[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqMap[i] == 0) return false;
        }
        return true;
    }
}
// TC: O(n + 26), SC: O(26)

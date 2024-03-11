class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (visited.contains(nums[i])) {
                return true;
            } else {
                visited.add(nums[i]);
            }
        }
        return false;
    }
} // TC: O(n), SC: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (seen.containsKey(comp)) {
                int j = seen.get(comp);
                return new int[]{j, i};
            }
            seen.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}

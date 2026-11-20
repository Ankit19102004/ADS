class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        for ( i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    nums[i] = nums[i + 1];
                }

            }
           
        }
         return i;

    }

}
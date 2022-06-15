import java.util.ArrayList;

/*
 * Two Sum problem from https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 * 
 * Assume each input has exactly one solution, and do not use the same element twice. Return the
 * answer as an int array of the two indices you found.
 * 
 */
class TwoSum {
    public static void main(String[] args) {
        System.out.println();
        /*
         * Example1:
         * 
         * Input: nums = [2,7,11,15], target = 9, Output: [0,1]
         * 
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        displayResult(nums1, target1);
        /*
         * Example 2:
         * 
         * Input: nums = [3,2,4], target = 6, Output: [1,2]
         * 
         */
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        displayResult(nums2, target2);
        /*
         * Example 3:
         * 
         * Input: nums = [3,3], target = 6, Output: [0,1]
         */
        int[] nums3 = {3, 3};
        int target3 = 6;
        displayResult(nums3, target3);
    }

    /**
     * display result
     * 
     * @param nums
     * @param target
     */
    private static void displayResult(int[] nums, int target) {
        // fill result array
        int[] result = twoSum(nums, target);

        // format display
        System.out.print("Input: ");
        displayIntArray(nums);

        System.out.printf(", Target: %d, Result: ", target);
        displayIntArray(result);

        System.out.println();
    }

    /**
     * find the 2 array elements that sum to target
     * 
     * @param nums
     * @param target
     * @return result int[index1, index2] or [0,0] if sum not found
     */
    public static int[] twoSum(int[] nums, int target) {
        // return values
        int[] retIA = {0, 0};

        // create ArrayList from data to access ArrayList methods
        ArrayList<Integer> al = new ArrayList<>(nums.length);
        for (int i : nums)
            al.add(i);

        int index = 0;
        for (int x : al) {
            // find element k such that x + k == target
            int partnerIndex = al.lastIndexOf(target - x);

            // can only use an element once
            if (partnerIndex >= 0 && index != partnerIndex) {
                retIA[0] = index;
                retIA[1] = partnerIndex;
                break;
            }
            index++;
        }
        return retIA;
    }

    /**
     * display elements of an int array
     * 
     * @param ia int[]
     */
    private static void displayIntArray(int[] ia) {
        System.out.print("[");
        for (int i = 0; i < ia.length; i++)
            System.out.printf(" %d", ia[i]);
        System.out.print(" ]");
    }
}

import java.util.ArrayList;

/*
 * Two Sum problem from https://leetcode.com/problems/two-sum/
 * 
 * Given an array of integers nums and an integer target, return indices of the two numbers such
 * that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may not use the same
 * element twice.
 * 
 * You can return the answer in any order.
 */
class TwoSum {
    public static void main(String[] args) {
        /*
         * Example1:
         * 
         * Input: nums = [2,7,11,15], target = 9 Output: [0,1]
         * 
         * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
         */
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        findAddend(nums1, target1);
        System.out.println();
        /*
         * Example 2:
         * 
         * Input: nums = [3,2,4], target = 6 Output: [1,2]
         * 
         */
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        findAddend(nums2, target2);
        System.out.println();
        /*
         * Example 3:
         * 
         * Input: nums = [3,3], target = 6 Output: [0,1]
         */
        int[] nums3 = {3, 3};
        int target3 = 6;
        findAddend(nums3, target3);
        System.out.println();
    }

    /**
     * find 2 array elements that sum to target
     * 
     * @param nums
     * @param target
     * @return result int[] with 2 array indexes
     */
    public static int[] twoSum(int[] nums, int target) {

        int[] retIA = {0, 0};

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++)
            al.add(nums[i]);

        int index = 0;
        for (var x : al) {
            // find element k such that x + k == target
            Integer partner = target - x;

            // can only use an element once
            int partnerIndex = al.lastIndexOf(partner);

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
     * display result
     * 
     * @param nums
     * @param target
     */
    private static void findAddend(int[] nums, int target) {
        int[] result = twoSum(nums, target);
        System.out.print("Input: ");
        displayIntArray(nums);
        System.out.printf(" Target: %d Result: ", target);
        displayIntArray(result);
        System.out.println();

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

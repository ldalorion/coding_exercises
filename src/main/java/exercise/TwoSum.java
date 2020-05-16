package exercise;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class TwoSum {

    public int[] bruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] myGarbageSolution(int[] nums, int target) {
        System.out.println("target: " + target);
        printIntArray(nums);
        for (int i =0; i<nums.length; i++) {
            if (i != nums.length-1) {
                System.out.println("nums[i]+nums[i+1] " + (nums[i]+nums[i+1]));
                if (target==(nums[i]+nums[i+1])) {
                    return new int[]{i, i+1};
                }
            } else {
                System.out.println("in the else block...");
                System.out.println("i: " + i);
                System.out.println("nums[i-1]+nums[i]" + (nums[i-1]+nums[i]));
                if (target==(nums[i-1]+nums[i])) {
                    return new int[]{i-1, i};
                }
            }
        }

        for (int i =0; i<nums.length; i++) {
            if (i != nums.length-1) {
                System.out.println("nums[i]+nums[i+1] " + (nums[i]+nums[i+1]));
                if (target==(nums[i]+nums[i+1])) {
                    return new int[]{i, i+1};
                }
            } else {
                System.out.println("in the else block...");
                System.out.println("i: " + i);
                System.out.println("nums[i-1]+nums[i]" + (nums[i-1]+nums[i]));
                if (target==(nums[i-1]+nums[i])) {
                    return new int[]{i-1, i};
                }
            }
        }
        return new int[0];
    }

    void printIntArray(int[] numArray) {
        for (int i=0; i < numArray.length; i++) {
            System.out.print(numArray[i] + ", ");
        }
        System.out.println();
    }

}

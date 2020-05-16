package sorting;

import utils.SortUtils;

import java.util.Arrays;

import static utils.SortUtils.*;

public class SortsOfSorts {

    int[] sortInt(int[] nums) {
        boolean sorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                swap(nums, i, i + 1);
            }
        }
        if (sorted) {
            return nums;
        } else {
            return sortInt(nums);
        }
    }

    int[] anotherSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                swap(nums, i - 1, i);
                anotherSort(nums);
            }
        }
        return nums;
    }

    int[] subArray(int[] nums, int x, int y) {
        return Arrays.copyOfRange(nums, x, y);
    }

    void yetAnotherSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length - 1; i++) {
            if (arrayToSort[i] > arrayToSort[i + 1]) {
                swap(arrayToSort, i, i + 1);
                yetAnotherSort(arrayToSort);
            }
        }
    }
}

import java.util.Arrays;

public class SortsOfSorts {

    int[] sortInt(int[] nums) {
        boolean sorted = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                swap(nums, i);
            }
        }
        if (sorted) {
            return nums;
        } else {
            return sortInt(nums);
        }
    }

    void swap(int[] array, int position) {
        int largerNumber = array[position];
        array[position] = array[position + 1];
        array[position + 1] = largerNumber;
    }

    int[] anotherSort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1]>nums[i]) {
                anotherSwap(nums, i-1, i);
                anotherSort(nums);
            }
        }
        return nums;
    }

    void anotherSwap(int[] num, int indx1, int indx2) {
        int temp = num[indx1];
        num[indx1] = num[indx2];
        num[indx2] = temp;
    }

    int[] subArray(int[] nums, int x, int y) {
        return Arrays.copyOfRange(nums, x, y);
    }

    void yetAnotherSort(int[] arrayToSort) {
        for (int i=0; i < arrayToSort.length-1; i++) {
            if (arrayToSort[i] > arrayToSort[i+1]) {
                yetAnotherSwap(arrayToSort, i, i+1);
                yetAnotherSort(arrayToSort);
            }
        }
    }

    void yetAnotherSwap(int[] array, int indx, int indx2) {
        int temp = array[indx];
        array[indx] = array[indx2];
        array[indx2] = temp;
    }
}

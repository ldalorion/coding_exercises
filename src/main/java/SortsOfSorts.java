public class SortsOfSorts {

    int[] sortInt(int[] nums) {
        boolean sorted = true;
        for (int i=0; i < nums.length-1; i++) {
            if (nums[i] > nums[i+1]) {
                sorted = false;
                swap(nums, i);
            }
        }
        if (sorted){
            return nums;
        } else {
            return sortInt(nums);
        }
    }

    void swap(int[] array, int position) {
        int largerNumber = array[position];
        array[position] = array[position+1];
        array[position+1] = largerNumber;
    }
}

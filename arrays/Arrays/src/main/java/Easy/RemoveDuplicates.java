package Easy;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

// array sorted in non-decreasing order - remove the duplicates in-place
// each unique element appears only once
// relative order of the elements should be kept the same
// there will always be at least one element in the array
// need to keep a running count of the number of elements in the array after the duplicate has been removed
public class RemoveDuplicates {

  // APPROACH
  // 1. get the size of the list - this will be used to return the size after dupes are removed
  // 2. use a for loop - create 2 pointers 894756565656

  public static int removeDuplicates(int[] nums) {
    // if there is only 1 element in the array, then exit
    if (nums.length == 1) {
      return nums.length;
    }

    int size = 1;

    int j = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[j] != nums[i]) {
        nums[j+ 1] = nums[i];
        j++;
        size++;
      }
    }

    return size;
  }

  public static void main(String[] args) {
    int removed = removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
    System.out.println(removed);
  }

}

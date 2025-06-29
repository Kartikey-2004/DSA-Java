
public class Q_35 {

    public int searchInsert(int[] num, int target) {
        int low = 0;
        int high = num.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (num[mid] == target) {
                return mid;
            } else if (num[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
// --->
// 
// ---> slow aproach
// 
// --->
// import java.util.Arrays;
// public class Q_35 {
//     public int searchInsert(int[] nums, int target) {
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i;
//             }
//         }
//         nums = Arrays.copyOf(nums, nums.length + 1);
//         nums[nums.length - 1] = target;
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] == target) {
//                 return i;
//             }
//         }
//         return -1;
//     }
// }

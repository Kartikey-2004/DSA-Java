
import java.util.HashMap;

public class Q_1 {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num_inx = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int req_num = target - nums[i];
            if (num_inx.containsKey(req_num)) {
                int[] arr={num_inx.get(req_num),i};
                return arr; 
            }
            num_inx.put(nums[i],i);
        }
        return null;
    }
}

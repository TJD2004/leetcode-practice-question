// 2295. Replace Elements in an Array
import java.util.*;

class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            map.put(nums[i], i);
        }

        for(int[] op : operations) {
            int from = op[0];
            int to = op[1];

            int idx = map.get(from);

            nums[idx] = to;

            map.remove(from);
            map.put(nums[idx], idx);
        }

        return nums;
    }
}
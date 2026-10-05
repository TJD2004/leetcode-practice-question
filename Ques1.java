// 1. TWO SUM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int[] arr = new int[2];

        // for(int i=0; i<nums.length; i++) {
        //     for(int j=i+1; j<nums.length; j++) {
        //         if(nums[i] + nums[j] == target) {
        //             arr[0] = i;
        //             arr[1] = j;

        //             return arr;
        //         }
        //     }
        // }

        // return arr;


        int[] arr = new int[2];

        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];

            if (mp.containsKey(needed)) {
                arr[0] = mp.get(needed);
                arr[1] = i;
                break;
            }

            mp.put(nums[i], i);
        }

        return arr;

    }
}
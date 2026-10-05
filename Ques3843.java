// 3843. First Element with Unique Frequency


import java.util.*;

class Solution {
    public int firstUniqueFreq(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        HashMap<Integer, Integer> count = new HashMap<>();

        for (int f : freq.values()) {
            count.put(f, count.getOrDefault(f, 0) + 1);
        }

        for (int x : nums) {
            if (count.get(freq.get(x)) == 1) {
                return x;
            }
        }

        return -1;
    }
}

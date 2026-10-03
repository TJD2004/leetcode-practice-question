// 13. Roman to Integer

class Solution {
    public int romanToInt(String s) {
        Map<String, Integer> mp = new HashMap<>();

        mp.put("I", 1);
        mp.put("V", 5);
        mp.put("X", 10);
        mp.put("L", 50);
        mp.put("C", 100);
        mp.put("D", 500);
        mp.put("M", 1000);

        int idx = 0;
        int ans = 0;

        while (idx < s.length()) {

            if (idx + 1 < s.length() &&
                mp.get(String.valueOf(s.charAt(idx))) <
                mp.get(String.valueOf(s.charAt(idx + 1)))) {

                String temp = "" + s.charAt(idx) + s.charAt(idx + 1);

                ans += mp.get(String.valueOf(s.charAt(idx + 1)))
                     - mp.get(String.valueOf(s.charAt(idx)));

                idx += 2;

            } else {
                ans += mp.get(String.valueOf(s.charAt(idx)));
                idx++;
            }
        }

        return ans;
    }
}

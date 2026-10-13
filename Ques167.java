// 167. Two Sum II - Input Array Is Sorted


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0;
        int e = numbers.length - 1;

        while (s < e) {
            int sum = numbers[s] + numbers[e];

            if (sum == target) {
                return new int[]{s + 1, e + 1};
            } else if (sum < target) {
                s++;
            } else {
                e--;
            }
        }

        return new int[]{-1, -1};
    }
}
 /* 
        Using HashMap
 */   
// class Solution {
    //     public int[] twoSum(int[] numbers, int target) {
//         int n = numbers.length;
//         Map<Integer,Integer> map = new HashMap<>();

//         for(int i=0; i<n; i++) {
//             int needed = target - numbers[i];
//             if(map.containsKey(needed)) {
//                 return new int[] {
//                     map.get(needed), i + 1
//                 };
//             } else {
//                 map.put(numbers[i], i+1);
//             }
//         }

//         return new int[]{-1, -1};
//     }
// }

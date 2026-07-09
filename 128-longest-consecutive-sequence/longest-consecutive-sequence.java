// class Solution {

//     public int longestConsecutive(int[] nums) {

//         HashSet<Integer> set = new HashSet<>();

//         for (int num : nums) {
//             set.add(num);
//         }

//         int longest = 0;

//         for (int num : set) {

//             // Is this the start of a sequence?
//             if (!set.contains(num - 1)) {

//                 int current = num;
//                 int length = 1;

//                 while (set.contains(current + 1)) {
//                     current++;
//                     length++;
//                 }

//                 longest = Math.max(longest, length);
//             }
//         }

//         return longest;
//     }
// }
import java.util.Arrays;

class Solution {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longest = 1;
        int length = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue;
            }

            if (nums[i] == nums[i - 1] + 1) {
                length++;
            } else {
                length = 1;
            }

            longest = Math.max(longest, length);
        }

        return longest;
    }
}
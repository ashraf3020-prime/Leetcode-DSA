//this code take more time but.


// class Solution {
//     public boolean containsDuplicate(int[] nums) {
//         for(int i=0; i<nums.length;i++){
//             for(int j =1+i;j<nums.length;j++){
//                 if(nums[i]==nums[j]){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i=0;i<nums.length;i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }
}
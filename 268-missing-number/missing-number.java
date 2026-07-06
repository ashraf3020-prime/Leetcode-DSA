// this one is my code 

// class Solution {
//     public int missingNumber(int[] nums) {
//         int n = nums.length;
//         int realsum = n*(n+1)/2;
//         int numssum = 0;
//         for(int i =0;i<nums.length;i++){
//             numssum = numssum + nums[i];
//         }
//         return realsum - numssum;
//     }
// }
// this is other one 
class Solution {
    public int missingNumber(int[] nums) {
        int res = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }
        
        return res;       
    }
}
//time limit exceed

// class Solution {
//     public int maxArea(int[] height) {

//         int maxArea = 0;

//         for (int i = 0; i < height.length; i++) {

//             for (int j = i + 1; j < height.length; j++) {

//                 int width = j - i;

//                 int h = Math.min(height[i], height[j]);

//                 int area = width * h;

//                 if (area > maxArea) {
//                     maxArea = area;
//                 }
//             }
//         }

//         return maxArea;
//     }
// }
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;        
    }
}
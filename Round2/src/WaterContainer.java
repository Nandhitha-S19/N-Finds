import java.sql.SQLOutput;

class WaterContainer {
    public static void main(String[] args) {
        //container with most water - Leetcode 11
        /*You are given an integer array height of length n.
        There are n vertical lines drawn such
        that the two endpoints of the ith line are (i, 0) and (i, height[i]).
        Find two lines that together with the x-axis form a container,
        such that the container contains the most water.

                Return the maximum amount of water a container can store. */
        //input
        int[] height = {1,8,1,5,3,6};
        // output = 49

        int left = 0;
        int right = height.length - 1; // left right decides the width
        int max = 0;

        while (left < right) {
            int width = right - left;
            int heigh = Math.min(height[left], height[right]);
            max = Math.max(max, width * heigh);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(max);

    }
}

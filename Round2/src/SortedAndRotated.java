class SortedAndRotated {
    public static boolean CheckTrue(int[] nums){
        //leetcode 1752
        int invert = 0;
        if(nums.length <=1) return true;
        for(int i = 1; i < nums.length;i++){
            if(nums[i] < nums[i-1]){
                invert++;
            }
        }
        //last element is sorted correctly
        if(nums[0] < nums[nums.length -1]){
            invert++;
        }
        return (invert <=1);
    }

    public static void main(String[] args) {
        int[] num = {4,5,1,2,3};
        boolean ans = CheckTrue(num);
        System.out.println(ans);
    }
}

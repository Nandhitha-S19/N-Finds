class duplicateElement {
    public static int duplicate(int[] num){
        //leetcode 26
        int j = 1;
        for(int i = 1; i < num.length;i++){
            if(num[i-1] != num[i]){
                num[j] = num[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(duplicate(num));
    }
}



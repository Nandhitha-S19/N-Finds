package PatternFinding;

public class Pattern2M {
    public static void main(String[] args) {
        //Given an integer n. You need to recreate the pattern
        // given below for any value of N. Let's say for N = 5,
        // the pattern should look like as below:
        //*********
        // *******
        //  *****
        //   ***
        //    *
        int n = 5;
        for(int i = 1; i <=n;i++){
            //space
            for(int k = 1; k <i;k++){
                System.out.print(' ');
            }
            for(int j = 1;j <=n-i;j++){
                System.out.print('*');
            }
            System.out.print('*');
            for(int j = 1;j <=n-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

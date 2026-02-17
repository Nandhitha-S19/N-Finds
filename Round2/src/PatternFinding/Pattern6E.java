package PatternFinding;

public class Pattern6E {
    public static void main(String[] args) {
        //Given an integer n. You need to recreate the pattern given
        // below for any value of N. Let's say for N = 5,
        // the pattern should look like as below:
        //12345
        //1234
        //123
        //12
        //1
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(n-j+1);
            }
            System.out.println();
        }
    }
}
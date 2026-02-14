public class PowerOfNIterate {
    public static double myPow(double x, int n) {
        double ans = 1;
        long pow = n;

        if(n < 0){
            x = 1/x;
            pow = -pow;
        }

        while(pow >= 1){
            if(pow%2 == 1) ans *= x;
            pow = pow/2;
            x *= x;
        }
        return ans;

    }

    public static void main(String[] args) {
        double x = 2.10000;
        int n = -2;
        System.out.println(myPow(x,n));
    }
}

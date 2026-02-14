class PowerOfn {
    public static double myPow(double x, int n) {
       //recursive Solution
        long pow = n;

        if(n < 0){
            x = 1/x;
            pow = -pow;
        }
        return find(x,pow);

    }

    public static double find(double x, long pow){
        if(pow == 0){
            return 1;
        }

        double ans = find(x,pow/2);

        if(pow%2 == 0){
            return ans *= ans;
        }
        else{
            return ans *= ans * x;
        }

    }

    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        System.out.println(myPow(x,n));
    }
}
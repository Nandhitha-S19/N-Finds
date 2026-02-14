public class countGoodNumbers {
    public static int count(long n){
        if(n ==1) return 5;
        long even = (n+1)/2;
        long odd = n/2;
        long mod = 1000000007;

        return (int)((find(5,even,mod) * find(4,odd,mod)%mod));
    }
    public static long find(long base,long pow, long mod){
        long ans = 1;
        while(pow >= 1){
            if(pow%2 == 0){
                base = (base*base) %mod;
                pow = pow/2;
            }
            else{
                ans = (ans * base)%mod;
                pow = pow-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        long n = 3;
        System.out.println(count(n));
    }
}

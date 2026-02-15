public class NonConsecutiveFibonacci {
    public static String Fib(int k){
        if(k <= 1){
            return " ";
        }
        int a = 1; int b = 1; int c = 2;
        while(c <= k){
            a = b;
            b = c;
            c = a+b;
        }
        if(b <= k){
            System.out.println(b);
            Fib(k-b);
        }
        else if( a <= k){
            System.out.println(a);
            Fib(k-a);
        }
        return " ";
    }
    public static void main(String[] args) {
        int n = 65;
        Fib(n);
    }
}

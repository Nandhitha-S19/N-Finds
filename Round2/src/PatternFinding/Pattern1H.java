package PatternFinding;

public class Pattern1H {

    public static void main(String[] args) {
        int n = 3;
        int num = 0;
        int i = 1;
        for(; i <= n;i++){
                int l = num+i;
                num =l;
                int j = 0;
                while((l >= i) && (j < i)){
                    System.out.print(l+ " ");
                    l--;
                    j++;
                }
            System.out.println();
        }
        int j = n-1;
        for(; j >= 1;j--){
            int l = num+j;
            num =l;
            int k = 0;
            while((l >= j) && (k < j)){
                System.out.print(l+ " ");
                l--;
                k++;
            }
            System.out.println();
        }
    }
}

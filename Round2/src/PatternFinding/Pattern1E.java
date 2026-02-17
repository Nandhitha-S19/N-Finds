package PatternFinding;

class Pattern1E {
    public static void main(String[] args) {
        //Rectangular Star Pattern
        int n = 5;

        for(int i = 0; i < n;i++){
            for(int j = 0; j <n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

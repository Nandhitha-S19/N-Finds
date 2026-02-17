package PatternFinding;

public class Pattern4M {
    //Given an integer n.
    // You need to recreate the pattern given below for any value of N.
    // Let's say for N = 5, the pattern should look like as below:
    //*
    //**
    //***
    //****
    //*****
    //****
    //***
    //**
    //*

    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i <=n;i++){

            for(int j = 1; j <i;j++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(int j = 1; j <=n;j++){
            System.out.print('*');
        }
        System.out.println();
        for(int i = 1; i <= n;i++){
            for(int j = n; j >i;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

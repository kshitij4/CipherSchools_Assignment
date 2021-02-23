package DP;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        int[] tmp = new int[n];
        if (n < 2){
            return 1;
        }
        tmp[0] = 1;
        tmp[1] = 2;
        for (int i = 2; i < n; i++){
            tmp[i] = tmp[i-1] + tmp[i-2];
        }
        return tmp[n-1];
    }

    public static void main(String[] args) {

        int n =7;

        System.out.println(climbStairs(n));
    }
}

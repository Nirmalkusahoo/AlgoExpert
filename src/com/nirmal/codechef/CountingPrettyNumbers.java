package com.nirmal.codechef;

import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void  count(int L,int R){
        int nums=0;
        for(int i=L;i<=R;i++){
            int lastDigit=i%10;

            if(lastDigit == 2 || lastDigit==3 || lastDigit==9){
                nums++;
            }
        }
        System.out.println(nums);
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int testcase=scanner.nextInt();


        for (int i=0;i<testcase;i++){
            int L=scanner.nextInt();
            int R=scanner.nextInt();
            count(L,R);
        }
    }
}

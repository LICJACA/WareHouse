package com.Java;

import java.util.Scanner;

public class PartitionStrategy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* 输入数字决定数组长度*/
        System.out.println("请输入个数:");
        int n = input.nextInt();
        int [] arr = new int[n];
        System.out.println("请输入数据，空格隔开:");
        for(int i = 0;i<n;i++)
        {
            arr[i] = input.nextInt();
        }
        int max = fidnMax(arr,0,n-1);
        System.out.println(max);
    }
    /* 分治策略：把数组中的数据分为左右两部分，分别求出两边最大值，在比较大小，得到最终Max */
    public static int fidnMax(int arr[],int low,int high)
    {
        if(low == high){
            return arr[low];
        }
        else{
            int mid = low+(high-low)/2;
            int leftmax = fidnMax(arr,low,mid);
            int rightmax = fidnMax(arr,mid+1,high);
            return Math.max(leftmax,rightmax);
        }
    }
}

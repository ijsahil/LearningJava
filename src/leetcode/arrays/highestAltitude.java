package leetcode.arrays;

import java.util.Arrays;

public class highestAltitude {
    public static void main(String[] args) {
        int[] gain={-5,1,5,0,-7};
        int[] a=new int[gain.length+1];
        a[0]=0;
        for(int i=1;i<a.length;i++)
        {
            a[i]=gain[i-1]+a[i-1];
        }
        System.out.println(Arrays.toString(a));
    }
   static int max(int[] arr){
        int max=0;
        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
}

package leetcode.daily;

import java.util.Arrays;

public class createtargetarray {
    public static void main(String[] args) {
        int[] nums={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        int[] target=new int[nums.length];
        int i=0;
        while(i<target.length)
        {
            if(i>index[i])
            {
                target[index[i]+1]=nums[i];
            }
            target[index[i]]=nums[i];
                i++;
        }
        System.out.println(Arrays.toString(target));
    }
}

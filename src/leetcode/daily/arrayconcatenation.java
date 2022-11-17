package leetcode.daily;

import java.util.Arrays;

public class arrayconcatenation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
            int[] ans=new int[nums.length*2];
            int i=0,j=0;
            while(i<ans.length)
            {

                ans[i]=nums[j];
                i++;
                j++;
                if(j==(ans.length/2)) {
                        j=0;
                }
            }
        System.out.println(Arrays.toString(ans));
    }
}

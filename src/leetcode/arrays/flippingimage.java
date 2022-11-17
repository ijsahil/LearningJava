package leetcode.arrays;

import java.util.Arrays;

public class flippingimage {
    public static void main(String[] args) {
                int[] a={1,1,0};
                flipimage(a);
        System.out.println(Arrays.toString(a));
        }
    static void flipimage(int[] image)//Method did not work
    {
        int j=0;
        for(int i=image.length-1;i>=0;i--){
            if(i==j)
            {
                break;
            }
            int temp=image[i];
            image[j]=image[i];
            image[i]=temp;
            j++;
        }
    }
}

package dsa.stringandstringbuider;

import java.util.Scanner;

public class checkpallindrome {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        int count=0;
       int i=0;
       int j=a.length()-1;
        while(i<=j){
            if(a.charAt(i)==a.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                count++;
                break;
            }
        }
        if(count!=1){
            System.out.println("Pallindrome");
        }
        else {
            System.out.println("Not a pallindrome");
        }
    }
}

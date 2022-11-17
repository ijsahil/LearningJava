package leetcode.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class checkpangram {
    public static void main(String[] args) {
           boolean ans=ispangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println(ans);
    }
    static boolean ispangram(String str) {
        ArrayList<Integer> list = new ArrayList<>();
        if (str.length() < 26) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            list.add((int)(str.charAt(i)));
        }
        HashSet<Integer>hash=new HashSet<>(list);
        if(hash.size()==26){
            return true;
        }
        return false;
    }
}

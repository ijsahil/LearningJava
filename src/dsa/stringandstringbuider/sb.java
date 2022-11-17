package dsa.stringandstringbuider;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sb {
    public static void main(String[] args) {
        StringBuilder sbs=new StringBuilder();
        for(int i=0;i<26;i++)
        {
            char ch=((char)(97+i));
            sbs.append(ch);
        }
        System.out.println(sbs);
    }
}

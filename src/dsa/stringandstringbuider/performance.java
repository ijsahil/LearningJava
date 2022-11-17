package dsa.stringandstringbuider;

public class performance {
    public static void main(String[] args) {
        String str="";
        for(int i=0;i<26;i++)
        {
            char ch=((char)(97+i));
            str+=ch;
        }
        System.out.println(str);
    }
}

package com.test;

/**
 * Created by tgf on 2019/12/20.
 */
public class Test02 {
    public static void main(String[] args) {
        String str = "We Are Happy";
        //String s = str.replaceAll(" ", "%20");
        System.out.println(str);

        System.out.println(replaceSpace(new StringBuffer(str)));
    }

    public static String replaceSpace(StringBuffer str) {
        if(str==null) return null;
        String s =str.toString();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==' '){
                st.append("%20");
            }else{
                st.append(s.charAt(i));
            }

        }

        return st.toString();
    }
}

package com.test;

import java.io.*;

/**
 * Created by tgf on 2020/1/14.
 */
public class ChangeString {
    public static void main(String[] args) {
        BufferedReader read=null;
        BufferedWriter write=null;
        int sum=0;
        try {

            read=new BufferedReader(new FileReader("D:/ideaworkspace/SwordMeansOffer/src/main/source/test.csv"));
            write=new BufferedWriter(new FileWriter("D:/ideaworkspace/SwordMeansOffer/src/main/source/target.csv"));

            String s=null;
            StringBuilder str=new StringBuilder();
            while((s=read.readLine())!=null){

//                if(s.){
//
//                }


                sum++;
                //String s2=s;
                if(sum>1){
                    System.out.println("1->"+s);
                    //s = s.replaceAll("\\s|\\\\r|\\\\n|\\\\r\\\\n|\\\\t", "");
                    System.out.println("2->"+s);
                    s = change(s);
                    System.out.println("3->"+s);
                }

                write.write(s);
                write.newLine();
            }

            write.flush();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("总行数"+sum);
        try {
            if(write!=null){
                write.close();
            }
            if(read!=null){
                read.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String change(String s1) {
        StringBuilder builder = new StringBuilder();
        char[] chars = s1.toCharArray();
        boolean b=false;
        for (char c : chars){
            if(c=='\"'){
                b=!b;
                continue;
            }
            if((b&&c==',')){
                builder.append('，');
                continue;
            }
            builder.append(c);
        }
        return builder.toString();
    }


}

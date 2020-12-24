package com.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tgf on 2019/12/29.
 */
public class TimeList extends UDF {
    public String evaluate(String s) throws ParseException {
        String str = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long time = simpleDateFormat.parse(s).getTime();
        Date date = new Date();
        while (time <=date.getTime()){

            str += simpleDateFormat.format(new Date(time))+",";
            time=time+86400000;
        }

        return str.substring(0,str.length()-1);
    }
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = simpleDateFormat.parse("2019-11-10");
        String str = "";

        long time = date1.getTime();
        while (time <=date.getTime()){

           str += simpleDateFormat.format(new Date(time))+",";
           time=time+86400000;
       }

        System.out.println(str.substring(0,str.length()-1));
    }




}

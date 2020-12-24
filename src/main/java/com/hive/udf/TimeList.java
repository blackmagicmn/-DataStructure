package com.hive.udf;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeList extends UDF {
    public String evaluate(String start_date,String end_date) throws ParseException {
        String str = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        long time1 = simpleDateFormat.parse(start_date).getTime()+86400000;
        long time2 = simpleDateFormat.parse(end_date).getTime();
        while (time1 < time2 ){

            str += simpleDateFormat.format(new Date(time1))+",";
            time1=time1+86400000;
        }

        return str.substring(0,str.length()-1);
    }
    /*public static void main(String[] args) throws ParseException {
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
    }*/




}

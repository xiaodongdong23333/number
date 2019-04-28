package com.whd.Utiles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    private static SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public static String getCurrentTimeStr(){
        long starttime  = System.currentTimeMillis();
        String datetime = df.format(new Date(starttime));
        return datetime;
    }
}

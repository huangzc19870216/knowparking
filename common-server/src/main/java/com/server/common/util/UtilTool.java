package com.server.common.util;

/**
 * Created by Administrator on 2018\1\25 0025.
 */
public class UtilTool {

    public static String nullToString(Object obj){
        if(obj!=null && !"null".equals(obj)){
            return obj.toString();
        }
        else{
            return "";
        }
    }
}

package com.ma.clothes.common.tools;

import java.util.UUID;

public class StringUtils {

    public static String getUUID(){
        UUID uuid = UUID.randomUUID();
        String s = uuid.toString();
        s = s.replaceAll("-", "");
        return s;
    }

    public static String[] string2Array(String str, String separator){
        return str.split(separator);
    }

    public static void main(String[] args) {
//        String s = "dfadfa,fdasfdsa,fdafdsa,fdafdsa,";
//        String[] strings = string2Array(s, ",");
//        System.out.println(strings.length);

        Integer i = 5000;
        if(i >= Integer.valueOf("5000")){
            System.out.println("yes");
        }

    }

}

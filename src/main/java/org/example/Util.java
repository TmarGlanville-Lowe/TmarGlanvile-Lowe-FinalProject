package org.example;


public class Util {
    public static String toTitleCase(String strIn){
    String firstCharacter = strIn.substring(0,1).toUpperCase();
    String remainingPart = strIn.substring(1).toLowerCase();
    return firstCharacter + remainingPart;
    }
    public static String combineWords(String fword,String lword){
        return String.format("%s %s", fword,lword);
    }

}

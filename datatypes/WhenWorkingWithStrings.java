package com.serenitydojo.datatypes;

import org.junit.Test;

public class WhenWorkingWithStrings {
    @Test
    public void convertingToLowerCase(){
        String myString = " HI MY NAME IS ROBY ";
        String convertedLower = myString.toLowerCase();
        System.out.println(convertedLower);
        String convertedUpper = convertedLower.toUpperCase();
        System.out.println(convertedUpper);
        String trimmedString = myString.trim();
        System.out.println(trimmedString);
        int howLongIsMyString = myString.length();
        System.out.println(howLongIsMyString);
        String replacedText = myString.replace("ROBY", "ALEX");
        System.out.println(replacedText);

    }
}

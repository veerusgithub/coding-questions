package com.veeru.glider.solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*problem statement : you are given a string S that has lowercase letters and numbers.
* your task is to compare the number groupings and print the largest number
* Example : in "gt12cty65mt1" - there are 3 number groupings: 12,65,1. As 65
* is the greatest that is the answer*/
public class LargestNumberInaString {

    public static void main(String[] args) {
        System.out.println(findGreatestNumberInString("gt12cty65mt1"));
    }

    private static int findGreatestNumberInString(String s) {
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(s);
        List<Integer> list = new ArrayList<>();
        while (m.find()){
            list.add(Integer.valueOf(m.group()));
        }
        OptionalInt max = list.stream().mapToInt(v->v).max();
        return max.isPresent()?max.getAsInt(): 0;
    }
}

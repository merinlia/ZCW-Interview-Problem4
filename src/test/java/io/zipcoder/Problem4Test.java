package io.zipcoder;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Problem4Test {
    Problem4 problem4 = new Problem4();
    @Test
    public void checkChangeToPalindTest(){
        Map<Character,Integer> map = null;
        String str = "cdefghmnopqrstuvw";
        boolean expected = true;
       map = problem4.EachCharRepeat(str);
        System.out.println(map.toString());
    }
    @Test
    public void canCreatePalindromTest(){
        Map<Character,Integer> map = null;
        boolean canCreatepalindrom = false;
        String str = "cdefghmnopqrstuvw";
        boolean expected = true;
        map = problem4.EachCharRepeat(str);
        canCreatepalindrom = problem4.canCreatePalindrom(map);
        System.out.println(canCreatepalindrom);
    }
    @Test
    public void sortHashMapByValuesTest(){
        Map<Character,Integer> map = null;
        boolean canCreatepalindrom = false;
        String str = "cdcdcdcdeeeef";
        boolean expected = true;
        map = problem4.EachCharRepeat(str);
        //System.out.println(problem4.sortHashMapByValues((HashMap<Character, Integer>) map));
        problem4.palindromString( map);
    }
}

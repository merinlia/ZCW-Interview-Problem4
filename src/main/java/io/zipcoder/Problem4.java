package io.zipcoder;

import java.util.*;

public class Problem4 {


    public Map<Character,Integer> EachCharRepeat(String string) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < string.length(); i++) {
            if (map.isEmpty()) {
                map.put(string.charAt(i), 1);
            } else {
                if (map.containsKey(string.charAt(i))) {
                    Integer value = map.get(string.charAt(i));
                    map.remove(string.charAt(i));
                    map.put(string.charAt(i), value + 1);
                } else {
                    map.put(string.charAt(i), 1);
                }
            }

        }
        return map;
    }
    public boolean canCreatePalindrom(Map<Character,Integer> map){
        int even = 0, odd = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                even++;
            }
            else odd++;

        }
        if(odd == 1)
            return true;
        else
            return false;
    }
    public String palindromString(Map<Character, Integer> linkedHashMap){
        String string = "";
        Map<String,Integer> map = null;
        for (int i=linkedHashMap.size()-1;i<=0;i--){

        }
        return null;
    }
    public LinkedHashMap<Character, Integer> sortHashMapByValues(HashMap<Character, Integer> map) {
        List<Character> mapKeys = new ArrayList<Character>(map.keySet());
        List<Integer> mapValues = new ArrayList<Integer>(map.values());
        Collections.sort(mapValues);
        Collections.sort(mapKeys);

        LinkedHashMap<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();

        Iterator<Integer> valueIt = mapValues.iterator();
        while (valueIt.hasNext()) {
            Integer val = valueIt.next();
            Iterator<Character> keyIt = mapKeys.iterator();

            while (keyIt.hasNext()) {
                Character key = keyIt.next();
                Integer comp1 = map.get(key);
                Integer comp2 = val;

                if (comp1.equals(comp2)) {
                    keyIt.remove();
                    sortedMap.put(key, val);
                    break;
                }
            }
        }
        return sortedMap;
    }
}

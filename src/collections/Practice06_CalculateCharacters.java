package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Practice06_CalculateCharacters {

    public static void main(String[] args) {

        String str1 = "banana";

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c: str1.toCharArray()) {
            if(!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);

        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()>1) System.out.println(entry.getKey());
        }


    }
}
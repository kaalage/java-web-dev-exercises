package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {
        String myStr = "If the product of two terms is zero then common sense says at least one of the two terms has to " +
                "be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a " +
                "form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s " +
                "pretty straightforward from there.";

        HashMap<Character, Integer> myDataStructure = new HashMap<>();

        char[] charactersInString = myStr.toCharArray();

        for (char i:charactersInString) {
            if (myDataStructure.containsKey(i)) {
                myDataStructure.put(i, myDataStructure.get(i) + 1);
            } else {
                myDataStructure.put(i, 1);
            }
        }

        for (Map.Entry entry : myDataStructure.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}






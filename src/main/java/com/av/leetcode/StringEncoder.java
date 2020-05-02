package com.av.leetcode;


import java.util.HashMap;
import java.util.HashSet;

public class StringEncoder {

    /*
     * Complete the 'encode' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING stringToEncode as parameter.
     */

    public static String encode(String stringToEncode) {
        HashMap<Character, Character> dictionary = createDictionaryRuleSet();
        HashSet<Character> numbers = createNumberSet();
        stringToEncode = stringToEncode.toLowerCase();
        char[] chars = stringToEncode.toCharArray();


        StringBuffer buffer = new StringBuffer();

        for (int i = 0; i < chars.length; i++) {
            //check first if character is letter since letters are more common
            if (dictionary.containsKey(chars[i])) {
                buffer.append(dictionary.get(chars[i]));
            }
            else{
                //check if number
                if (numbers.contains(chars[i])) {
                    //since numbers are reversed - continue until no numbers
                    Boolean nextCharNumber = true;
                    int indexOfNumberStart = i;
                    int indexOfNumberEnd = i+1;
                    while (indexOfNumberEnd < chars.length && nextCharNumber) {
                        if(numbers.contains(chars[indexOfNumberEnd])){
                            indexOfNumberEnd++;
                        }
                        else{
                            nextCharNumber = false;
                        }
                    }
                    //set i to one less than indexOfNumberEnd so loop will increment
                    i = indexOfNumberEnd - 1;
                    for (int j = i; j >= indexOfNumberStart; j--) {
                        buffer.append(chars[j]);
                    }
                }
                //if not a number
                else{
                    buffer.append(chars[i]);
                }
            }
        }

        return buffer.toString();
    }

    private static HashSet<Character> createNumberSet() {
        HashSet<Character> numbers = new HashSet<>();
        numbers.add('0');
        numbers.add('1');
        numbers.add('2');
        numbers.add('3');
        numbers.add('4');
        numbers.add('5');
        numbers.add('6');
        numbers.add('7');
        numbers.add('8');
        numbers.add('9');
        return numbers;
    }

    /**
     * Helper method that creates HashMap with proper rules
     */
    private static HashMap<Character, Character> createDictionaryRuleSet() {
        HashMap<Character, Character> dictionary = new HashMap<>();
        dictionary.put('a', '1');
        dictionary.put('b', 'a');
        dictionary.put('c', 'b');
        dictionary.put('d', 'c');
        dictionary.put('e', '2');
        dictionary.put('f', 'e');
        dictionary.put('g', 'f');
        dictionary.put('h', 'g');
        dictionary.put('i', '3');
        dictionary.put('j', 'i');
        dictionary.put('k', 'j');
        dictionary.put('l', 'k');
        dictionary.put('m', 'l');
        dictionary.put('n', 'm');
        dictionary.put('o', '4');
        dictionary.put('p', 'o');
        dictionary.put('q', 'p');
        dictionary.put('r', 'q');
        dictionary.put('s', 'r');
        dictionary.put('t', 's');
        dictionary.put('u', '5');
        dictionary.put('v', 'u');
        dictionary.put('w', 'v');
        dictionary.put('x', 'w');
        dictionary.put('y', ' ');
        dictionary.put('z', 'y');
        dictionary.put(' ', 'y');
        return dictionary;
    }

}

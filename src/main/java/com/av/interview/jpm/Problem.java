package com.av.interview.jpm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

public class Problem {

    public static String solution(String s){
        //space character is U+0020 so needs to be invalid if contains
        //creating regex for invalid characters from [U+0000, U+0020]
        String containsInvalid_regex = "^(?=.*[\\u0000-\\u0020]).+$";
        Pattern containsInvalid_pattern = Pattern.compile(containsInvalid_regex);
        //creating regex for invalid characters from [U+007B, U+007F] also as those shouldn't be there
        String containsInvalid_regex2 = "^(?=.*[\\u007B-\\u007F]).+$";
        Pattern containsInvalid_pattern2 = Pattern.compile(containsInvalid_regex2);
        Boolean containsInvalid = containsInvalid_pattern.matcher(s).matches() ||
            containsInvalid_pattern2.matcher(s).matches();
        if (s.length() < 6 || s.length() > 25 || containsInvalid) {
            return "invalid";
        }

        //start w/ using a regex for each rule to get this
        String lowercase_regex = "^(?=.*[a-z]).+$";
        String uppercase_regex = "^(?=.*[A-Z]).+$";
        String num_regex = "^(?=.*\\d).+$";
        String special_regex = "^(?=.*[!@#$%^&*]).+$";
        Pattern lowerCase_pattern = Pattern.compile(lowercase_regex);
        Pattern uppercase_pattern = Pattern.compile(uppercase_regex);
        Pattern num_pattern= Pattern.compile(num_regex);
        Pattern special_pattern= Pattern.compile(special_regex);

        //create booleans for easy rule checking later
        Boolean hasLower = lowerCase_pattern.matcher(s).matches();
        Boolean hasUpper = uppercase_pattern.matcher(s).matches();
        Boolean hasNumber = num_pattern.matcher(s).matches();
        Boolean hasSpecial = special_pattern.matcher(s).matches();

        if(s.length() > 9 && hasLower && hasUpper && hasNumber && hasSpecial){ //strong passwords must be at least 10 chars and one of each
            return "strong";
        }
        //medium must be 8 or more chars and does  not have to have special
        if (s.length() > 7 && hasLower && hasUpper && hasNumber) {
            return "medium";
        }
        return "weak";
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(solution(line));
        }
    }

}

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("(?<firstChar>[_,])(?<target>[a-zA-Z]+)(?<digit>[0-9])");
        Map<String, String> map = new LinkedHashMap<>();

        while (true) {
            String input = bf.readLine();
            input = DecryptInputWithOldValues(input, map);
            if ("Ascend".equals(input)) {
                break;
            }
            Matcher matcher = pattern.matcher(input);

            while (matcher.find()) {
                String match = matcher.group();
                String firstChar = matcher.group("firstChar");
                Integer digit = Integer.valueOf(matcher.group("digit"));
                String message = matcher.group("target");
                StringBuilder builder = new StringBuilder();
                if (firstChar.equals("_")) {
                    for (int i = 0; i < message.length(); i++) {
                        builder.append((char) (message.charAt(i) - digit));
                    }
                } else {
                    for (int i = 0; i < message.length(); i++) {
                        builder.append((char) (message.charAt(i) + digit));
                    }
                }
                map.put(match, builder.toString());
                input=input.replaceAll(match, builder.toString());
            }
            System.out.println(input);
        }
    }

    private static String DecryptInputWithOldValues(String input, Map<String, String> map) {
        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            input = input.replaceAll(stringStringEntry.getKey(), stringStringEntry.getValue());
        }
        return input;
    }
}

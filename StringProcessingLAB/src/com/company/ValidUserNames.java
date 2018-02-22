package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUserNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        StringBuilder sb = new StringBuilder();
        int counter =0;

        while (!name.equals("END")){

            String regex = "^[\\w-]{3,16}$";
            //String regex = "([^a-zA-Z 0-9_\\-])";
            //String regex = "([!$%^&*()+|~=`{}\\[\\]:\";'<>?,.\\/])";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);

            //if (!matcher.find() && name.length()>=3 && name.length()<=16){
            if(matcher.find()){
                counter++;
                sb.append("valid");
                sb.append("\n");
            }else  {
                sb.append("invalid");
                sb.append("\n");
            }
            name = input.nextLine();
        }
        if (counter>0){
            System.out.println(sb);
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	String text =  "write your code here";
        char[] h = new char[text.length()];
        String j = new String(h);
        String text3 = j.replace("\0", "/");
        //String text2 = new String (new char[text.length()]).replace("\0", "/");


	//String text2 = new String (new char[text.length()]).replace("\0", "/");
        System.out.println(text3);

    }
}

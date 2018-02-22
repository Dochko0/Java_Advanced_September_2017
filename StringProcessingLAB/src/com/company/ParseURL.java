package com.company;

import java.util.Scanner;

public class ParseURL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] protocol = input.nextLine().split("://");
        if (protocol.length!=2){
            System.out.println("Invalid URL");
        }else {
            int serverIndex = protocol[1].indexOf("/");
            String server = protocol[1].substring(0, serverIndex);
            String res = protocol[1].substring(serverIndex + 1, protocol[1].length());

            System.out.printf("Protocol = %s%n", protocol[0]);
            System.out.printf("Server = %s%n", server);
            System.out.printf("Resources = %s%n", res);
        }
    }


}


package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String, Integer> collectRes = new HashMap<>();
        while(true){
            String resourse=input.nextLine();
            if (resourse.equals("stop")){
                break;
            }
            Integer val = Integer.parseInt(input.nextLine());
            if (collectRes.containsKey(resourse)) {
                Integer values = collectRes.get(resourse)+val;
                collectRes.put(resourse, values);
            }else{
                collectRes.put(resourse, val);
            }

        }

        for (String key :collectRes.keySet()){
            System.out.printf("%s -> %s\n", key, collectRes.get(key));
        }
    }
}

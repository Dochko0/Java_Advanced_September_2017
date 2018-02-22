package com.company; //66/100

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ImplementBinarySearchRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] elements = Arrays.stream(bf.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int start = 0;
        int key = Integer.parseInt(bf.readLine());
        System.out.println(binarySearch(elements, key, start, elements.length));
    }

    private static int binarySearch(int[] nums, int key, int start, int end) {
        if (start > end) {
            return -1;
        }
        int middle = start+(end-start)/2;
        if(nums[middle]>key){
            end=middle-1;
            return binarySearch(nums,key,start,end);
        }else if(nums[middle]<key){
            start=middle+1;
            return binarySearch(nums,key,start,end);
        }else{
            return middle;
        }
    }
}


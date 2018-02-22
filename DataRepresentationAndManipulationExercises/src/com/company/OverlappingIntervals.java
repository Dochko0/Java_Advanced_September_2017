package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class OverlappingIntervals {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int packets = Integer.parseInt(bf.readLine());

        List<String> numbers = new ArrayList<>();
        boolean isoverlap = false;

        for (int i = 0; i < packets; i++) {
            numbers.add(bf.readLine());
        }

        for (int i = 0; i < numbers.size()-1; i++) {
            int[] numForCompare = new int[2];
            int[] numComparator = new int[2];

            for (int j = i + 1; j < numbers.size(); j++) {

                String[] splArrNum = numbers.get(i).split(",");
                numForCompare[0] = Integer.parseInt(splArrNum[0]);
                numForCompare[1] = Integer.parseInt(splArrNum[1]);

                String[] secPslArrNum = numbers.get(j).split(",");
                numComparator[0] = Integer.parseInt(secPslArrNum[0]);
                numComparator[1] = Integer.parseInt(secPslArrNum[1]);

                if ((numForCompare[0] <= numComparator[0] && numForCompare[1] >= numComparator[0])
                        || (numForCompare[0] <= numComparator[1] && numForCompare[1] >= numComparator[1])) {
                    isoverlap = true;
                    break;
                }
            }
            if ((numForCompare[0] <= numComparator[0] && numForCompare[1] >= numComparator[0])
                    || (numForCompare[0] <= numComparator[1] && numForCompare[1] >= numComparator[1])) {
                isoverlap = true;
                break;
            }
        }
        System.out.println(isoverlap);
    }
}

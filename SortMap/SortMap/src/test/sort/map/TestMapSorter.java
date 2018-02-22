package test.sort.map;

import java.util.HashMap;
import java.util.Map;

import sort.map.MapSorter;

public class TestMapSorter {
	public static void main(String[] args) {
		
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Ivan", 34);
		unsortedMap.put("Dimityr", 11);
		unsortedMap.put("Pesho", 88);
		unsortedMap.put("Mitko", 2);
		unsortedMap.put("Krum", 43);

		Map<String, Integer> sortedMap = MapSorter.sortedMap(unsortedMap);
		System.out.println(sortedMap.toString());
		
	}
}

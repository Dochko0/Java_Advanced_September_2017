package test.sort.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//import sort.map.MapSorter;

public class TestMapSorter {
	public static void main(String[] args) {
		
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Ivan", 34);
		unsortedMap.put("Dimityr", 11);
		unsortedMap.put("Pesho", 88);
		unsortedMap.put("Mitko", 2);
		unsortedMap.put("Krum", 43);

		Map<String, Integer> sortedMap = sortedMap(unsortedMap);
		System.out.println(sortedMap.toString());
		
	}
	public static Map<String, Integer> sortedMap(Map<String, Integer> unsortedMap) {
		if (unsortedMap == null) {
			return null;
		}
		return unsortedMap
				.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}
}

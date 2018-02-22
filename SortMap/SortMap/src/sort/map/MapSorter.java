package sort.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSorter {

	public static Map<String, Integer> sortedMap(Map<String, Integer> unsortedMap) {
		if (unsortedMap == null) {
			return null;
		}
		return unsortedMap
				.entrySet()
				.stream()
				.sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
	}

}

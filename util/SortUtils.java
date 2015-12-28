package com.mcnc.yuga.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author sambathkakda
 *
 */
public final class SortUtils {

	/**
	 * @param values
	 * @param templates
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<HashMap<String, Object>> sortHashMap(Object values, List<String> templates){
		HashMap<String, Object>[] lists = new HashMap[templates.size()];
		for(HashMap<String, Object> row : (List<HashMap<String, Object>>) values){
			for (Entry<String, Object> col : row.entrySet()){
				if(templates.indexOf(col.getValue()) >= 0){
					lists[templates.indexOf(col.getValue())] = row;
				}
			}
		}
		return Arrays.asList(lists);
	}
}

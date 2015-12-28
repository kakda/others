package com.mcnc.yuga.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/**
 * @author sambathkakda
 *
 */
public final class FilterUtils {

	/**
	 * @param values
	 * @param templates
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static List<HashMap<String, Object>> filterByKeyValue(Object values, String key, String value){
		List<HashMap<String, Object>> newValues = new ArrayList<HashMap<String,Object>>();
		for(HashMap<String, Object> row : (List<HashMap<String, Object>>) values){
			for (Entry<String, Object> col : row.entrySet()){
				if(col.getKey().equals(key) && col.getValue().equals(value)){
					newValues.add(row);
				}
			}
		}
		return newValues;
	}
}

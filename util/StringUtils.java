package com.mcnc.yuga.util;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;


/**
 * @author sambathkakda
 *
 */
public final class StringUtils {

	/**
	 * @param text
	 * @param hashMap
	 * @return
	 * @throws UnknownHostException 
	 */
	@SuppressWarnings("rawtypes")
	public static String replaceText(String text, HashMap hashMap){
		
		// Replace baseUrl as default
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		String baseUrl = String.format("%s://%s:%d/yuga",request.getScheme(),  request.getServerName(), request.getServerPort());	
		text = text.replace("varBaseUrl", baseUrl);
		
		Iterator iterator = hashMap.entrySet().iterator();
		
		while(iterator.hasNext()){
			Map.Entry entry = (Map.Entry) iterator.next();
			text = text.replace(entry.getKey().toString(), entry.getValue().toString());
			
		}
		return text;
	}
}


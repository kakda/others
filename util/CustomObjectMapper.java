package com.mcnc.yuga.util;

import java.util.Date;

import org.codehaus.jackson.Version;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.module.SimpleModule;

public class CustomObjectMapper extends ObjectMapper {

	public CustomObjectMapper(){
		super();
		/*configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);
		setDateFormat(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));*/
		
		SimpleModule simpleModule = new SimpleModule("", Version.unknownVersion());
		simpleModule.addSerializer(Date.class, new CustomDateSerializer());
		//simpleModule.addSerializer(DateTime.class, new CustomDateTimeSerializer());
		registerModule(simpleModule);
		setSerializationInclusion(Inclusion.NON_NULL);
		
		
	
	}
}

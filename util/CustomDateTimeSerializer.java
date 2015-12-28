package com.mcnc.yuga.util;

import java.io.IOException;
import java.text.SimpleDateFormat;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.joda.time.DateTime;

public class CustomDateTimeSerializer  extends JsonSerializer<DateTime>{

	@Override
	public void serialize(DateTime dateTime, JsonGenerator generator,
			SerializerProvider serializerProvider) throws IOException,
			JsonProcessingException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		generator.writeString(simpleDateFormat.format(dateTime));
		
	}
}

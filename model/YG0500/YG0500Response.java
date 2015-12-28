package com.mcnc.yuga.model.YG0500;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import com.mcnc.smart.hybrid.common.server.JsonAdaptorObject;
import com.mcnc.yuga.model.header.YGHeader;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * YG0500
Overtime Message Code.
 */
public class YG0500Response {
	/**
	 * header object
	 */
	private YGHeader header = null;
	/**
	 * body object
	 */
	private YG0500Response_Body body = null;

	public YG0500Response() {
	}

	public YG0500Response(JsonAdaptorObject obj) {
		JsonNode rootNode = obj.get(JsonAdaptorObject.TYPE.RESPONSE);
		JsonNode headerNode = rootNode.path("header");
		this.header = new YGHeader(headerNode);
		JsonNode bodyNode = rootNode.path("body");
		this.body = new YG0500Response_Body(bodyNode);
	}

	@JsonProperty("header")
	public YGHeader getHeader() {
		return this.header;
	}

	public void setHeader(YGHeader header) {
		this.header = header;
	}

	@JsonProperty("body")
	public YG0500Response_Body getBody() {
		return this.body;
	}

	public void setBody(YG0500Response_Body body) {
		this.body = body;
	}

	public JsonNode toJsonNode() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.valueToTree(this);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0500Response [");
		builder.append("header=").append(header);
		builder.append(", ");
		builder.append("body=").append(body);
		builder.append("]");
		return builder.toString();
	}
}
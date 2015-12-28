package com.mcnc.yuga.model.YG0400;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.ObjectMapper;
import com.mcnc.smart.hybrid.common.server.JsonAdaptorObject;
import com.mcnc.yuga.model.header.YGHeader;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * YG0400
Unsubmit Message Code.
 */
public class YG0400Request {
	/**
	 * header object
	 */
	private YGHeader header = null;
	/**
	 * body object
	 */
	private YG0400Request_Body body = null;

	public YG0400Request() {
	}

	public YG0400Request(JsonAdaptorObject obj) {
		JsonNode rootNode = obj.get(JsonAdaptorObject.TYPE.REQUEST);
		JsonNode headerNode = rootNode.path("header");
		this.header = new YGHeader(headerNode);
		JsonNode bodyNode = rootNode.path("body");
		this.body = new YG0400Request_Body(bodyNode);
	}

	@JsonProperty("header")
	public YGHeader getHeader() {
		return this.header;
	}

	public void setHeader(YGHeader header) {
		this.header = header;
	}

	@JsonProperty("body")
	public YG0400Request_Body getBody() {
		return this.body;
	}

	public void setBody(YG0400Request_Body body) {
		this.body = body;
	}

	public JsonNode toJsonNode() {
		ObjectMapper mapper = new ObjectMapper();
		return mapper.valueToTree(this);
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0400Request [");
		builder.append("header=").append(header);
		builder.append(", ");
		builder.append("body=").append(body);
		builder.append("]");
		return builder.toString();
	}
}
package com.mcnc.yuga.model.YG0100;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0100Request_Body {
	/**
	 * start
	 */
	private Integer start = null;
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * end
	 */
	private Integer end = null;

	public YG0100Request_Body() {
	}

	public YG0100Request_Body(JsonNode jsonNode) {
		this.start = jsonNode.path("start").getIntValue();
		this.userID = jsonNode.path("userID").getTextValue();
		this.end = jsonNode.path("end").getIntValue();
	}

	@JsonProperty("start")
	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("end")
	public Integer getEnd() {
		return this.end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0100Request_Body [");
		builder.append("start=").append(start);
		builder.append(", ");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("end=").append(end);
		builder.append("]");
		return builder.toString();
	}
}
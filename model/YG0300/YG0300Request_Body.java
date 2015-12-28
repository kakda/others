package com.mcnc.yuga.model.YG0300;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0300Request_Body {
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * end
	 */
	private Integer end = null;
	/**
	 * start
	 */
	private Integer start = null;

	public YG0300Request_Body() {
	}

	public YG0300Request_Body(JsonNode jsonNode) {
		this.userID = jsonNode.path("userID").getTextValue();
		this.end = jsonNode.path("end").getIntValue();
		this.start = jsonNode.path("start").getIntValue();
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

	@JsonProperty("start")
	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("YG0300Request_Body [");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("end=").append(end);
		builder.append(", ");
		builder.append("start=").append(start);
		builder.append("]");
		return builder.toString();
	}
}
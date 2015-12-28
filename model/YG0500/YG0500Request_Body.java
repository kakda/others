package com.mcnc.yuga.model.YG0500;


import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Comment
 */
public class YG0500Request_Body {
	/**
	 * userID
	 */
	private String userID = "";
	/**
	 * start
	 */
	private Integer start = null;
	/**
	 * end
	 */
	private Integer end = null;

	public YG0500Request_Body() {
	}

	public YG0500Request_Body(JsonNode jsonNode) {
		this.userID = jsonNode.path("userID").getTextValue();
		this.start = jsonNode.path("start").getIntValue();
		this.end = jsonNode.path("end").getIntValue();
	}

	@JsonProperty("userID")
	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	@JsonProperty("start")
	public Integer getStart() {
		return this.start;
	}

	public void setStart(Integer start) {
		this.start = start;
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
		builder.append("YG0500Request_Body [");
		builder.append("userID=").append(userID);
		builder.append(", ");
		builder.append("start=").append(start);
		builder.append(", ");
		builder.append("end=").append(end);
		builder.append("]");
		return builder.toString();
	}
}